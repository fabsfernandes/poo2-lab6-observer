/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo.lab6.aula;

/**
 *
 * @author fabiola
 */
public class Main {
    
    public static void main(String ... args){
        
        CET cet = new CET();
        PrefeituraUdi pref = new PrefeituraUdi();
        
        cet.addObservers(pref);
        
        cet.setUmidade(30.0);
        
        cet.setUmidade(10.0);
        
        Aeroporto aero = new Aeroporto();
        cet.addObservers(aero);
        
        //cet.setVento(120.0);
        
        
    }
    
}
