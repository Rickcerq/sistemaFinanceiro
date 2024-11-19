package sicredi.sistemaFinanceiro.Controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sicredi.sistemaFinanceiro.Categoria.Categoria;
import sicredi.sistemaFinanceiro.Categoria.DadosCategoria;
import sicredi.sistemaFinanceiro.Categoria.RepositoryCategoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private RepositoryCategoria repositoryCategoria;

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCategoria categoria){
        repositoryCategoria.save(new Categoria(categoria));
    }
}
