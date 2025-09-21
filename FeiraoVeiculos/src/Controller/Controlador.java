package Controller;

import Model.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Controlador implements Serializable {
    private int id;
    private List<Veiculos> listaVeiculos;
    private List<Pessoa> listaPessoas;
    
    public Controlador(){
        id = 0;
        listaVeiculos = new ArrayList<Veiculos>();
        listaPessoas = new ArrayList<Pessoa>();
    }
    
    public void cadastrarPessoa(String nome, String telefone, String cpf){
        listaPessoas.add(new Cliente(nome, telefone, cpf));
    }
}
