package br.uniso;

import java.util.HashMap;

public class MainMap {

    public static void main(String args[]){

        HashMap map = new HashMap();
        map.put(123,"matt");
        map.put(124, "duda");
        map.put(125, "among");

        System.out.println(map.get(123));



        boolean teste = map.isEmpty(); //verifica se esta vazio
        System.out.println(teste);
        map.remove(124); //remove um item do map

        map.clear(); //zera o map

        teste = map.isEmpty();

        System.out.println(teste);

        10

    }
}
