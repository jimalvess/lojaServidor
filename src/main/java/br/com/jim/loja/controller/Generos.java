package br.com.jim.loja.controller;

import br.com.jim.loja.dao.GeneroDAO;
import br.com.jim.loja.entidade.Genero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jim
 */
@RestController
@RequestMapping("/api")
public class Generos {
    
    @Autowired
    GeneroDAO generoDAO;
    
    @RequestMapping(path = "/generos/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Genero cadastrar(@RequestBody Genero genero) {
        genero.setId(0);
        return generoDAO.save(genero);
    }

    @RequestMapping(path = "/generos/", method = RequestMethod.GET)
    public Iterable<Genero> listar() {
        return generoDAO.findAll();
    }
    
    
}
