package com.siddheswar.automatedvoicebasedmailingsystem.api.controller;


import com.siddheswar.automatedvoicebasedmailingsystem.api.dto.MailAddModel;
import com.siddheswar.automatedvoicebasedmailingsystem.api.services.MailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("vbms/api/v1/")
public class MailController {

    @Autowired
    MailServices mailServices;

    @PostMapping("sendMail/")
    public String sendMail(@RequestBody MailAddModel mailAddModel){
        return mailServices.sendMail(mailAddModel);
    }
}
