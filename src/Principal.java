import java.util.Scanner;

public class Principal {

    public static Scanner scanner (){
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
    public static Integer lecturaEntero (){
        Integer numero = scanner().nextInt();
        return numero;
    }
    public static String lecturaString (){
        String palabra = scanner().nextLine();
        return palabra;
    }

    public static void menuPrincipal () {
        Integer opcion = lecturaEntero();
        switch (opcion){
            case 1:
                FizzBuzz fizzBuzz = new FizzBuzz();
                break;
            case 2:
                Anagrama anagrama = new Anagrama(lecturaString(), lecturaString());
                break;
            case 3:
                NumerosRomanos numerosRomanos = new NumerosRomanos();
                String numeroRomano = numerosRomanos.convertirNumeroRomanos(lecturaEntero());
                System.out.println(numeroRomano);
                break;
            case 4:
                Fibonacci fibonacci = new Fibonacci();
                break;
            case 5:
                CuantosDias cuantosDias = new CuantosDias(lecturaString(), lecturaString());
                break;
            case 6:
                NumeroPerdido numeroPerdido = new NumeroPerdido();
                numeroPerdido.numerosPerdidos();
                break;
            case 7:
                NumeroPrimo numeroPrimo = new NumeroPrimo(lecturaEntero());
                break;

        }
    }

    public static void main(String[] args) {
        menuPrincipal();
    }
}
