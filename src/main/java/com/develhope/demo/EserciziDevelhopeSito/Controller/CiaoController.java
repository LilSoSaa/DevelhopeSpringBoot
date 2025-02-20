package com.develhope.demo.EserciziDevelhopeSito.Controller;

import com.develhope.demo.EserciziDevelhopeSito.Entities.User;
import org.springframework.web.bind.annotation.*;

/*Scrivi una applicazione web Spring Boot che alla endpoint GET
 v1/ciao?nome=Giuseppe&provincia=Lombardia risponde con "Ciao Giuseppe, com'è il tempo in Lombardia?"
 */

@RestController
@RequestMapping("/v2")
public class CiaoController {

    @GetMapping("/ciao")
    public String saluto (@RequestParam (required = false, defaultValue = "") String nome,
                          @RequestParam  String provincia) {
        return "Ciao " + nome + " com'è il tempo in " + provincia + "?";
    }


    @GetMapping("/ciao/{provincia}")
    public User getSalutoANDProvincia (@PathVariable String provincia,
                                         @RequestParam(required = false, defaultValue = "Anonimo") String nome) {
        String messaggio = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
        return new User(nome, provincia, messaggio);
    }

}
