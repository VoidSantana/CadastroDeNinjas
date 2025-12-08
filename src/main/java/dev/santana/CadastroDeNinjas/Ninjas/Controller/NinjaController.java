package dev.santana.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/exibir")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // Mostrar todos os ninjas por ID(READ)
    @GetMapping("/exibir/{id}")
    public NinjaModel mostrarTodosOsNinjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjasPorId(id);
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterar/{id}")
    public NinjaModel alterarDadosPorId(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado){
        return ninjaService.atualizarDados(id, ninjaAtualizado);
    }

    // Deletear Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarPorId(@PathVariable Long id){
        ninjaService.deletarNinjaPorId(id);
    }
}
