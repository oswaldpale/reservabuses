/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.HorarioDao;


/**
 *
 * @author Usuario TI
 */
public class Horario {
    private HorarioDao particular = new HorarioDao();
     public ArrayList consultarHorario(){
       return particular.consultarHorario();
    }
}
