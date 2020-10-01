package com.cash.users.controllers;

import com.cash.users.repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/loans")
public class LoansController {
    @Autowired
    private LoanRepository loanRepository;

    @PostMapping("/")
    public
}
