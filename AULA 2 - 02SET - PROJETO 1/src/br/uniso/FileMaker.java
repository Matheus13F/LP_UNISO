package br.uniso;

import java.io.*;

public class FileMaker {

    //nesse projeto iremos criar o arquivo ao inves de lê-lo
    //vamos popula-lo
    public static void main(String args[]){

        String s = "String cobaia";
        String s2 = "Bora jogar um GTA5";
        String s3 = "E ganhar milhoes";

        String vetor[] = new String[3];

        vetor[0] = s;
        vetor[1] = s2;
        vetor[2] = s3;

        //arquivo nao existe ainda, vamo cria-lo

        File f = new File("arquivoTeste.txt");
        try {

            f.createNewFile();

            OutputStream os = new FileOutputStream(f);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
           // bw.write(s);
            for(String cada : vetor) {
                bw.write(cada + "\n");
            }

            //zera o buffer
            //sempre usar flush, se nao nao roda
            //o flush é especifico para serialização
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
