package br.uniso;

import java.util.ArrayList;
import java.util.HashSet;

public class MainSet {

    public static void main(String args[]){

        //Set - dados nao podem ser repetidos

        HashSet<Aluno> conjunto = new HashSet<>();

        Aluno a1 = new Aluno();
        a1.setIdade(23);
        a1.setNome("Matheus Ferreira");
        a1.setRa(123456);

        Aluno a2 = new Aluno();
        a2.setIdade(20);
        a2.setNome("Bianca Beloto");
        a2.setRa(123457);

        Aluno a3 = new Aluno();
        a3.setIdade(19);
        a3.setNome("Maria Eduarda");
        a3.setRa(123459);

        Aluno a4 = new Aluno();
        a4.setIdade(19);
        a4.setNome("Maria Eduarda");
        a4.setRa(123459);

        conjunto.add(a1);
        conjunto.add(a2);
        conjunto.add(a3);
        conjunto.add(a4);


        for(Aluno i: conjunto) {
            System.out.println(i);
        }




    }
}
