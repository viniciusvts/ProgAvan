/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ruy.padrao.adapter;

/**
 *
 * @author 161052333
 */
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
