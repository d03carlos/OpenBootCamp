package Practica20;

public abstract class Vehiculo {
    private String tipo;

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public Vehiculo() {
    }
    abstract int obtenerPotencia();
}

class Moto extends Vehiculo{
    @Override
    int obtenerPotencia() {
        int potencia = 50;
        return potencia;
    }
}

class Coche extends Vehiculo{
    @Override
    int obtenerPotencia() {
        int potencia = 100;
        return potencia;
    }
}