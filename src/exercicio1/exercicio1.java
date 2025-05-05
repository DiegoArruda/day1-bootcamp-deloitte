package exercicio1;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        System.out.println("Digite dois numeros para imprimir a soma deles: ");
        Scanner input = new Scanner(System.in);
        float numero1 = input.nextFloat();
        float numero2 = input.nextFloat();

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é " + (numero1+numero2));
    }
}
