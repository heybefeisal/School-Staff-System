/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ettprojekt;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author emmaj
 */
public class Mejl {

    public static void SkickaMejlet(String till, String amne, String meddelande) {
        //Hämtar objektet 
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true"); //Tillåter gmail att skicka eller ta emot mejl
        props.put("mail.smtp.port", "465");
        String losen = "Javagrupp5";
        String fran = "ettprojekt1@gmail.com";

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fran, losen);
            }
        });

        try {
            //Skapar meddelandet genom att hämta det användaren har skrivit in från fönstret SkickaMejl
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fran));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(till));
            message.setSubject(amne);
            message.setText(meddelande);

            //Skickar mejlet till vald mejladress
            Transport.send(message);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }

}
