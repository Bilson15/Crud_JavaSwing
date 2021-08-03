/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crudprojeto;

/**
 *
 * @author gabri
 */
public interface Servicos {
    public abstract double calcularTotal(Pedido pedido);
    
    public abstract void calcularDesconto(Pedido pedido, double valorDesconto, int codigo);
    
    public abstract String relatorio(Pedido pedido);
}
