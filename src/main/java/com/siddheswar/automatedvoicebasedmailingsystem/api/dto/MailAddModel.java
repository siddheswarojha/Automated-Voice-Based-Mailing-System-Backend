package com.siddheswar.automatedvoicebasedmailingsystem.api.dto;


import lombok.Getter;

@Getter
public class MailAddModel {
    private String subject;
    private String body;
    private String recipient;
}

