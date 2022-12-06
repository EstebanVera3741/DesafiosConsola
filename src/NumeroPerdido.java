import java.util.ArrayList;
import java.util.Scanner;

public class NumeroPerdido {
    private ArrayList<Integer> numeros = new ArrayList<Integer>();

    public NumeroPerdido() {
        try{
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 2; i++){
                numeros.add(scanner.nextInt());
            }
        }
        catch (Exception e){
            System.out.println("Solo se puede escribir numeros enteros");
        }

    }

    public void numerosPerdidos (){
        try {
            Integer valorUno = numeros.get(0);
            Integer valorDos = numeros.get(1);
            Integer valor;

            if (valorUno < valorDos) {
                for (int i = valorUno; i < valorDos - 1; i++) {
                    valor = i + 1;
                    System.out.println(valor);
                }
            } else {
                for (int i = valorDos; i < valorUno - 1; i++) {
                    valor = i + 1;
                    System.out.println(valor);
                }
            }
        }
        catch (Exception e){

        }
    }
}
