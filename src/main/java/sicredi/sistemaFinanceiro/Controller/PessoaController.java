package sicredi.sistemaFinanceiro.Controller;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sicredi.sistemaFinanceiro.Pessoa.DadosPessoa;
import sicredi.sistemaFinanceiro.Pessoa.Pessoa;
import sicredi.sistemaFinanceiro.Pessoa.RepositoryPessoa;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    @Autowired
    private RepositoryPessoa repositoryPessoa;

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosPessoa pessoa){

        repositoryPessoa.save(new Pessoa(pessoa));
    }
}
