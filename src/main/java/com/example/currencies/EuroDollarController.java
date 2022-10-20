package com.example.currencies;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EuroDollarController {

    @GetMapping("/eurodollar")
    public String eurodollar(double euro) {
        return String.format("%.2f€ in USD: %.2f$", euro, euro*0.98);
    }
}
