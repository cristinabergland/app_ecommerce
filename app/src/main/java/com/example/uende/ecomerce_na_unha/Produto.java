package com.example.uende.ecomerce_na_unha;

import android.graphics.drawable.Drawable;

public class Produto {
    public String Titulo;
    public Drawable ProdutosImagem;
    public String Descricao;
    public double Preco;
    public boolean Selecionado;

    public Produto(String titulo, Drawable produtosImagem, String descricao, double preco, boolean selecionado) {
        Titulo = titulo;
        ProdutosImagem = produtosImagem;
        Descricao = descricao;
        Preco = preco;
        Selecionado = selecionado;
    }
}
