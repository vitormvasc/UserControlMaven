package br.ufpi.es.usuarios.controle;

import br.ufpi.es.usuarios.dados.RepositorioListaUsuarios;
import br.ufpi.es.usuarios.entidade.Usuario;

public class ControladorUsuarios {
    private Usuario user;
    private RepositorioListaUsuarios repositorio;

    public ControladorUsuarios(){
        System.out.println("Controlador Criado");
        this.repositorio = new RepositorioListaUsuarios();
    }

    public void CriaUsuario(String nome, int idade, int matricula){
        this.user = new Usuario(nome, idade, matricula);
        repositorio.adicionarUsuario(user);
    }

    public String Listar(){
        return repositorio.listarUsuarios();
    }
}
