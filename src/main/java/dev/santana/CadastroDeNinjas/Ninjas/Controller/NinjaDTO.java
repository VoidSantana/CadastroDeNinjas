package dev.santana.CadastroDeNinjas.Ninjas.Controller;

import dev.santana.CadastroDeNinjas.Missoes.Controller.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {


    private Long id;
    private String nome;
    private String email;
    private String imgUrl;
    private int idade;
    private MissoesModel missoes_Id;
    private String rank;
}
