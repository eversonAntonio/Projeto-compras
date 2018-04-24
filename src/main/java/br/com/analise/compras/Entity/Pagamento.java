package br.com.analise.compras.Entity;

import br.com.analise.compras.Entity.enumeration.EstadoPagamentoEnum;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_pagamento")
@SequenceGenerator(name = "seq_pagamento", sequenceName = "seq_pagamento")
public class Pagamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_pagamento")
    @Column(name = "pa_id")
    private Integer id;

    @Column(name = "pa_estado")
    private EstadoPagamentoEnum estado;

    @OneToOne
    @JoinColumn(name = "pe_id")
    @MapsId
    private Pedido pedido;

    public Pagamento(){

    }

    public Pagamento(Integer id, EstadoPagamentoEnum estado, Pedido pedido) {
        this.id = id;
        this.estado = estado;
        this.pedido = pedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EstadoPagamentoEnum getEstado() {
        return estado;
    }

    public void setEstado(EstadoPagamentoEnum estado) {
        this.estado = estado;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pagamento pagamento = (Pagamento) o;
        return Objects.equals(id, pagamento.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
