public class Estandar extends Habitacion{
    public Estandar(int id, String nombre, double tarifa_Base, int noches) {
        super(id, nombre, tarifa_Base, noches);
        this.tarifa_Base=total;
        generarRecibo();
    }


}
