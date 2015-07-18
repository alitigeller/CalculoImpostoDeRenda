/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo.impostorenda.cdp.util;

import br.ifes.poo.impostorenda.cdp.Pessoa;

/**
 *
 * @author aeller
 */
public class CalculadorImpostoC implements CalculadorImposto{

    @Override
    public double calcular(Pessoa pessoa) {
        return pessoa.getRenda() * 0.15;
    }
    
}
