package dev.santana.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira msg nesta rota";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar Ninja";
    }

    // Mostrar todos os ninjas por ID(READ)
    @GetMapping("/ninjaID")
    public String mostrarTodosOsNinjasPorId(){
        return "Mostrar Ninjas Por ID";
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
