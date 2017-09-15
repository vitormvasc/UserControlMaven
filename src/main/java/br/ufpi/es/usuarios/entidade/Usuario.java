package br.ufpi.es.usuarios.entidade;

public class Usuario {
    private String nome;
    private int idade;
    private int matricula;

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public Usuario(String nome, int idade, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;

        System.out.println("Criado => Nome: " + this.getNome() + " Matricula:" + this.getMatricula() + " Idade: " + this.getIdade());
    }
}