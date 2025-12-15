package dev.santana.CadastroDeNinjas.Ninjas.Controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.santana.CadastroDeNinjas.Missoes.Controller.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//Entity transforma uma classe em uma entidade do banco de dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private int idade;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "imgUrl")
    private String imgUrl;

    @Column(name = "rank")
    private String rank;

    // @ManyToOne um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreing Key - Chave extrangeira
    @JsonIgnore
    private MissoesModel missoesModel;


}
