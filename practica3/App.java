package practica3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println("El resultado es: "+divide(5, 0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        accederNovenoElemento();
        leerArchivo();
    }
    public static double divide(double a, double b) throws ArithmeticException
    {
        if(b == 0)
        {
            throw new ArithmeticException("No se puede dividir entre cero ");
        }
        return a / b;
    }
    public static void accederNovenoElemento(){
        int[] array = new int[6];
        try {
            //accediendo al noveno elemento
            int elemento = array[8];
            System.out.println("El noveno elemento es: "+elemento);
        
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void leerArchivo(){
        try {
            File archivo = new File("ruta_archivo.txt");
            Scanner scanner = new Scanner(archivo);
            scanner.close();
        } catch (FileNotFoundException  e) {
            System.out.println(e.getMessage());
        }
    }
}
