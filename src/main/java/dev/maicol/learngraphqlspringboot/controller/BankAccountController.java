package dev.maicol.learngraphqlspringboot.controller;

import dev.maicol.learngraphqlspringboot.entity.bank.BankAccount;
import dev.maicol.learngraphqlspringboot.entity.bank.Currency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
@Slf4j
public class BankAccountController {

    @QueryMapping
    public BankAccount bankAccount(@Argument UUID id) {
        log.info("Getting account {}", id);
        return BankAccount.builder()
                .id(id)
                .name("Maicol")
                .currency(Currency.CHF)
                .build();
    }
}
