package contabancaria;

public class Conta {
    char tipoConta;
    float saldoConta;
    char statusConta;
    String extrato = "Meu Extrato:";

    public Conta(char tipoConta, float saldoConta, char statusConta) {
        this.tipoConta = tipoConta;
        this.saldoConta = saldoConta;
        this.statusConta = statusConta;
    }

    public char getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(char tipoConta) {
        this.tipoConta = tipoConta;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public char getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(char statusConta) {
        this.statusConta = statusConta;
    }
    
    public void depositar(float deposito){
        saldoConta += deposito;
        extrato += "\n Depósito: "+ deposito;
    }
    public void sacar(float saque){
        saldoConta -= saque;
        extrato += "\n Saque :"+ saque;
    }
    public void taxar(){
        if (this.tipoConta == 'P'){
            saldoConta -= 9.99f;
            extrato += "\n Taxa: "+ 9.99f;
        }
        else if(this.tipoConta == 'C'){
            saldoConta -= 19.99f;
            extrato += "\n Taxa: "+ 19.99f;
        }
    }
    public float verificarSaldo(){
    return getSaldoConta();
    }
    public String extrato(){
        return extrato;
    }
}