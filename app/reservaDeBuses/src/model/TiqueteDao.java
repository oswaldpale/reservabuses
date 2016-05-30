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
 * @author ing christian
 */
public class TiqueteDao {
     private  ConnectBD _connection = new ConnectBD();
    
     public ArrayList consultarTiquete(String idtiquete,String idcedula) {
        String sql = "SELECT "
                     + "    IDTIQUETE, "
                     + "    PRECIO, "
                     + "    IDCIUDAD_ORIGEN, "
                     + "    IDCIUDAD_DESTINO, "
                     + "    IDBUS, "
                     + "    CANTIDAD_ASIENTO "
                     + "FROM "
                     + "    tiquete";
        return _connection.getData(sql);
    }
     
     public boolean agregarTiquete(String idtiquete,String cantidad_asiento, String precio) {
         String sql =  "INSERT "
                            + "INTO "
                            + "    tiquete "
                            + "    ( "
                            + "        IDTIQUETE, "
                            + "        PRECIO, "
                            + "        IDCIUDAD_ORIGEN, "
                            + "        IDCIUDAD_DESTINO, "
                            + "        IDBUS, "
                            + "        CANTIDAD_ASIENTO "
                            + "    ) "
                            + "    VALUES "
                            + "    ( "
                            + "        0, "
                            + "        0, "
                            + "        0, "
                            + "        0, "
                            + "        0, "
                            + "        0 "
                            + "    )";
         return _connection.sendSetData(sql);
     } 
     
      public boolean  modificarTiquete(String idtiquete,String cantidad_asiento, String precio) {
         String sql =   "UPDATE "
                                + "    tiquete "
                                + "SET "
                                + "    IDTIQUETE = 0, "
                                + "    PRECIO = 0, "
                                + "    IDCIUDAD_ORIGEN = 0, "
                                + "    IDCIUDAD_DESTINO = 0, "
                                + "    IDBUS = 0, "
                                + "    CANTIDAD_ASIENTO = 0 "
                                + "WHERE "
                                + "    IDTIQUETE = <condition>";
         return _connection.sendSetData(sql);
     } 
}
