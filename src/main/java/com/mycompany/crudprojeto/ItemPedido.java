/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crudprojeto;

import java.io.Serializable;

/**
 *
 * @author gabri
 */
public class ItemPedido implements Serializable{
    private Produto produto;
    private int quantidade;

    
    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItemPedido{" + "produto=" + produto + ", quantidade=" + quantidade + '}';
    }
    
}
