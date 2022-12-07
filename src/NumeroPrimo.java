public class NumeroPrimo {

    public NumeroPrimo(Integer verificarNumeroPrimo) {
        soyNumeroPrimo(verificarNumeroPrimo);
    }

    public void soyNumeroPrimo (Integer verificarNumeroPrimo){
        String soyPrimo = "No soy numero Primo:  " + verificarNumeroPrimo;
        if (verificarNumero(verificarNumeroPrimo) == true) {
            soyPrimo = "Soy un numero Primo:  " + verificarNumeroPrimo;
        }
        System.out.println(soyPrimo);
    }

    public boolean verificarNumero (Integer verificarNumeroPrimo){

        boolean esNumeroPrimo = false;

        for (int i = 2; i < verificarNumeroPrimo; i++){
            if (verificarNumeroPrimo % i == 0){
                esNumeroPrimo = true;
            }
        }
        return esNumeroPrimo;
    }
}
