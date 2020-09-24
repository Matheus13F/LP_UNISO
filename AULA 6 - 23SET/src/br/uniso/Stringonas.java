package br.uniso;

public class Stringonas {

    public static void main(String arg[]) {

        //problemas das strings
        String teste = "matheus 13";

        //modelo ineficiente de criar strings
        //String teste2 = new String("uniso");

        teste = teste.toUpperCase();
        System.out.println(teste);

        //StringBuffer faz a mesma coisa que string normal
        //ela nao e imutavel, é uma stringona normal

        StringBuffer sb = new StringBuffer("Teste Buffer");
        sb.setCharAt(2, 'W');
        System.out.println(sb);
    }
}
