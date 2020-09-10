package br.uniso;

import java.sql.*;

public class ConexaoJDBC {

    public static void main(String args[]){

        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://34.225.155.37:3306/matheus_ferreira",
                    "matheus_ferreira", "00098398");

            boolean valido = c.isValid(10000);

            System.out.println("conexão validissima: " + valido);
            //a ideia e pegar no java em memoria o conteudo do banco

            Statement s = c.createStatement();

            //executar um select
            ResultSet rs = s.executeQuery("select * from ALUNO");
            while(rs.next()){

                System.out.println("RA: " + rs.getInt("ra"));
                System.out.println("Nome: " + rs.getString("primeiro_nome"));
                System.out.println("Sobrenome: " + rs.getString("sobrenome"));
                System.out.println("Idade: " + rs.getInt("idade"));

            }

            Statement i = c.createStatement();

            //inserção de dados no banco de dados
            //serve nao apenas para update, mas para insert e delete
            //int resultado = i.executeUpdate("insert into ALUNO(ra, primeiro_nome, sobrenome, idade) values " + "(12345, 'Ze', 'Candongas', 78)");

            rs.close();
            s.close();
            i.close();
            

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}


