package dev.santana.CadastroDeNinjas.Missoes.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @GetMapping("/exibir")
    public String exibirMissoes(){
        return "Missao exibidas com sucesso";
    }

    @PostMapping("/criar")
    public String criarMissoes(){
        return "Missao criada com sucesso";
    }

    @PutMapping("/alterar")
    public String alterarMissoes(){
        return "Missao alterada com sucesso";
    }

    @DeleteMapping("/deletar")
    public String deletarMissoes(){
        return "Missao deletada com sucesso";
    }
}
