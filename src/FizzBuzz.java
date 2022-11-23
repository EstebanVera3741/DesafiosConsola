public class FizzBuzz {

    public FizzBuzz (){
        Integer cantidadNumeros = 100;
        for (Integer i = 1; i <= cantidadNumeros; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else if (i % 3 == 0){
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
