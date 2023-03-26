package io.github.Devluizhsgs.service;

import io.github.Devluizhsgs.model.Cliente;
import io.github.Devluizhsgs.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    public ClientesService ( ClientesRepository repository) {
        this.repository = repository;
    }

    public void salvarCliente(Cliente cLiente) {
        validarCliente(cLiente);
        this.repository.persistir(cLiente);
    }

    public void validarCliente(Cliente cliente){

    }
}
