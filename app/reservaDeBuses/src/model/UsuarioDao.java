/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connections.ConnectBD;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Usuario TI
 */
public class UsuarioDao {
    private  ConnectBD _connection = new ConnectBD();
    public ArrayList consultarUsuario(String login){
    String sql = "SELECT "
                    + "    NOMBRE, "
                    + "    APELLIDOS, "
                    + "    CONTRASENA "
                    + "FROM "
                    + "    usuario "
                    + "WHERE LOGIN='" + login + "'";
    
        return _connection.getData(sql);
    }
}
