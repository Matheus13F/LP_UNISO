package br.uniso.lp; //AULA DE QUARTA FEIRA

import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;

public class Teste1 {
    public static void main(String args[]) {

        //ler aquivo em java

        File f = new File("alunos.txt");

        //pegar conteudo do arquivo e jogar na memoria, precisamo de um fluxo de memomira, do disco > memoria

        try {
            InputStream is = new FileInputStream(f);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            //agora vem um momento iconico

            /*
            String cabecalho = br.readLine();
            String primeiralinha = br.readLine();
            String segundalinha = br.readLine();
            String terceiralinha = br.readLine();

            //imprimir na tela
            System.out.println(cabecalho);
            System.out.println(primeiralinha);
            System.out.println(segundalinha);
            System.out.println(terceiralinha);
            */

            //pro, utilizando repeticao para imprimir as variaveis
            String linha = br.readLine();

            while(linha != null){
                //vetor vai querar a linha em 3 partes = matheus; 23; sistinfo
                String vetor[] = linha.split(";"); //split quebrando a linha quando chega no ;

                //exibindo na tela apenas o indice 0
                System.out.println(vetor[1]);
                linha = br.readLine();
                
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
