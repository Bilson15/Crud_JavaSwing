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
    
    public abstract double calcularDesconto(ItemPedido itemPedido, double valorDesconto);
    
    public abstract String relatorio(Pedido pedido);
}
