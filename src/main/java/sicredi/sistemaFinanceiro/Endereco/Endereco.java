package sicredi.sistemaFinanceiro.Endereco;

public class Endereco {
    private String logadouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco(DadosEndereco endereco) {
        this.logadouro = endereco.logradouro();
        this.numero = endereco.numero();
        this.complemento = endereco.complemento();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.cidade = endereco.cidade();
        this.estado = endereco.estado();

    }
}
