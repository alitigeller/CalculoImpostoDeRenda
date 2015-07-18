/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo.impostorenda.cdp;

import br.ifes.poo.impostorenda.cdp.util.CalculadorImposto;

/**
 *
 * @author aeller
 */
public class Pessoa {
    private String nome;
    private double renda;
    
    private CalculadorImposto calculadorImposto;

    public Pessoa(CalculadorImposto calculadorImposto) {
        this.calculadorImposto = calculadorImposto;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    public double calculaImposto(){
        return calculadorImposto.calcular(this);
    }
        
}
