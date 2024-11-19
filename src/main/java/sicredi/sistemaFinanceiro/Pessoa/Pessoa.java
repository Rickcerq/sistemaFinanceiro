package sicredi.sistemaFinanceiro.Pessoa;

import jakarta.persistence.*;
import sicredi.sistemaFinanceiro.Endereco.Endereco;

@Table(name = "pessoa")
@Entity(name="Pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String nome;

    private Boolean ativo;

    @Embedded
    private Endereco endereco;

    public Pessoa(DadosPessoa dados){
        this.nome = dados.nome();
        this.ativo = Boolean.TRUE;
        this.endereco = new Endereco(dados.endereco());
    }

}
