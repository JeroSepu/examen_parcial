public class Habitacion implements recibo {
    protected static int contadorHabitacion = 0;
    private double habitaciones;
    protected String nombre;
    private final int id;
    protected double tarifa_Base;
    protected int noches;
    protected double total;

    public Habitacion(int id, String nombre, double tarifa_Base, int noches) {
        contadorHabitacion = contadorHabitacion + 1;
        this.id = contadorHabitacion;
        this.nombre = nombre;
        this.tarifa_Base = tarifa_Base;
        this.noches = noches;
        this.total = total;
    }

    @Override
    public String generarRecibo() {
        String recibo = "----- RECIBO CITA #" + id + " -----\n";
        recibo = recibo + "Cliente: " + nombre + "\n";
        recibo = recibo + "Barbero: " + noches + "\n";
        recibo = recibo + "Total a pagar: $" + total + "\n";
        return recibo;
    }

    public void numeroDeHabitaciones(double habitaciones) {
        if (contadorHabitacion > 5) {
            throw new NumeroDeHbitacionesException(
                    "No puedes reservar mas de 5 Habitaciones.");
        }
    }
       private void noches(int noches){
            if (noches > 0) {
                throw new NochesNegativasException(
                        "No puedes reservar menos de una noche.");
        }
    }
}


