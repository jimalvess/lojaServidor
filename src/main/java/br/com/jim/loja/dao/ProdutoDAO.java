package br.com.jim.loja.dao;

import br.com.jim.loja.entidade.Fornecedor;
import br.com.jim.loja.entidade.Genero;
import br.com.jim.loja.entidade.Produto;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoDAO extends CrudRepository<Produto, Integer>  {
    List<Produto> findByNomeContaining(String nome);
    List<Produto> findByNomeStartingWith(String nome);
    List<Produto> findByValorBetween(float inicio, float fim);
    List<Produto> findByGenero(Genero genero);
    List<Produto> findByGeneroPerecivel(boolean perecivel);
    List<Produto> findByFornecedores(Fornecedor fornecedor);
}
