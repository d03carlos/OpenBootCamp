package example;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println("El resultado es: "+divide(5, Double.parseDouble(args[0])));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static double divide(double a, double b) throws ArithmeticException
    {
        if(b == 0)
        {
            throw new ArithmeticException("No se puede dividir entre cero ");
        }
        return a / b;
    }

}