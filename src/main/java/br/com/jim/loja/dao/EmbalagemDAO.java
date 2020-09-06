package br.com.jim.loja.dao;

import br.com.jim.loja.entidade.Embalagem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jim
 */
@Repository
public interface EmbalagemDAO extends CrudRepository<Embalagem, Integer> {
    
}
