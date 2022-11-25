public class Fibonacci {

    public Fibonacci(){
        long primerNumero = 0;
        long segundoNumero = 1;
        long sumaNumeros = 0;

        for (int i = 0; i < 50; i++){
            System.out.println(primerNumero);
            sumaNumeros = primerNumero + segundoNumero;
            primerNumero = segundoNumero;
            segundoNumero = sumaNumeros;
        }
    }
}
