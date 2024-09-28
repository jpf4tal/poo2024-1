package org.example;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String login;
    private String senha;
    private static List<Usuario> usuarios = new ArrayList<>();

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
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

    public boolean validarLogin(String login, String senha) throws LoginInvalidoException {
        return this.senha.equals(senha);
    }

    public static Usuario loginU(String login, String senha) throws LoginInvalidoException {
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login)) {
                usuario.validarLogin(login, senha);
                System.out.println("Login realizado com sucesso!");
                return usuario;
            }
        }
        throw new LoginInvalidoException("Usuário não encontrado!");
    }
    public static void cadastrarUsuario(String login, String senha) throws LoginInvalidoException {
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login)) {
                throw new LoginInvalidoException("Login já existe!");
            }
        }
        usuarios.add(new Usuario(login, senha));
        System.out.println("Usuário cadastrado com sucesso!");
    }
}
