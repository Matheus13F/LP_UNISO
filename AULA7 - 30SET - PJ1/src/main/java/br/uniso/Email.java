package br.uniso;

import javax.mail.*;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class Email {

    public static void main(String[] args){

        final String remetente = "matheuscontabruta@gmail.com";
        final String senha = "m13t01h97";
        final String destinatario = "mth.goes@gmail.com";

        // definir propriedades do servidor de emailzzzz
        
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");

        props.put("mail.smtp.socketFactory.port", "465");

        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        props.put("mail.smtp.auth", "true");

        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,

                new javax.mail.Authenticator() {

                    protected PasswordAuthentication getPasswordAuthentication() {

                        return new PasswordAuthentication(remetente, senha);
                    }
                });


        // mensagem pra enviar
        MimeMessage message = new MimeMessage(session);

        try {
            // Preparo da mensagem propriamente dita
            message.addHeader("Content-type", "text/HTML");
            //message.addHeader("Content-Transfer-Encoding", "8bit");
            message.setSubject("Email teste da Uniso", "UTF-8");
            message.setSentDate(new Date());
            message.setText("No meio do caminho havia uma pedra. Havia uma pedra no meio do caminho");
            message.setRecipients(Message.RecipientType.TO, destinatario);
            message.setFrom(remetente);

            //envio
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}