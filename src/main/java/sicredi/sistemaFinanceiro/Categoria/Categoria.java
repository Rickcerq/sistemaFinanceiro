package sicredi.sistemaFinanceiro.Categoria;

import jakarta.persistence.*;

@Table(name = "categoria")
@Entity(name = "Categoria")

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    public Categoria(DadosCategoria dados) {
        this.nome = dados.nome();
    }
}
