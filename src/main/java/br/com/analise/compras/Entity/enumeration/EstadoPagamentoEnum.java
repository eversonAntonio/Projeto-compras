package br.com.analise.compras.Entity.enumeration;

public enum EstadoPagamentoEnum {

    PENDENTE("Pendente"),
    QUITADO("Quitado"),
    CANCELADO("Cancelado");

    String descricao;

    public String getDescricao() {
        return descricao;
    }

    EstadoPagamentoEnum(String descricao) {
        this.descricao = descricao;
    }
}
