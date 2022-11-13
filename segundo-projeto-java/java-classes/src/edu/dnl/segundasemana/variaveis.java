package edu.dnl.segundasemana;

//Exemplo de uma pequena calculadora 
//13-11-2022

public class variaveis {


    //metodo publico que realiza a soma.

    public static int somar(int numero1,int numero2){
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
