package com.br.ruy.padrao.aula4.adapter;

public interface IImagemTarget {
    public void setCarregarImagem(String nomedoarquivo);
    public void getDesenharImagem( int posx, int posy, int largura, int altura);
}
