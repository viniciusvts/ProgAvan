package com.br.ruy.padrao.aula5;

import com.br.ruy.padrao.aula5.observer.BarraObserver;
import com.br.ruy.padrao.aula5.observer.Dados;
import com.br.ruy.padrao.aula5.observer.DadosSubject;
import com.br.ruy.padrao.aula5.observer.PercentObserver;
import com.br.ruy.padrao.aula5.observer.TabelaObserver;

public class Aula5 {
	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DadosSubject dados = new DadosSubject();
        dados.attach(new TabelaObserver(dados));
        dados.attach(new BarraObserver(dados));
        dados.attach(new PercentObserver(dados));
        
        dados.seState(new Dados(1, 2, 2, 5));
        //Tempo passa....
        dados.seState(new Dados(3, 1, 4, 2));
        //Tempo passa....
        dados.seState(new Dados(5, 21, 44, 12));

    }
}
