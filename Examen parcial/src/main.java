public class main {
    private static boolean generarRecibo;

    static void main(String[] args) {
        Habitacion habitacion = new Suite(301,"suite",300.000,2);
        Habitacion habitacion1= new En_oferta(208,"Oferta",100.000,4);
        Habitacion habitacion2= new Estandar(105,"Estandar",150.000,3);
        Habitacion habitacion3=new Suite(402,"suite",280.000,1);
        Habitacion habitacion4=new En_oferta(110,"oferta",90.000,2);
        Habitacion habitacion5= new Estandar(105,"Estandar",150.000,-2);
        
    }
}
