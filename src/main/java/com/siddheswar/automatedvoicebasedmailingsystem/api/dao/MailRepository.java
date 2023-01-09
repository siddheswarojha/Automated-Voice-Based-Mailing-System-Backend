package com.siddheswar.automatedvoicebasedmailingsystem.api.dao;

import com.siddheswar.automatedvoicebasedmailingsystem.api.dto.MailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailRepository extends JpaRepository<MailModel , Long> {
}
