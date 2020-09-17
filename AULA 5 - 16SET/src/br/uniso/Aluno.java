package br.uniso;

import java.util.Objects;

public class Aluno {

    private String nome;
    private int ra;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return ra == aluno.ra &&
                idade == aluno.idade &&
                nome.equals(aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ra, idade);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ra=" + ra +
                ", idade=" + idade +
                '}';
    }
}
