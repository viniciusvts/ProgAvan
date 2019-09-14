package com.br.ruy.padrao.aula4.adapter;

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
