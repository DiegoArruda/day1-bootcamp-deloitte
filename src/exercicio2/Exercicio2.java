package exercicio2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Digite um número para saber se é par ou ímpar.");
        Scanner input = new Scanner(System.in);
        float numero = input.nextFloat();
        if(numero % 2 == 0){
            System.out.println("O número " + numero + " é par");
        } else System.out.println("O número " + numero + " é ímpar");
    }
}
