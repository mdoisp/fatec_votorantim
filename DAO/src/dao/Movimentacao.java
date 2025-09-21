/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Alunos
 */
public class Movimentacao {
    private int numAgencia;
    private int numCC;
    private int idHist;
    private int valor;
    private int saldo;
    private String data;
    private String numDoc;
    private char debCred;
    private String compleHist;
    
    public String dadosSQLInsert(){
        String dadosMov;
        dadosMov = "'"
                +this.getNumCC() + "','"
                +this.getIdHist() + "','"
                +this.getValor() + "','"
                +this.getSaldo() + "','"
                +this.getData() + "','"
                +this.getNumDoc() + "','"
                +this.getDebCred() + "','"
                +this.getCompleHist() + "','";
        return dadosMov;
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

    public int getIdHist() {
        return idHist;
    }

    public void setIdHist(int idHist) {
        this.idHist = idHist;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public char getDebCred() {
        return debCred;
    }

    public void setDebCred(char debCred) {
        this.debCred = debCred;
    }

    public String getCompleHist() {
        return compleHist;
    }

    public void setCompleHist(String compleHist) {
        this.compleHist = compleHist;
    }
}
