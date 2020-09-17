package br.uniso;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]){

        //Listas

        ArrayList<String> lista = new ArrayList();

        //ArrayList novalista = new ArrayList(); defini o tipo de dados de uma lista
        //quando nao defino um tipo pra lista, eu trato como generico, object, e qualquer tipo pode ser tratado na lista

        lista.add("mattheus ferreira");
        lista.add("droga é o braia");
        lista.add("Woooow");
        lista.add(1, "lalalalala");


        for(Object i: lista) {
            System.out.println(i);
        }


        //verifica se esta vazio
        boolean teste = lista.isEmpty();
        System.out.println(teste);

        //conta a quantidade de elementos da lista
        int elementos = lista.size();
        System.out.println(elementos);

        lista.clear(); //clear vai limpar a lista

        lista.add("adicionei depois de ter dado empty");

        System.out.println(lista.get(0));


    }
}
