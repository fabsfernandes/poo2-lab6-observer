/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo.lab6.aula;

/**
 *
 * @author fabiola
 */
public class Aeroporto implements Observer {
    
    public void update(double temp, double umidade, double vento) {
        
        if(vento > 100.0){
            System.out.println("Alerta perigo");
            
        }
    }
    

}
