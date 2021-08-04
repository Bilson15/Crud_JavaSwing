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
public class ServicosCrud implements Servicos{

    @Override
    public double calcularTotal(Pedido pedido) {
        double valor = 0; 
        for (int i = 0; i < pedido.getItemPedidos().size(); i++){
            valor += pedido.getItemPedidos().get(i).getProduto().getPreco() * pedido.getItemPedidos().get(i).getQuantidade();
        }

        return valor;
    }

    @Override
    public double calcularDesconto(ItemPedido itemPedido, double valorDesconto) {
            
        double preco = itemPedido.getProduto().getPreco();
        return (preco -= (itemPedido.getProduto().getPreco() * valorDesconto) / 100);

    }

    @Override
    public String relatorio(Pedido pedido) {
        String relatorio = "\n-------------PEDIDO-------------\n" +
                           "Código: " + pedido.getCodigo() + "\n" +
                           "Cliente: " + pedido.getCliente().getNome() + "\n" +
                           "Produtos: \n";
        
                        for (int i = 0; i < pedido.getItemPedidos().size(); i++){
                            relatorio += pedido.getItemPedidos().get(i).getProduto().toString() + 
                                       " X " + pedido.getItemPedidos().get(i).getQuantidade() + " Subtotal: " + 
                                        (pedido.getItemPedidos().get(i).getQuantidade() * pedido.getItemPedidos().get(i).getProduto().getPreco()) + "\n";
                        }
                        
                        relatorio += "\nVALOR TOTAL: " + calcularTotal(pedido) + "\n";
        
       return relatorio;         
    }
    
}
