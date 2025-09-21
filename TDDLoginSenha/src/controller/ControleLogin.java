package controller;
import model.Usuario;

public class ControleLogin {
    private Usuario usuario;
    
    public ControleLogin(Usuario usuario){
        this.usuario = usuario;
    }
    public boolean verificalogin(String login, String senha){
        return this.usuario.getLogin().equals(login) && this.usuario.getSenha().equals(senha);
    }
}
