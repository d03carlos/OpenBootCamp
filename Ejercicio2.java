import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el precio del producto: ");
        int precio = sc.nextInt();
        PrecioIva(precio);
        sc.close();
    }
    public static void PrecioIva(int precio){
        float iva = precio * 21 / 100;
        System.out.println("El precio del producto con iva es: " + (precio + iva));
    }
}