package com.hifility.hifility.controllers;

import com.hifility.hifility.services.IClientService;
import com.hifility.hifility.services.ICreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.Map;

@RestController
public class CreditController {

    @Autowired
    private ICreditService service;

    @PostMapping("/api/credit/create")
    public ResponseEntity<String> createCredit(@RequestBody Map<String, Object> requestBody){
       try{
           service.createCredit(Long.valueOf((String) requestBody.get("clientId")));
           return ResponseEntity.status(HttpStatus.CREATED).body("Credit successfuly created");
       }catch (Exception e){
           System.out.println(e);
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                   .body("Failed to create credit");
       }
    }
    @GetMapping("/api/credit/amount/{clientId}")
    public ResponseEntity<String> createCredit(@PathVariable String clientId){
        try{
            BigDecimal amount = service.findAmountByClientId(Long.valueOf(clientId));
            return ResponseEntity.status(HttpStatus.CREATED).body(MessageFormat.format("{0}",amount));
        }catch (Exception e){
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to retrieve amount");
        }
    }
}
