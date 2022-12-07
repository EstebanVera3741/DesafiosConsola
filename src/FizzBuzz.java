import javax.swing.*;

public class FizzBuzz {

    public FizzBuzz (){
        Integer cantidadNumeros = 100;
        String resultado = "";

        for (Integer i = 1; i <= cantidadNumeros; i++){
            if (i % 3 == 0 && i % 5 == 0){
                resultado += " FizzBuzz, \n";
            }
            else if (i % 5 == 0){
                resultado += " Buzz, ";
            }
            else if (i % 3 == 0){
                resultado += " Fizz, ";
            }
            else {
                resultado += " " + i + ", ";
            }
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
