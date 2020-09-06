package br.com.jim.loja.dao;

import br.com.jim.loja.entidade.Genero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jim
 */
@Repository
public interface GeneroDAO extends CrudRepository<Genero, Integer> {
    
}
