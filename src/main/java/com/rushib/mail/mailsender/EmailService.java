package com.rushib.mail.mailsender;

import java.io.File;
import java.io.InputStream;

public interface EmailService {

    void sendEmail(String to, String subject, String message);

    void sendEmail(String[] to, String subject, String message);

    void sendEmailWithHtml(String to, String subject, String htmlContent);

    void sendEmailWithFile(String to, String subject, String message, File file);

    void sendEmailWithFile(String to, String subject, String message, InputStream inputStream);

}
