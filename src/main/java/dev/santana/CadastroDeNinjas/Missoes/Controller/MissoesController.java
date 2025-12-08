package dev.santana.CadastroDeNinjas.Missoes.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping("/exibir")
    public List<MissoesModel> exibirMissoes(){
        return missoesService.listarMissoes();
    }
    @GetMapping("/exibir/{id}")
    public MissoesModel exibirPorId(@PathVariable Long id){
        return missoesService.listarMissoesPorId(id);
    }

    @PostMapping("/criar")
    public MissoesModel criarMissoes(@RequestBody MissoesModel missoes){
        return missoesService.criarMissao(missoes);
    }

    @PutMapping("/alterar")
    public String alterarMissoes(){
        return "Missao alterada com sucesso";
    }

    @DeleteMapping("/deletar")
    public void deletarMissoes(@PathVariable Long id){
        missoesService.deletarMissaoPorId(id);
    }
}
