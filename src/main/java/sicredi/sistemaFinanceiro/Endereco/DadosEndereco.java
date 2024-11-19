package sicredi.sistemaFinanceiro.Endereco;

import jakarta.validation.constraints.NotNull;

public record DadosEndereco(@NotNull String logradouro,
                            @NotNull String numero,
                            String complemento,
                            @NotNull String bairro,
                            @NotNull String cep,
                            @NotNull String cidade,
                            @NotNull String estado) {
}
