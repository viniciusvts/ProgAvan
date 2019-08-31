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
public interface IImagemTarget {
    public void setCarregarImagem(String nomedoarquivo);
    public void getDesenharImagem( int posx, int posy, int largura, int altura);
}
