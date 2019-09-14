package com.br.ruy.padrao.aula4.adapter;

public class OpenGLImagemAdapter extends OpenGLImagem implements IImagemTarget {

    @Override
    public void setCarregarImagem(String nomedoarquivo) {
        setGLCarregarImagem(nomedoarquivo);
    }

    @Override
    public void getDesenharImagem(int posx, int posy, int largura, int altura) {
        setDesenhaImagem(posx - largura, posy + altura);
    }
    
}
