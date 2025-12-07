package dev.santana.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar Todos Os Meus Ninjas
    public List<NinjaModel> listarNinjas (){
        return ninjaRepository.findAll();
    }
}
