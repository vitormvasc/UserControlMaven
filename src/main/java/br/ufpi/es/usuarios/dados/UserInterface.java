package br.ufpi.es.usuarios.dados;

import br.ufpi.es.usuarios.entidade.Usuario;
import java.util.ArrayList;

public interface UserInterface {

    public void adicionarUsuario(Usuario user);
    public String listarUsuarios();
}
