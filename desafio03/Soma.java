package desafio03;

public class Soma {
    
    public static void main(String[] args) {
        int indice = 12;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }

        System.out.println(soma);

    }
}
