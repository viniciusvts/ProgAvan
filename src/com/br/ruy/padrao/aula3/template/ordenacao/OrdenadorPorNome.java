package com.br.ruy.padrao.aula3.template.ordenacao;

import com.br.ruy.padrao.aula3.template.OrdenadorTemplate;
import com.br.ruy.padrao.aula3.template.dto.MusicaMP3;

public class OrdenadorPorNome extends OrdenadorTemplate{

    @Override
    public boolean isPrimeiro(MusicaMP3 musica1, MusicaMP3 musica2) {
        return (musica1.getNome().compareToIgnoreCase(musica2.getNome()) >=0 );
    }
    
}