package OO;

public class Pessoa {
    String nome;
    int idade;

    void maiorDeIdade(int idade){
        if (idade>=18){
            System.out.println("Você é maior de idade");
        }else System.out.println("Você é menor de idade");
    }

}
