/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connections.ConnectBD;
import java.util.ArrayList;

/**
 *
 * @author Usuario TI
 */
public class CiudadDao {
    private  ConnectBD _connection = new ConnectBD();
    public ArrayList consultarCiudad(){
        String sql = "SELECT "
                        + "    IDCIUDAD, "
                        + "    CIUDAD "
                        + "FROM "
                        + "    ciudad";
       return _connection.getData(sql);
    }
}
