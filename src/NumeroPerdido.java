import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class NumeroPerdido {
    private ArrayList<Integer> numeros = new ArrayList<Integer>();

    public NumeroPerdido() {
        try{
            for (int i = 0; i < 2; i++){
                numeros.add(Integer.valueOf(JOptionPane.showInputDialog("Ingrese el numero")));
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Solo se puede escribir numeros enteros");
        }

    }

    public void numerosPerdidos (){
        try {
            Integer valorUno = numeros.get(0);
            Integer valorDos = numeros.get(1);
            String valor = "";

            if (valorUno < valorDos) {
                for (int i = valorUno; i < valorDos - 1; i++) {
                    valor += i + 1 + "  ";
                }
            } else {
                for (int i = valorDos; i < valorUno - 1; i++) {
                    valor += i + 1 + "  ";
                }
            }
            JOptionPane.showMessageDialog(null, valor);
        }
        catch (Exception e){

        }
    }
}
