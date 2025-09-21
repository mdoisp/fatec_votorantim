package controller;
import model.*;
import views.*;

public class Main {

    public static void main(String[] args) {
        Usuario user = new Usuario("Admin","Senha123");
        ControleLogin cl = new ControleLogin(user);
        String testeLogin = "Admin";
        String testeLogin2 = "AdminErro";
        String testeSenha = "Senha123";
        String testeSenha2 = "SenhaErro";
        if(cl.verificalogin(testeLogin2, testeSenha2)){
            System.out.println("Logado com sucesso");
        }else{
            System.out.println("Credenciais incorretas");
        }
        /*Login login = new Login();
        login.setVisible(true);*/
    }
    
}
