package vehiculos;

public class MainClassVeh {

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("1234 BCD", "Opel", "Astra");
        Vehiculo v2 = new Vehiculo("2345 CDE", "BMW", "S1");
        Vehiculo v3 = new Vehiculo("3456 DEF", "Audi", "A3");

        v1.setMarcha(5);
        v1.setLuces(true);
        System.out.println(v1.toString());
    }
}