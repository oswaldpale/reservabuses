package controller;


import java.util.ArrayList;
import java.util.Random;
import model.BusDao;

public class Bus {
    
    private BusDao bus = new BusDao();
    public boolean AgregarBus(String codigo,String placa,String tipo,String modelo,String idTipoBus,String marca,String disp) {
       return bus.AgregarBus(codigo, placa, tipo, modelo, idTipoBus, marca, disp);
    }
    public boolean modificarBus(String codigo,String placa,String tipo,String modelo,String idTipoBus,String marca,String disp){
       return bus.modificarBus(codigo, placa, tipo, modelo, idTipoBus, marca, disp);
    }
    public ArrayList consultarBus(String codigo,String placa,String tipo,String modelo,String idTipoBus,String marca,String disp){
       return bus.consultarBus();
    }


    }
