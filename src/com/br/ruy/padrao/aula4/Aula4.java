package com.br.ruy.padrao.aula4;

import com.br.ruy.padrao.aula4.adapter.IImagemTarget;
import com.br.ruy.padrao.aula4.adapter.ImagemAdapter;
import com.br.ruy.padrao.aula4.adapter.OpenGLImagemAdapter;
import com.br.ruy.padrao.aula4.singleton.Pessoa;

public class Aula4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("#Adapter");
        IImagemTarget imagem = new ImagemAdapter();
        imagem.setCarregarImagem("figuraDeCasa.png");
        imagem.getDesenharImagem(0, 1, 10, 20);
        
        imagem = new OpenGLImagemAdapter();
        imagem.setCarregarImagem("figuraPlanoDeFundo.jpg");
        imagem.getDesenharImagem(1, 4, 50, 60);
        //fim adpter
        System.out.println("#Singleton");
        //singletom
        Pessoa p1 = Pessoa.getInstancia();
        Pessoa p2 = Pessoa.getInstancia();;
        
        p1.setNome("ze das couves");
        p1.setCpf("12345");
        p1.setAltura((float) 1.6);
        
        p1.setNome("maria da mariola");
        p1.setCpf("6789");
        p1.setAltura(1.4F);
        
        System.out.println(p1);
        System.out.println(p2);
    }
    
}
