package sicredi.sistemaFinanceiro.Pessoa;

import jakarta.validation.constraints.NotNull;
import sicredi.sistemaFinanceiro.Endereco.DadosEndereco;

public record DadosPessoa(
        @NotNull String nome,
        @NotNull DadosEndereco endereco) {
}
