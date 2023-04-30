public class Ejercicio3 {
    public static  void main(String[] args) { 
        //
        String[] nombres = {"Juan", "Pedro", "Maria", "Jose", "Ana"};
        String nombres2="";
        int i = 0;
        while (i < nombres.length) {
            nombres2 += nombres[i]+",";
            i++;
        }
        System.out.print(nombres2);
    }   
}
