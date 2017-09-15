package br.ufpi.es.usuarios.dados;

import br.ufpi.es.usuarios.entidade.Usuario;
import java.util.*;

public class RepositorioListaUsuarios implements UserInterface {
    private List<Usuario> usuariosDAO = new ArrayList();

    public RepositorioListaUsuarios(){
        System.out.println("Repositorio Criado");
    }

    public void adicionarUsuario(Usuario user){
        usuariosDAO.add(user);
    }

    public String listarUsuarios(){
        String dados = "";
        for(int i = 0; i < usuariosDAO.size(); i++) {
            dados += "Nome: " + usuariosDAO.get(i).getNome() +
                    " Matricula: " + usuariosDAO.get(i).getMatricula() +
                    " Idade: " + usuariosDAO.get(i).getIdade() + "\n";
        }
        return dados;
    }
}
