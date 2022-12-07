import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SegundoNumero {

    private List<Integer> listaNumeros = new ArrayList<>();
    private Integer [] arregloNumeros = new Integer[0];

    public SegundoNumero() {
        agregarNumerosLista();
    }

    public void agregarNumerosLista (){

        for (int i = 0; i < 5; i++){
            listaNumeros.add(Integer.valueOf(JOptionPane.showInputDialog("Ingresa el numero")));
        }
        convertirNumerosArreglo();
    }

    public void convertirNumerosArreglo (){
        arregloNumeros = listaNumeros.toArray(listaNumeros.toArray(new Integer[0]));
        Arrays.sort(arregloNumeros);
        Integer segundoNumero = 0;
        for (int i = 0; i < arregloNumeros.length - 1; i++){
            segundoNumero = arregloNumeros [i];
        }
        JOptionPane.showMessageDialog(null, "El segundo mayor numero es : " + segundoNumero);
    }
}
