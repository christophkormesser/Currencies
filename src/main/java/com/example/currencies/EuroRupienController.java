package com.example.currencies;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EuroRupienController {
    @GetMapping("/eurorupien")
    public String eurorupien(double euro) {
        return String.format("%.2f€ in Rupien: %.2f", euro, euro*81.01);
    }

    @GetMapping("/rupieneuro")
    public String rupieneuro(double rupien) {
        return String.format("%.2fR in Euro: %.2f€", rupien, rupien*0.012);
    }
}
