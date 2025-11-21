package dev.santana.CadastroDeNinjas.Missoes.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController {
    @GetMapping("/missoes")
    public String missoesController(){
        return "Missoes Controller";
    }
}
