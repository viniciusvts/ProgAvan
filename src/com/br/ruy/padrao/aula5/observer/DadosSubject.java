package com.br.ruy.padrao.aula5.observer;

import java.util.ArrayList;

public class DadosSubject {
	protected ArrayList <DadosObserver> observers;
    protected Dados dados;

    public DadosSubject() {
        observers = new ArrayList<>();
    }
    
    public void attach(DadosObserver observer){
        observers.add(observer);
    }
    
    public void detach(int indice){
        observers.remove(indice);
    }
    
    public void seState(Dados dados){
        this.dados = dados;
        notifyObservers();
    }
    
    public Dados getState(){
        return this.dados;
    }
    
    private void notifyObservers(){
        for (DadosObserver observer : observers) {
            //chamar o metodo concreto de Update
            observer.update();
        }
    }
}
