package com.example.adruinoapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdruinoController {

    @GetMapping("/onLight")
    public ResponseEntity<Integer> turnOnLight(){
        return ResponseEntity.ok(5);
    }

    @GetMapping("/offLight")
    public ResponseEntity<Integer> turnOffLight(){
        return ResponseEntity.ok(0);
    }

    @GetMapping("/")
    public ResponseEntity<Integer> start(){
        return ResponseEntity.ok(1);
    }
}
