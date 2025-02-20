package com.develhope.demo.EserciziDevelhopeSito.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*Scrivi una applicazione web Spring Boot che alla endpoint GET
 v1/ciao?nome=Giuseppe&provincia=Lombardia risponde con "Ciao Giuseppe, com'è il tempo in Lombardia?"
 */

@RestController
@RequestMapping("/v1")
public class Ciao {

    @GetMapping("/ciao")
    public String saluto (@RequestParam (required = false) String name,
                          @RequestParam  String province) {
        return "Ciao " + name + " com'è il tempo in " + province + "?";
    }



}
