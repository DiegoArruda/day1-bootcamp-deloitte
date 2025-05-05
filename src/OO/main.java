package OO;

public class main {
    public static void main(String[] args) {
        Pessoa jovem = new Pessoa();
        jovem.nome = "Tiago";
        jovem.idade = 15;
        jovem.maiorDeIdade(jovem.idade);

        Pessoa adulto = new Pessoa();
        adulto.nome = "Paulo";
        adulto.idade = 36;

        if(jovem.idade<adulto.idade){
            System.out.println("O jovem é mais novo que o adulto");
        }else System.out.println("O jovem é mais velho que o adulto");

    }
}
