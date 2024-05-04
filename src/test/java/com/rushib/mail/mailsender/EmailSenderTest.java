package com.rushib.mail.mailsender;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
public class EmailSenderTest {

    @Autowired
    private EmailService emailService;


    @Test
    void emailSendTest() {
        System.out.println("sending email");
        emailService.sendEmail("rushikeshbdev@gmail.com", "Rushi Spring Test", "Test Message from Spring service");
    }

    @Test
    void htmlEmailSendTest() {
        String htmlContent = "" +
                "<h1 style='color:red;border:1px solid red;'>Welcome to Rushi's world</h1>";
        emailService.sendEmailWithHtml("rushikeshbdev@gmail.com", "HTML Email using Spring app", htmlContent);
    }

    @Test
    void sendEmailWithFile() {
        emailService.sendEmailWithFile("rushikeshbdev@gmail.com", "Email with File",
                "Rushi spring file test", new File("/Users/rushikeshb/bep/mail-sender/src/main/resources/static/images/RushiST.jpeg"));
    }
}
