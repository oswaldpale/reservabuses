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
public class ViajeDao {
    private  ConnectBD _connection = new ConnectBD();
    
     public boolean agregarViaje(String idViaje, String fecha, String idreserva, String idciudadorigen, String idciudaddestino, String precio) {
         String sql =  "INSERT "
                            + "INTO "
                            + "    viaje "
                            + "    ( "
                            + "        IDVIAJE, "
                            + "        FECHA, "
                            + "        IDRESERVA, "
                            + "        IDCIUDADORIGEN, "
                            + "        IDCIUDADDESTINO, "
                            + "        PRECIO "
                            + "    ) "
                            + "    VALUES "
                            + "    ( "
                            + "        0, "
                            + "        '', "
                            + "        0, "
                            + "        0, "
                            + "        0, "
                            + "        0 "
                            + "    )";
        return _connection.sendSetData(sql);
    }
    public ArrayList consultarViaje(String idviaje, String fecha, String idreserva, String ciudadorigen, String ciudaddestino, String precio) {
        String sql = "SELECT "
                        + "    IDVIAJE, "
                        + "    FECHA, "
                        + "    IDRESERVA, "
                        + "    IDCIUDADORIGEN, "
                        + "    IDCIUDADDESTINO, "
                        + "    PRECIO "
                        + "FROM "
                        + "    viaje";
        return _connection.getData(sql);
    }
    

}
