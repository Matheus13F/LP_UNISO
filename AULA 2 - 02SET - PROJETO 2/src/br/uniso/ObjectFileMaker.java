package br.uniso;

import java.io.*;

public class ObjectFileMaker {

    public static void main(String args[]) {

        File file = new File("ArquivoObjetos.bin");
        try {

            file.createNewFile();
            Students s1 = new Students();
            s1.setCurso("Sistinfo");
            s1.setNome("Matheus");
            s1.setIdade(23);

            Students s2 = new Students();
            s2.setCurso("Sistinfo");
            s2.setNome("Bianca");
            s2.setIdade(20);

            OutputStream os = new FileOutputStream(file);

            //fluxo de saida especial para gravar objetos
            ObjectOutputStream oos = new ObjectOutputStream(os);
            //para escrever objetos,usamos writeObject
            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
