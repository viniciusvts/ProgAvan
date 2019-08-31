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
public class OpenGLImagem {
    public void setGLCarregarImagem(String arquivo){
        //implementação de carregamento de uma imagem opengl
        System.out.println("imagem: " + arquivo);
    }
    public void setDesenhaImagem(int posicaox, int posicaoy){
        //draw da imagem opengl
        System.out.println("Open Gl imagem desenhada: x: " + posicaox + 
                " y: " + posicaoy);
    }
}
