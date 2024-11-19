package sicredi.sistemaFinanceiro.Controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sicredi.sistemaFinanceiro.Lancamento.DadosLancamento;
import sicredi.sistemaFinanceiro.Lancamento.Lancamento;
import sicredi.sistemaFinanceiro.Lancamento.RepositoryLançamento;

@RestController
@RequestMapping("/lancamentos")
public class LançamentoController {
    @Autowired
    private RepositoryLançamento repositoryLançamento;

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosLancamento lançamento){
        repositoryLançamento.save(new Lancamento(lançamento));
    }
}
