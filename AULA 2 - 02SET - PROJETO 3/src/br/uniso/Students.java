package br.uniso;

import java.io.Serializable;

//para gravar um objeto java em arquivo, precisa de implements serializable, para poder salvar em disco
public class Students implements Serializable {

    private String nome;
    private int idade;
    private String curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
