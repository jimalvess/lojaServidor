package br.com.jim.loja.dao;

import br.com.jim.loja.entidade.Fornecedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jim
 */
@Repository
public interface FornecedorDAO extends CrudRepository<Fornecedor,Integer>{
    
}
