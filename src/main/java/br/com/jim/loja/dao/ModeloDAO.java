package br.com.jim.loja.dao;

import br.com.jim.loja.entidade.Modelo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jim
 */

@Repository
public interface ModeloDAO extends CrudRepository<Modelo, Integer> {
    
}
