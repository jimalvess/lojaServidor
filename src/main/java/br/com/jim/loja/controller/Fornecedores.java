package br.com.jim.loja.controller;

import br.com.jim.loja.dao.FornecedorDAO;
import br.com.jim.loja.entidade.Fornecedor;
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
public class Fornecedores {
    
    @Autowired
    FornecedorDAO fornecedorDAO;
    
    @RequestMapping(path = "/fornecedores/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Fornecedor cadastrar(@RequestBody Fornecedor fornecedor) {
        fornecedor.setId(0);
        return fornecedorDAO.save(fornecedor);
    }

    @RequestMapping(path = "/fornecedores/", method = RequestMethod.GET)
    public Iterable<Fornecedor> listar() {
        return fornecedorDAO.findAll();
    }
    
    
}
