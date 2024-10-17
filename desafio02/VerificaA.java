package desafio02;

import java.util.Scanner;

public class VerificaA{

    public static void contarA(String texto){
        
        int contador = 0;

        for (int i = 0; i < texto.length(); i++){

            char c = texto.charAt(i);

            if (c == 'a' || c == 'A'){
                contador++;
            }

        }



        if (contador > 0){

            System.out.printf("A letra 'a' aparece %d vezes.",contador);
        }else{

            System.out.println("A letra 'a' não aparece na string.");
        }
    }


    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um texto: ");
        String texto = scanner.nextLine();

        contarA(texto);

        scanner.close();
    }
}