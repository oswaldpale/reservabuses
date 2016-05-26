public class Viaje {

    int num = 0;
    private String ciudadOrigen;
    private String ciudadDestino;
    private String fecha;
    private String hora;
    String ciudades[] = {"Amazonas", "Bogota", "Cali", "Medellin", "Barranquilla", "Pasto", "Florencia", "Neiva",
                        "Armenia", "Cucuta", "Ibague", "Pereira", "Choco"};
    Bus bus = new Bus();

    public void AgregarViaje(int num, String ciudadOrigen, String ciudadDestino, String fecha, String hora) {
        this.num = num;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.fecha = fecha;
        this.hora = hora;
        num++;
    }

    public void ModificarViaje(String ciudadOrigen, String ciudadDestino, String fecha, String hora) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String ConsultarViaje(String fecha, int cantidadPasajeros) {
        String mostrar = bus.ConsultarBus(fecha, cantidadPasajeros);
        return mostrar;
    }
}
