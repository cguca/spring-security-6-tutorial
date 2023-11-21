package com.chicobanana.eazybank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/contact")
    public ResponseEntity<String> getContactInquiryDetails() {
        return ResponseEntity.ok("Inquiry details are saved from the DB");
    }
}
