package desafio01;

import java.util.Scanner;

public class Fibonacci{

    
    public static void verificaFibonacci(int numero){
        int a = 0, b = 1, next = 0;

        if (numero == 0 || numero == 1){
            System.out.println("O número pertence à sequência de Fibonacci.");
        }

        while (next < numero){
            next = a + b;
            a = b;
            b = next;
        }

        if (next == numero){

            System.out.println("O número pertence a sequência de Fibonacci.");

        } else {

            System.out.println("O número não pertence a sequência de Fibonacci.");

        }
    }


    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        

       verificaFibonacci(numero);

        scanner.close();
    }
}
