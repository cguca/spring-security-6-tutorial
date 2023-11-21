package com.chicobanana.eazybank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/myBalance")
    public ResponseEntity<String> getBalanceDetails() {
        return ResponseEntity.ok("Here are the balance details from the DB");
    }
}
