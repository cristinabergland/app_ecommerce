package com.example.uende.ecomerce_na_unha;

//verifica a entrada do pedido  que será levada para o carrinho de compras

public class ShoppingCartEntry {

//conexao com a classe produto

        private Produto mProduto;
        private int mQuantidade;

    public ShoppingCartEntry(Produto mProduto, int mQuantidade) {
        this.mProduto = mProduto;
        this.mQuantidade = mQuantidade;
    }

    public Produto getmProduto() {
        return mProduto;
    }

    public void setmProduto(Produto mProduto) {
        this.mProduto = mProduto;
    }

    public int getmQuantidade() {
        return mQuantidade;
    }

    public void setmQuantidade(int mQuantidade) {
        this.mQuantidade = mQuantidade;
    }
}
