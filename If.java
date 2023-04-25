import java.util.Scanner;
public class If {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");;
        int numero = sc.nextInt();
        if(numero < 0){
            System.out.println("EL numero es negativo");
        } 
        if(numero > 0){
            System.out.println("EL numero es positivo");
        }
        else
        {
            System.out.println("El numero es igual a ");
        }
        sc.close();
    }
}
