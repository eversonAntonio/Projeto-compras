package br.com.analise.compras.Entity.enumeration;

public enum TipoClienteEnum {

    PESSOAFISICA("Pessoa Física"),
    PESSOAJURIDICA("Pessoa Jurídica");

    String descricao;

    public String getDescricao() {
        return descricao;
    }

    TipoClienteEnum(String descricao) {
        this.descricao = descricao;
    }
}
