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
public class BusDao {
    
    private ConnectBD _connection = new ConnectBD();

    public ArrayList consultarBus() {
        String sql = "SELECT "
                + "    PLACA, "
                + "    TIPO, "
                + "    MODELO, "
                + "    MARCA, "
                + "    DISPONIBILIDAD, "
                + "    CODIGO "
                + "FROM "
                + "    bus";
        return _connection.getData(sql);
    }

    public boolean modificarBus(String codigo,String placa,String tipo,String modelo,String idTipoBus,String marca,String disp) {
        String sql = "UPDATE "
                        + "    bus "
                        + "SET "
                        + "    PLACA = '" + placa + "', "
                        + "    MODELO = '" +modelo + "', "
                        + "    MARCA = '"  + marca + "', "
                        + "    DISPONIBILIDAD = " + disp + ", "
                        + "    IDTIPOBUS = " +  tipo + ""
                        + "WHERE "
                        + "    CODIGO = " + codigo + "";
        return _connection.sendSetData(sql);
    }
    
     public boolean AgregarBus(String codigo,String placa,String tipo,String modelo,String idTipoBus,String marca,String disp) {
        String sql = "INSERT "
                        + "INTO "
                        + "    bus "
                        + "    ( "
                        + "        PLACA, "
                        + "        MODELO, "
                        + "        MARCA, "
                        + "        DISPONIBILIDAD, "
                        + "        CODIGO, "
                        + "        IDTIPOBUS "
                        + "    ) "
                        + "    VALUES "
                        + "    ( "
                        + "        '', "
                        + "        '', "
                        + "        '', "
                        + "        0, "
                        + "        0, "
                        + "        0 "
                        + "    )";
        return _connection.sendSetData(sql);
    }
    
    
}
