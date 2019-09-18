package com.br.ruy.padrao.aula5.observer;

public class TabelaObserver extends DadosObserver{
	public TabelaObserver(DadosSubject dados) {
        super(dados);
    }

    @Override
    public void update() {
        System.out.println("Tabela dos Valores");
        System.out.println("Valor A:" + dados.getState().getValora());
        System.out.println("Valor B:" + dados.getState().getValorb());
        System.out.println("Valor C:" + dados.getState().getValorc());
        System.out.println("Valor D:" + dados.getState().getValord());
    }
}
