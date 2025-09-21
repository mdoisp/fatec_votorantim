/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Alunos
 */
public class Clientes {
    private int codClientes;
    private String nome;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String fone;
    private String cpf;
    private String dataNascimento;
    private String cnpj;
    
    public String dadosSQLInsert(){
        String dadosClientes;
        dadosClientes = "'"
                +this.getNome() + "','"
                +this.getEndereco() + "','"
                +this.getNumero() + "','"
                +this.getComplemento() + "','"
                +this.getBairro() + "','"
                +this.getCidade() + "','"
                +this.getEstado() + "','"
                +this.getCep() + "','"
                +this.getFone() + "','"
                +this.getCpf() + "','"
                +this.getDataNascimento() + "','"
                +this.getCnpj() + "'";
        return dadosClientes;
    }
    
    public String alterarDadosSQLValue(){
        String dadosClientes;
        dadosClientes = "NOME='"
                +this.getNome() + "',ENDERECO='"
                +this.getEndereco() + "',NUMERO='"
                +this.getNumero() + "',COMPLEMENTO='"
                +this.getComplemento() + "',BAIRRO='"
                +this.getBairro() + "',CIDADE='"
                +this.getCidade() + "',ESTADO='"
                +this.getEstado() + "',CEP='"
                +this.getCep() + "',FONE='"
                +this.getFone() + "',CPF='"
                +this.getCpf() + "',DATANASCIMENTO'"
                +this.getDataNascimento() + "',CNPJ'"
                +this.getCnpj() + "'";
        return dadosClientes;
    }

    public int getCodClientes() {
        return codClientes;
    }

    public void setCodClientes(int codClientes) {
        this.codClientes = codClientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
            
    public Clientes(){
    }
}
