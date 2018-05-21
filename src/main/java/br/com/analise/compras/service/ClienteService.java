package br.com.analise.compras.service;

import br.com.analise.compras.Entity.Cliente;
import br.com.analise.compras.exception.ObjectNotFoundException;
import br.com.analise.compras.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscarClientePorId(Integer id) {

        Cliente cliente = clienteRepository.findOne(id);

        if (cliente == null) {
            throw new ObjectNotFoundException("O objeto " + Cliente.class.getName() +
                    " com ID: " + id + " não foi encontrado!");
        }

        return cliente;
    }
}
