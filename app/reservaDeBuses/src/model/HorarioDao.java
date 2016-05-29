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
 * @author JULIO
 */
public class HorarioDao {
    private  ConnectBD _connection = new ConnectBD();
    public ArrayList consultarHorario() {
       String sql = "SELECT "
                        + "    CODIGO, "
                        + "    HORA "
                        + "FROM "
                        + "    horario";
        return _connection.getData(sql);
    }
    
}
