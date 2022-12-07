import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CuantosDias {

    private String primeraFecha, segundaFecha;

    public CuantosDias(String primeraFecha, String segundaFecha){
        this.primeraFecha = primeraFecha;
        this.segundaFecha = segundaFecha;
        convertirFormatoFecha();
    }
    public void convertirFormatoFecha  () {

        String formatoFecha = "dd/mm/yyyy";
        SimpleDateFormat formatoConvertido = new SimpleDateFormat(formatoFecha);
        Integer dias = 0;
        try {
            Date fechaUno = formatoConvertido.parse(primeraFecha);
            Date fechaDos = formatoConvertido.parse(segundaFecha);

            dias = (int) ((fechaDos.getTime() - fechaUno.getTime()) /86400000);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Digita la fecha de esta forma 'dd/mm/yyyy'");
        }
        JOptionPane.showMessageDialog(null, "Hay " + dias + " dias de diferencia entre las fechas");
    }
}
