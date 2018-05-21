package br.com.analise.compras.resource;


import br.com.analise.compras.Entity.Pedido;
import br.com.analise.compras.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

    @Autowired
    private PedidoService pedidoService;

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<?> buscarPedido(@PathVariable("id") Integer id) {
        Pedido categoria = pedidoService.buscarPedidoPorId(id);
        return ResponseEntity.ok().body(categoria);
    }
}
