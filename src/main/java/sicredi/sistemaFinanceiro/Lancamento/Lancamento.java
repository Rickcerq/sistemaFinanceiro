package sicredi.sistemaFinanceiro.Lancamento;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import sicredi.sistemaFinanceiro.Categoria.Categoria;
import sicredi.sistemaFinanceiro.Pessoa.Pessoa;


import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name = "lancamento")
@Entity(name = "Lançamento")
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String descricao;

    @Column(name = "data_vencimento")
    private LocalDate dataVencimento;

    @Column(name = "data_pagamento")
    private LocalDate dataPagamento;

    private BigDecimal valor;

    private String observacao;

    @Enumerated(EnumType.STRING)
    private TipoLançamento tipo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_categoria")
    private @NotNull Categoria categoria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_pessoa")
    private Pessoa pessoa;

    public Lancamento(DadosLancamento dados){
        this.descricao = dados.descricao();
        this.dataVencimento = dados.dataVencimento();
        this.dataPagamento = dados.dataPagamento();
        this.valor = dados.valor();
        this.observacao = dados.observacao();
        this.tipo = dados.tipo();
        this.categoria = new Categoria(dados.categoria());
        this.pessoa = new Pessoa(dados.pessoa());
    }
}
