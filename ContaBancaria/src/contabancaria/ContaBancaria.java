package contabancaria;

public class ContaBancaria {

    public static void main(String[] args) {
        Cliente cli = new Cliente("Matheus", "111.111.111-11", "Jd Archila");
        Conta con = new Conta('C', 5000.49f, 'A');
        System.out.println(cli.getNome());
        con.depositar(3000.50f);
        con.sacar(1500.00f);
        con.taxar();
        System.out.println(con.verificarSaldo());
        System.out.println(con.extrato);
    }
}
