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
    @Column(name = "id")
    private Long id;

    @Column(name = "missão")
    private String nome;

    @Column(name = "rank")
    private RankMissoes rank;

    @Column(name = "dificuldade")
    private RankMissoes dificuldade;

    //@OneToMany Uma missao para varios ninjas
    @OneToMany(mappedBy = "missoesModel")
    private List<NinjaModel> ninjaModel;
}
