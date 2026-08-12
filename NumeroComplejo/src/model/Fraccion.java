package model;

public class Fraccion {
    private int numerador;
    private int denominador;
    
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
           System.out.println("El denominador no puede ser cero. Se asignó 1 por defecto.");
           denominador = 1;
        }
        this.numerador = numerador;
        this.denominador = denominador;
        System.out.println("Fracción creada: " + this.numerador + "/" + this.denominador);
    }

    public Fraccion sumar (Fraccion f){
        int nuevoNumerador = this.numerador* f.denominador + f.numerador* this.denominador;
        int nuevoDenominador = this.denominador*f.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion restar (Fraccion f){
        int nuevoNumerador = this.numerador* f.denominador - f.numerador* this.denominador;
        int nuevoDenominador = this.denominador*f.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion multiplicar (Fraccion f){
        int nuevoNumerador = this.numerador* f.numerador;
        int nuevoDenominador = this.denominador*f.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion dividir (Fraccion f){
        int nuevoNumerador = this.numerador*f.denominador;
        int nuevoDenominador = this.denominador*f.numerador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public String formato(){
        if (denominador == 1){
            return String.valueOf(numerador);
        }
        return numerador + " / "+ denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }


}

