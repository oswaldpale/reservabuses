/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;



/**
 *
 * @author Usuario TI
 */
public class ConnectBD {
    private Properties prop = new Properties();
   
    private String getConnectionString() throws FileNotFoundException, IOException {
        FileReader reader = new FileReader("src\\BDproperties.properties");
        prop.load(reader);
        String user = prop.getProperty("user");
        String password = prop.getProperty("pasword");
        String connect = "jdbc:mysql://192.168.1.41:3306/reserva?" + "user=" + user + "&password=" + password + "";
        return connect;
    }

    private Connection Open() throws ClassNotFoundException, IOException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String cadenaBD = getConnectionString();
            conn = DriverManager.getConnection(cadenaBD);
            return conn;

        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        return null;
    }

   // <editor-fold defaultstate="collapsed" desc="Methods database">
    public ArrayList getData(String sql) {
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try {
            Connection conn = Open();
            preparedStatement = conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
             ArrayList list =  resultSetToArrayList(resultSet);
            resultSet.close();
            preparedStatement.close();
             conn.close();
           
           
            return list;
        } catch (Exception exc) {
            return null;
        }
    }

    public boolean sendSetData(String sql) {
        Statement st;
        try {
            Connection conn = Open();
            st = conn.createStatement();
            if (st.executeUpdate(sql)>1) {
                st.close();
                conn.close();
                return true;
            }
           
        } catch (Exception e) {
            e.printStackTrace();           
        }
        return false;
    }
     public boolean sendSetDataTransaction(List<String> sentences) {
        int ammountsql = sentences.size();
        int correctsql = 0;
        Connection conn = null;
        PreparedStatement prepared = null;
        try {
            conn = Open();
            conn.setAutoCommit(false);

            for (String sql : sentences) {
                String element = (String) sql;
                correctsql = correctsql + 1;
                conn.prepareStatement(element);
                if (prepared.executeUpdate() > 0) {
                    correctsql = correctsql + 1;
                }
            }
            
            if (ammountsql == correctsql) {
                conn.commit();
            } else {
                conn.rollback();
            }
            conn.setAutoCommit(true);
        } catch (Exception e) {
            
            e.printStackTrace();
            if (conn != null) {
                try {
                    conn.rollback();
                    conn.setAutoCommit(true);
                } catch (SQLException excep) {
                    e.printStackTrace();
                }
            }
        }

        return false;
    }

   

    // <editor-fold defaultstate="collapsed" desc="Convert Resultset a ArrayList"> 
    public ArrayList resultSetToArrayList(ResultSet rs) throws SQLException {
        ResultSetMetaData md = rs.getMetaData();
        int columns = md.getColumnCount();
        ArrayList results = new ArrayList();

        while (rs.next()) {
            HashMap row = new HashMap();
            results.add(row);

            for (int i = 1; i <= columns; i++) {
                row.put(md.getColumnName(i), rs.getObject(i));
            }
        }
        return results;
    }
    // </editor-fold>
}
