package dev.santana.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    // Listar Todos Os Meus Ninjas
    public List<NinjaModel> listarNinjas (){
        return ninjaRepository.findAll();
    }
    //Exibir Ninjas por Id
    public NinjaModel listarNinjasPorId (Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }
    //Criar Ninja
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }
    //Deletar Ninja
    public void deletarNinjaPorId (Long id){
        ninjaRepository.deleteById(id);
    }
    //Atualizar Ninja
    public NinjaModel atualizarDados(Long id, NinjaModel ninjaAtualizado){
        if (ninjaRepository.existsById(id)){
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
    }
}