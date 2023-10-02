/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo.lab6.aula;

/**
 *
 * @author fabiola
 */
public class PrefeituraUdi implements Observer {

    @Override
    public void update(double temp, double umidade, double vento) {
        
        if(umidade < 20.0){
            System.out.println("Defesa civil alerta: baixa umidade");
            
        }
    }
    
    
    
}
