public class Switch {
    public static void main(String[] args) {
        int estacion=1;
        switch(estacion){
           case 1:
           case 2:
           case 3:
           System.out.println("es primavera");
           break;
           
           case 4:
           case 5:
           case 6:
           System.out.println("es verano");
           break;
                      
           case 7:
           case 8:
           case 9:
           System.out.println("es otoño");
           break;
                      
           case 10:
           case 11: 
           case 12:
           System.out.println("es invierno");
           break;
           default:
           System.out.println("estacion incorrecta");
           break; 
        }
    }
}
