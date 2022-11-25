import java.util.Arrays;

public class Anagrama {
    private String [] palabraUno;
    private String [] palabraDos;

    public Anagrama (String palabraUno, String palabraDos){
        this.palabraUno = palabraUno.split("");
        this.palabraDos = palabraDos.split("");
        String resultadoPalabraUno = verificarPalabrasIguales(this.palabraUno);
        String resultadoPalabraDos = verificarPalabrasIguales(this.palabraDos);
        if(resultadoPalabraUno.equals(resultadoPalabraDos)){
            System.out.println("las palabras son iguales");
        }
        else {
            boolean resultado = verificarCantidadLetras(this.palabraUno, this.palabraDos);
            System.out.println(resultado);
        }
    }
    public boolean verificarCantidadLetras (String [] palabraUno, String [] palabraDos){
        boolean resultado = false;
        Arrays.sort(palabraUno); Arrays.sort(palabraDos);
        String resultadoPalabraUno = recorrerArregloPalabras(palabraUno);
        String resultadoPalabraDos = recorrerArregloPalabras(palabraDos);

        if (resultadoPalabraUno.equals(resultadoPalabraDos)){
            resultado = true;
        }
        return resultado;
    }
    public String verificarPalabrasIguales (String [] palabra){
        String resultado = "";
        for (String letras : palabra){
            resultado += letras;
        }
        return resultado;
    }
    public String recorrerArregloPalabras (String [] palabra){
        String resultado = "";
        for (String letras : palabra){
            resultado += letras;
        }
        return resultado;
    }
}
