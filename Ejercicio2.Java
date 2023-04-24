class Ejercicio2{
    public static void main(String[] args){
        int numPuertas=5;
        Coche miCoche = new Coche(numPuertas);
        miCoche.incrementarPuertas();
        System.out.println("Mi coche tiene:"+miCoche.ImpNumPuertas());

    }
    public static class Coche{
        private int numPuertas;
        
        public  Coche(int numPuertas){
            this.numPuertas=numPuertas;
        }
        public int incrementarPuertas(){
            return numPuertas++;    
        }
        public int ImpNumPuertas(){
            return numPuertas;
        }
    }  
}
