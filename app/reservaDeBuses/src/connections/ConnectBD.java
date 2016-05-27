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
import java.sql.SQLException;
import java.sql.Statement;
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
        String connect = "jdbc:mysql://localhost/reserva?" + "user=" + user + "&password=" + password + "";
        return connect;
    }

    private Connection Open() throws ClassNotFoundException, IOException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(getConnectionString());
            return conn;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return conn;
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

   // <editor-fold defaultstate="collapsed" desc="Methods database">
    public ResultSet getData(String sql) {
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try {
            Connection conn = Open();
            preparedStatement = conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            resultSet.close();
            preparedStatement.close();
            conn.close();
            return resultSet;
        } catch (Exception exc) {
            return resultSet;
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

    // </editor-fold>

}
