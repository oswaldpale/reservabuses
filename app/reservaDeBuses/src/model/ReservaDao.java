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
public class ReservaDao {
        private  ConnectBD _connection = new ConnectBD();
    
     public boolean agregarReserva(String idcedula, String fecha,String idtiquete, String idpersona, String idbus, String idusuario) {
         String sql = "INSERT "
                        + "INTO "
                        + "    reserva "
                        + "    ( "
                        + "        IDRESERVA, "
                        + "        FECHA, "
                        + "        ESTADO, "
                        + "        IDTIQUETE, "
                        + "        IDPERSONA, "
                        + "        IDUSUARIO, "
                        + "        IDVIAJEDESTINO, "
                        + "        IDVIAJEORIGEN, "
                        + "        IDBUS "
                        + "    ) "
                        + "    VALUES "
                        + "    ( "
                        + "        0, "
                        + "        '', "
                        + "        0, "
                        + "        0, "
                        + "        0, "
                        + "        0, "
                        + "        0, "
                        + "        0, "
                        + "        0 "
                        + "    )";
        return _connection.sendSetData(sql);
    }
    public ArrayList consultarReserva(String idcedula, String idtiquete) {
        String sql =  "SELECT "
                        + "    IDRESERVA, "
                        + "    FECHA, "
                        + "    ESTADO, "
                        + "    IDTIQUETE, "
                        + "    IDPERSONA, "
                        + "    IDUSUARIO, "
                        + "    IDVIAJEDESTINO, "
                        + "    IDVIAJEORIGEN, "
                        + "    IDBUS "
                        + "FROM "
                        + "    reserva";
        return _connection.getData(sql);
    }
    
   public boolean modificarReserva(String idcedula, String fecha,String idtiquete, String idpersona, String idbus, String idusuario, String idviajedestino, String idviajeorigen, String estado, String idreserva){
       String sql = "UPDATE "
                        + "    reserva "
                        + "SET "
                        + "    IDRESERVA = 0, "
                        + "    FECHA = '', "
                        + "    ESTADO = 0, "
                        + "    IDTIQUETE = 0, "
                        + "    IDPERSONA = 0, "
                        + "    IDUSUARIO = 0, "
                        + "    IDVIAJEDESTINO = 0, "
                        + "    IDVIAJEORIGEN = 0, "
                        + "    IDBUS = 0 "
                        + "WHERE "
                        + "    IDRESERVA = <condition>";
       return _connection.sendSetData(sql);
   }
 
}
