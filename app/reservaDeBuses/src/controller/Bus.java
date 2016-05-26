package controller;


import java.util.Random;

public class Bus {
    public String placa= "";
    public String marca= "";
    public String modelo= "";
    public String tipo[]={"Coomotor", "PonyTrasport", "Laboyana", "Bolivariano", "Santanderiano", "Capitalino"};
    public String horario[] = {"12:00 pm", "01:00 pm", "02:00 pm", "03:00 pm", "04:00 pm", "05:00 pm", "06:00 pm",
                    "07:00 pm", "08:00 pm", "09:00 pm", "10:00 pm", "11:00 pm", "12:00 am", "01:00 am", "02:00 am",
                    "03:00 am", "04:00 am", "05:00 am", "06:00 am", "07:00 am", "08:00 am ", "09:00 am", "10:00 am",
                    "11:00 am"};
    public boolean disponibilidad = true;
    public int capacidad = 30;
    public double precio[]={30.000, 40.000, 50.000, 35.900, 42.000, 48.000, 32.000};
    public Asiento silla = new Asiento();
    
    public String ConsultarBus(String FechaSalida, int CantidadPasajero){
        Random ran = new Random();        
        int aleatorioPrecio = ran.nextInt(precio.length); 
        int aleatorioTipo = ran.nextInt(tipo.length);            
        return "Bus = "+tipo[aleatorioTipo]+"       Fecha Salida = "+FechaSalida+"         Precio = "+precio[aleatorioPrecio]*CantidadPasajero;
    }
    
    public String ConsultarHorario(){
        Random ran = new Random();        
        int aleatorioHorario = ran.nextInt(horario.length);
        return "Hora: "+horario[aleatorioHorario];
    }
    
    
}
