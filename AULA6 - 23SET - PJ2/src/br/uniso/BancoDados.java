package br.uniso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BancoDados {

    public static void main(String args[]){



        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://34.225.155.37:3306/tiopalma_sempermissao",
                    "root", "rootdotiozao");



            PreparedStatement ps = c.prepareStatement("insert into ALUNO(ra, primeiro_nome, sobrenome, idade) values " +
                    "(?, ?, ?, ?)");

            ps.setInt(1, 123123123);
            ps.setString(2, "Matheus");
            ps.setString(3, "Goes");
            ps.setInt(4, 40);

            ps.executeUpdate();

            ps.close();
            c.close();

            //c.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

}

