package com.example.currencies;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EuroBitcoinController {
    @GetMapping("/eurobitcoin")
    public String eurobitcoin(double euro) {
        return String.format("%.2f€ in Bitcoin: %f", euro, euro*0.000051);
    }

    @GetMapping("/bitcoineuro")
    public String bitcoineuro(double bitcoin) {
        return String.format("%.2fBTC in Euro: %f€", bitcoin, bitcoin * 19438.74);
    }
}
