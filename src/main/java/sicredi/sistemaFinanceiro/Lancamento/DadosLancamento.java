package sicredi.sistemaFinanceiro.Lancamento;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import sicredi.sistemaFinanceiro.Categoria.DadosCategoria;
import sicredi.sistemaFinanceiro.Pessoa.DadosPessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

public record DadosLancamento(@NotNull String descricao,
                              @NotNull LocalDate dataVencimento,
                              LocalDate dataPagamento,
                              @NotNull BigDecimal valor,
                              String observacao,
                              @NotNull TipoLançamento tipo,
                              @NotNull @Valid DadosCategoria categoria,
                              @NotNull @Valid DadosPessoa pessoa
                              ) {
}
