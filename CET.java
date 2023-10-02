/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo.lab6.aula;

import java.util.*;
/**
 *
 * @author fabiola
 */
public class CET implements Sujeito {
    
    private List<Observer> observers;
    
    private double temperatura;
    private double umidade;
    private double vento;
    
    public CET(){
        observers = new ArrayList<Observer>();
    }
    

    @Override
    public void addObservers(Observer obs) {
        
        observers.add(obs);
       
    }

    @Override
    public void removeObserver(Observer obs) {
        
        observers.remove(obs);
       
    }

    @Override
    public void notifyObservers() {
        
        for(Observer o : observers){
            o.update(temperatura, umidade, vento);
        }
       
    }
    
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        
        notifyObservers();
    }
    
    public void setUmidade(double umidade) {
        this.umidade = umidade;
        
        notifyObservers();
    }
    
    
    
}
