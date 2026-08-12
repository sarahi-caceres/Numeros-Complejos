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
    }
    public Fraccion Sumar (Fraccion fraccion2){
        Fraccion fraccionSuma(0,0);

        
        return fraccionSuma;
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

}

