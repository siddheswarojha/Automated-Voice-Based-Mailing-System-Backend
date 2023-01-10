package com.siddheswar.automatedvoicebasedmailingsystem.api.services;


import com.siddheswar.automatedvoicebasedmailingsystem.api.dto.MailAddModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServices {


    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}") private String sender;
    public String sendMail(MailAddModel mailAddModel) {


            // Try block to check for exceptions
            try {

                // Creating a simple mail message
                SimpleMailMessage mailMessage
                        = new SimpleMailMessage();

                mailMessage.setFrom(sender);
                mailMessage.setTo(mailAddModel.getRecipient());
                mailMessage.setText(mailAddModel.getBody());
                mailMessage.setSubject(mailAddModel.getSubject());


                javaMailSender.send(mailMessage);
                return "Mail Sent Successfully...";
            }


            catch (Exception e) {
                return e.getMessage();
            }
        }

    }
