package Practica20;
public class Main {
    public static void main(String[] args) {
        CrudVehiculo crudVehiculo = new CrudVehiculo();
        Vehiculo[] vehiculos = {
                new Coche(),
                new Moto()};
        //crudVehiculo.guardarVehiculo();
        for(Vehiculo v : vehiculos){
            crudVehiculo.guardarVehiculo(v);
        }
        imprimePotencia(vehiculos);
    }
    public static void imprimePotencia(Vehiculo []vehiculos){
        for(Vehiculo v : vehiculos){
            System.out.println(v.obtenerPotencia());
        }
    }
}
