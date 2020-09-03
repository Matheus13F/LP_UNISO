package br.uniso;

import java.io.*;

public class ObjectFileReader {

    public static void main(String args[]) {
        File file = new File("arquivoObjetos.bin");
        //fluxo de entrada, vem do HD para memoria
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            Students s1 = (Students) ois.readObject();
            Students s2 = (Students) ois.readObject();

            String StudentName1 = s1.getNome();
            String StudentName2 = s2.getNome();

            System.out.println(StudentName1);
            System.out.println(StudentName2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
