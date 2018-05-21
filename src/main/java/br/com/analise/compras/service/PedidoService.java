package br.com.analise.compras.service;

import br.com.analise.compras.Entity.Cliente;
import br.com.analise.compras.Entity.Pedido;
import br.com.analise.compras.exception.ObjectNotFoundException;
import br.com.analise.compras.repository.ClienteRepository;
import br.com.analise.compras.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido buscarPedidoPorId(Integer id) {

        Pedido pedido = pedidoRepository.findOne(id);

        if (pedido == null) {
            throw new ObjectNotFoundException("O objeto " + Pedido.class.getName() +
                    " com ID: " + id + " não foi encontrado!");
        }

        return pedido;
    }
}
