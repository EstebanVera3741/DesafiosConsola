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

    public static void menuPrincipal (){
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
        }



    }


    public static void main(String[] args) {
        menuPrincipal();
    }
}
