/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo.lab6.aula;

/**
 *
 * @author fabiola
 */
public interface Sujeito {
    
    public void addObservers(Observer obs);
    public void removeObserver(Observer obs);
    
    public void notifyObservers();
}
