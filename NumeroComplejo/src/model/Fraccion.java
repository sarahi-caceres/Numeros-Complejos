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

    public int SacarMcm(int den1, int den2){
        int mcm=0;
        mcm= den1*den2/ SacarMcd(den1, den2);
        return mcm;

    }
    public int SacarMcd(int den1, int den2){
        int mcd=0;
        int temp=0;
        int mayor=0;
        int menor=0;
        if( den1>=den2){
            mayor=den1;
            menor=den2;
        }
        else{
            mayor=den2;
            menor=den1;
        }
        while(menor!=0){
            temp=menor;
            menor = mayor % menor;
            mayor=temp;

        }
        return mcd;
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

