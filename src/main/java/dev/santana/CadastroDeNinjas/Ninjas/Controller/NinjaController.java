package dev.santana.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/exibir")
    public ResponseEntity<List<NinjaDTO>> listarNinjas(){
        List<NinjaDTO> ninjas = ninjaService.listarNinjas();
        return ResponseEntity.ok(ninjas);
    }

    // Mostrar todos os ninjas por ID(READ)
    @GetMapping("/exibir/{id}")
    public ResponseEntity<?> mostrarTodosOsNinjasPorId(@PathVariable Long id){
        NinjaDTO ninja = ninjaService.listarNinjasPorId(id);
        if (ninja !=null){
            return ResponseEntity.ok(ninja);
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja com id: " + id + " não encontrado em nossos registros");
        }
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja){
        NinjaDTO novoNinja = ninjaService.criarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja Criado Com Sucesso: " + novoNinja.getNome() + " (ID) " + novoNinja.getId());
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarDadosPorId(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado){
        NinjaDTO ninja = ninjaService.atualizarDados(id, ninjaAtualizado);

        if (ninja!=null){
            return ResponseEntity.ok(ninja);
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja não encontrado na base de dados");
        }
    }

    // Deletear Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarPorId(@PathVariable Long id){
        //ninjaService.deletarNinjaPorId(id);
    if (ninjaService.listarNinjasPorId(id) != null){
        ninjaService.deletarNinjaPorId(id);
        return ResponseEntity.ok("Ninja com id: " + id + " deletado com sucesso. ");
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("O Ninja com id: " + id + " Nao foi encontrado");
    }
    }
}