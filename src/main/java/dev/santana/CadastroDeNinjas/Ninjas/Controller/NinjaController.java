package dev.santana.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ninjas")
public class NinjaController {

    // Mostrar todos os ninjas (READ)
    @GetMapping("/exibir")
    public String mostrarTodosOsNinjas(){
        return "Mostrar Ninja";
    }

    // Mostrar todos os ninjas por ID(READ)
    @GetMapping("/exibirID")
    public String mostrarTodosOsNinjasPorId(){
        return "Mostrar Ninjas Por ID";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarDadosPorId(){
        return "Alterar dados";
    }

    // Deletear Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarPorId(){
        return "Deletar por ID";
    }
}
