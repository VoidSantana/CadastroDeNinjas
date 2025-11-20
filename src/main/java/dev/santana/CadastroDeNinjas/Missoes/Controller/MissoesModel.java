package dev.santana.CadastroDeNinjas.Missoes.Controller;

import dev.santana.CadastroDeNinjas.Ninjas.Controller.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private String nome;
    private RankMissoes rank;
    private String dificuldade;

    //@OneToMany Uma missao para varios ninjas
    @OneToMany(mappedBy = "missoesModel")
    private List<NinjaModel> ninjaModel;


}
