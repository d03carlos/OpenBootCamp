public class ClassPersona {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = "23";
        cliente.nombre = "Hella";
        cliente.telefono = "123456";
        cliente.credito = "1000";
        System.out.println("Datos del Cliente");
        System.out.println("Edad: "+cliente.edad);
        System.out.println("Nombre: "+cliente.nombre);
        System.out.println("Telefono: "+cliente.telefono);
        System.out.println("Credito $: "+cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = "25";
        trabajador.nombre = "Pedro";
        trabajador.telefono = "654321";
        trabajador.salario = "2000";
        System.out.println("Datos del Trabajador");
        System.out.println("Edad: "+trabajador.edad);
        System.out.println("Nombre: "+trabajador.nombre);
        System.out.println("Telefono: "+trabajador.telefono);
        System.out.println("Salario $:" +trabajador.salario);
    }
}
class Persona{
    public String edad;
    public String nombre;
    public String telefono;
}
class Cliente extends Persona{
    public String credito;
}
class Trabajador extends Persona{
    public String salario;
}