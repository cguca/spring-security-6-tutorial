package com.chicobanana.eazybank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/myLoans")
    public ResponseEntity<String> getLoanDetails() {
        return ResponseEntity.ok("Here are the loan details from the DB");
    }
}
