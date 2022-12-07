import javax.swing.*;

public class Fibonacci {

    public Fibonacci(){
        long primerNumero = 0;
        long segundoNumero = 1;
        long sumaNumeros;
        String secuenciaFibonacci = "";

        for (int i = 0; i < 20; i++){
            secuenciaFibonacci += primerNumero + "\n";
            sumaNumeros = primerNumero + segundoNumero;
            primerNumero = segundoNumero;
            segundoNumero = sumaNumeros;
        }
        JOptionPane.showMessageDialog(null, "       Secuencia Fibonacci      \n" +
                secuenciaFibonacci);
    }
}
