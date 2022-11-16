package edu.dnl.terceirasemana;
/**
 * @author Daniel 
 * @version 1.0
 * @since 16/11/2022
 * 
 */

/**
 * Pequena calculadora 
 * realiza a soma e subtração
 * 
 */

public class calculadora {

    //metodo publico que realiza a soma.
    public static int somar(int numero1 ,int numero2){
        return numero1 + numero2;
    }

      //metodo publico que realiza a subtração. 
      public static int subtrair( int numero1,int numero2) {
        return numero1 - numero2;
        
    }
    
    public static void main(String[] args) {
        
        int numero1 = 10;
        int numero2 = 5;
        //chamada do metodo somar e o metodo subtrair 
        // retorno as variaveis resultadoSoma e resultadoSubtração.
        int resultadoSoma = somar(numero1, numero2);
        int resultadoSubtracao = subtrair(numero1, numero2);

        System.out.println("Soma:"+resultadoSoma);
        System.out.println("Subtração:"+resultadoSubtracao);
     }
}
