import java.io.OptionalDataException;

public class NumerosRomanos {

    private String [] numerosRomanos = {"M", "CMXC", "CM", "D", "CDXC", "CD", "C",
            "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private Integer [] numeroEntero = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public NumerosRomanos () {}

    public String convertirNumeroRomanos (Integer numero) {
        StringBuilder numeroRomano = new StringBuilder();
        int i = 0;
        while (numero > 0 || numeroEntero.length == (i - 1)) {
            while ((numero - numeroEntero[i]) >= 0) {
                numero -= numeroEntero[i];
                numeroRomano.append(numerosRomanos[i]);
            }
            i++;
        }
        return numeroRomano.toString();
    }

}
