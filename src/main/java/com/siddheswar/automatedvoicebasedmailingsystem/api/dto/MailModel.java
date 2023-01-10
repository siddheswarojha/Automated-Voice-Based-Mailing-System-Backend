package com.siddheswar.automatedvoicebasedmailingsystem.api.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;
import javax.persistence.Entity;

@Getter
@Setter
@Entity

public class MailModel extends AbstractPersistable<Long> {
    private String subject;
    private String body;
    private String recipient;

}
