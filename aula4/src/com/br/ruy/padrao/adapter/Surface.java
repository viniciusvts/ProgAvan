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
public class Surface {
    public void setCarregarSurface(String nomedoarquivo){
        System.out.println("nome do arqivo" + nomedoarquivo);
    }
    public void setDesenharSurface(int posx, int posy, int largura, int altura){
        System.out.println("posx: " + posx + 
                " posy: " + posy + 
                " largura: " + largura + 
                " altura: " + altura );
    }
}
