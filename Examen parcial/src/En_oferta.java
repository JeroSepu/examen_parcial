public class En_oferta extends Habitacion{
    private double Huespedes;
    private static final int id = contadorHabitacion;
    public En_oferta(int id, String nombre, double tarifa_Base, int noches) {
        super(id, nombre, tarifa_Base, noches);
    }

    public double getHuespedes() {
        return Huespedes;
    }

    public void setHuespedes(double huespedes) {
        Huespedes = huespedes;
    }
    public void tarifa_baja(double huespedes) {
    if (huespedes>50){
        double total = this.tarifa_Base - (double) 15 / 100;
        this.total=total;
    }
    }
}
