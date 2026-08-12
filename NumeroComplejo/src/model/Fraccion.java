package model;

public class Fraccion {
    private int numerador;
    private int denominador;
    
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
           System.out.println("Advertencia: denominador no puede ser cero. Se asignó 1 por defecto.");
           denominador = 1;
        }
        this.numerador = numerador;
        this.denominador = denominador;
        System.out.println("Fracción creada: " + this.numerador + "/" + this.denominador);
    }

    

}

