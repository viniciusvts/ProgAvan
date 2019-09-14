package com.br.ruy.padrao.aula4.adapter;

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
