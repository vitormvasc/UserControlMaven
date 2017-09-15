package br.ufpi.es.usuarios.visao;

import br.ufpi.es.usuarios.controle.ControladorUsuarios;

public class TelaPrincipal {

    public static void main(String []args) {
        ControladorUsuarios controle = new ControladorUsuarios();

        controle.CriaUsuario("Ana", 10, 1000);
        controle.CriaUsuario("Bruno", 20, 2000);
        controle.CriaUsuario("Carlos", 30, 3000);
        controle.CriaUsuario("Diana", 40, 4000);
        controle.CriaUsuario("Elias", 50, 5000);

        System.out.println(controle.Listar());
    }
}
