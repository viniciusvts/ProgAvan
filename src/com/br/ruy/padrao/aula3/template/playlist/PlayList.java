package com.br.ruy.padrao.aula3.template.playlist;

import java.util.ArrayList;

import com.br.ruy.padrao.aula3.template.OrdenadorTemplate;
import com.br.ruy.padrao.aula3.template.dto.MusicaMP3;
import com.br.ruy.padrao.aula3.template.enumerador.ModoDeReproducao;
import com.br.ruy.padrao.aula3.template.ordenacao.OrdenadorPorAno;
import com.br.ruy.padrao.aula3.template.ordenacao.OrdenadorPorAutor;
import com.br.ruy.padrao.aula3.template.ordenacao.OrdenadorPorEstrela;
import com.br.ruy.padrao.aula3.template.ordenacao.OrdenadorPorNome;

public class PlayList {
    protected ArrayList<MusicaMP3> musicas;
    protected OrdenadorTemplate ordenador;

    public PlayList(ModoDeReproducao modo) {
        musicas = new ArrayList<MusicaMP3>();
        montaOrdenacao(modo);
    }
    
    public void setModoDeReproducao(ModoDeReproducao modo){
        ordenador = null;
        montaOrdenacao(modo);
    }
    private void montaOrdenacao(ModoDeReproducao modo){
        switch(modo){
            case porAno:
                ordenador = new OrdenadorPorAno();
                break;
            case porAutor:
                ordenador = new OrdenadorPorAutor();
                break;
            case porEstrela:
                ordenador = new OrdenadorPorEstrela();
                break;
            case porNome:
                ordenador = new OrdenadorPorNome();
                break;
        }
    }
    public void adicionarMusica(MusicaMP3 musica){
        musicas.add(musica);
    }
    
    public void mostrarListaDeReproducao(){
        ArrayList<MusicaMP3> novalista = new ArrayList<MusicaMP3>();
        novalista = ordenador.ordenarMusica(musicas);
        
        for (MusicaMP3 musicaMP3 : novalista) {
            System.out.println("Música: " + musicaMP3.getNome() +
                               " Autor: " + musicaMP3.getAutor() +
                               " Ano: " + musicaMP3.getAno() + 
                               " Estrela: " + musicaMP3.getEstrela());
            
        }
    }
    
    
}