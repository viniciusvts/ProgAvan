package com.br.ruy.padrao.aula4.adapter;

public class ImagemAdapter extends Surface implements IImagemTarget{

    @Override
    public void setCarregarImagem(String nomedoarquivo) {
        setCarregarSurface(nomedoarquivo);
    }

    @Override
    public void getDesenharImagem(int posx, int posy, int largura, int altura) {
        setDesenharSurface(posx, posy, largura, altura);
    }
    
}
