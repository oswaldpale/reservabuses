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
public class HorarioDao {
    private  ConnectBD _connection = new ConnectBD();
    
     public boolean agregarHorario(String idCedula, String nombre, String apellido, String telefono, String email, String tarjeta) {
         String sql = "INSERT "
                        + "INTO "
                        + "    persona "
                        + "    ( "
                        + "        CEDULA, "
                        + "        NOMBRE, "
                        + "        APELLIDO, "
                        + "        TELEFONO, "
                        + "        IMAIL, "
                        + "        TARJETA "
                        + "    ) "
                        + "    VALUES "
                        + "    ( "
                        + "        '" + idCedula + "', "
                        + "        '" + nombre   + "', "
                        + "        '" + apellido + "', "
                        + "        '" + telefono + "', "
                        + "        '" + email    + "', "
                        + "        '" + tarjeta  + "' "
                        + "    )";
        return _connection.sendSetData(sql);
    }
    public ArrayList consultarHorario(String cedula) {
        String sql = "SELECT "
                        + "    NOMBRE, "
                        + "    APELLIDO, "
                        + "    TELEFONO, "
                        + "    IMAIL, "
                        + "    TARJETA "
                        + "FROM "
                        + "    persona "
                        + "WHERE  CEDULA='" + cedula + "'";
        return _connection.getData(sql);
    }
    
   public boolean modificarHorario(String idCedula, String nombre, String apellido, String telefono, String email, String tarjeta){
       String sql = "UPDATE "
                        + "    persona "
                        + "SET "
                        + "    NOMBRE = '"   + nombre + "', "
                        + "    APELLIDO = '" + apellido + "', "
                        + "    TELEFONO = '" + telefono +  "', "
                        + "    IMAIL = '"    + email + "', "
                        + "    TARJETA = ' " + tarjeta +  "' "
                        + "WHERE "
                        + "    CEDULA = '" + idCedula + "'";
       return _connection.sendSetData(sql);
   }
}
