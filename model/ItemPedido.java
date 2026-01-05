package model;

public class ItemPedido {

    private String descricao;
    private double preco;
    private int quantidade;

    public ItemPedido(String descricao, double preco, int quantidade) {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return preco * quantidade;
    }

    public String getDescricao() {
        return descricao;
    }
}
