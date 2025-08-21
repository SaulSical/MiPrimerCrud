package org.datacoins.holakinal;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HolaController {
    @GetMapping("/")
    public String holaKinal(){
        return "Hola Kinal. estoy en SB" ;
    }
}
