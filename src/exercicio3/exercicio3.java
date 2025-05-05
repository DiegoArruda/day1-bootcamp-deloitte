package exercicio3;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        System.out.println("Digite suas 3 notas para saber se foi aprovado ou não");

        Scanner input = new Scanner(System.in);
        //nextFloat notes 5,7 OK | 5.7 XX
        float nota1 = input.nextFloat();
        float nota2 = input.nextFloat();
        float nota3 = input.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;


        if(media >= 7){
            System.out.println("Você foi aprovado com " +  media);
        }else System.out.println("Você foi reprovado com " + media);
    }
}
