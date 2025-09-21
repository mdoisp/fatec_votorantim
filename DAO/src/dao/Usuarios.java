/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Alunos
 */
public class Usuarios {
    private String login;
    private String senha;
    private int numAgencia;
    private int numCC;
    
    public String dadosSQLInsert(){
        String dadosUser;
        dadosUser = "'"
                +this.getSenha() + "','"
                +this.getNumAgencia() + "','"
                +this.getNumCC() + "'";
        return dadosUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public int getNumCC() {
        return numCC;
    }

    public void setNumCC(int numCC) {
        this.numCC = numCC;
    }
}
