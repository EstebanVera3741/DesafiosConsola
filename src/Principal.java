import javax.swing.*;
import java.util.Scanner;

public class Principal {

    public static String joptionPane (String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
    public static Integer lecturaEntero (String mensaje){
        return Integer.parseInt(joptionPane(mensaje));
    }
    public static String lecturaString (String mensaje){
        return joptionPane(mensaje);
    }

    public static void menuPrincipal () {
        Integer opcion = lecturaEntero("--------------Desafios Consola--------------"+
                "\n Puedes seleccionar algun desafio" +
                "\n     1). FizzBuzz" +
                "\n     2). Anagrama" +
                "\n     3). Numeros Romanos" +
                "\n     4). Fibonacci" +
                "\n     5). Cuantos Dias" +
                "\n     6). Numero Perdido" +
                "\n     7). Segundo Numero" +
                "\n     8). Numero Primo" +
                "\n  ");
        switch (opcion){
            case 1:
                FizzBuzz fizzBuzz = new FizzBuzz();
                break;
            case 2:
                Anagrama anagrama = new Anagrama(lecturaString("Ingrese la Primera Palabra"),
                        lecturaString("Ingrese la Segunda Palabra"));
                break;
            case 3:
                NumerosRomanos numerosRomanos = new NumerosRomanos();
                try{
                    String numeroRomano = numerosRomanos.convertirNumeroRomanos(
                            lecturaEntero("Ingrese el numero para convertir a Romano"));
                    JOptionPane.showMessageDialog(null, "El numero romano: " + numeroRomano);
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Ingrese solo numeros enteros");
                }
                break;
            case 4:
                Fibonacci fibonacci = new Fibonacci();
                break;
            case 5:
                CuantosDias cuantosDias = new CuantosDias(
                        lecturaString("Digita la fecha de esta forma 'dd/mm/yyyy' \n" +
                                "Ingresa la Primera fecha"),
                        lecturaString("Ingrese la Segunda fecha"));
                break;
            case 6:
                NumeroPerdido numeroPerdido = new NumeroPerdido();
                numeroPerdido.numerosPerdidos();
                break;
            case 7:
                SegundoNumero segundoNumero = new SegundoNumero();
                break;
            case 8:
                NumeroPrimo numeroPrimo = new NumeroPrimo(lecturaEntero("Ingrese el numero"));
                break;

        }
    }

    public static void main(String[] args) {
        menuPrincipal();
    }

}
