package OO;

public class main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Tiago";
        pessoa1.idade = 15;
        pessoa1.maiorDeIdade(pessoa1.idade);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Paulo";
        pessoa2.idade = 36;

        System.out.println((pessoa1.idade < pessoa2.idade) ? pessoa1.nome + " é mais novo que " + pessoa2.nome :
                pessoa1.nome + " é mais velho que " + pessoa2.nome );

    }
}
