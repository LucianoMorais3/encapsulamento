import entidades.Conta;

public class Program {
    public static void main(String[] args) {

        Conta c = new Conta();

        c.nome = "joão";
        c.cpf = "12312345678";
        c.depositar(100.0);
        c.sacar(20.00);

        System.out.println(c.nome);
        System.out.println(c.cpf);
        System.out.println(c.getSaldo());

    }
}