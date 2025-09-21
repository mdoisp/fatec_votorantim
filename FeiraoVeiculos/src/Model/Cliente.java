package Model;

public class Cliente extends Pessoa {
    private float valorMax;
    private float valorMin;
    
    public Cliente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }
}
