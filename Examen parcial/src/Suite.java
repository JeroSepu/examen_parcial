public class Suite extends Habitacion{
    private static final int id = contadorHabitacion;
    private double recargos;
    public Suite(int id, String nombre,double tarifa_Base,int noches) {
        super(id, nombre, tarifa_Base, noches);
    }
    public void setRecargos(double recargos) {
    }
    public void tarifa_recargos(double recargos) {
        if (recargos <= 1) {
            double total = this.tarifa_Base + (double) 20 / 100;
            this.total=total;
        }
    }
    }
