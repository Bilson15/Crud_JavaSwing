/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crudprojeto;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author gabri
 */
public class Pedido implements Serializable {
    
   private int codigo; 
   private List<ItemPedido> itemPedidos;
   private Cliente cliente;

    public Pedido(int codigo, Cliente cliente) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.itemPedidos = null;
        this.itemPedidos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

    public void setItemPedidos(List<ItemPedido> itemPedidos) {
        this.itemPedidos = itemPedidos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
   

    
    @Override
    public String toString() {
        return "Pedido{" + "codigo=" + codigo + ", itemPedidos=" + itemPedidos + ", cliente=" + cliente + '}'+ "\n";
    }
    
    
    
   
   
}
