import model.Fraccion;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Fraccion f1=new Fraccion(2, 5);
        int a=f1.SacarMcm(9,71);
        int b=f1.SacarMcd(9,71);
        System.out.printf( "a.%d, %d",a,b);
    }
}
