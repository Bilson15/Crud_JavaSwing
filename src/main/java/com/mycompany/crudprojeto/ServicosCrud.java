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
            valor = pedido.getItemPedidos().get(i).getProduto().getPreco() * pedido.getItemPedidos().get(i).getQuantidade();
        }

        return valor;
    }

    @Override
    public void calcularDesconto(Pedido pedido, double valorDesconto, int codigo) {
        for (int i = 0; i < pedido.getItemPedidos().size(); i++){
            if(pedido.getItemPedidos().get(i).getProduto().getCodigo() == codigo){
                double preco = pedido.getItemPedidos().get(i).getProduto().getPreco();
                pedido.getItemPedidos().get(i).getProduto().setPreco((preco += pedido.getItemPedidos().get(i).getProduto().getPreco() * valorDesconto) / 100);
            }
        }
    }

    @Override
    public String relatorio(Pedido pedido) {
        String relatorio = "-------------PEDIDO-------------\n" +
                           "Código: " + pedido.getCodigo() + "\n" +
                           "Cliente: " + pedido.getCliente().getNome() + "\n" +
                           "Produto: ";
        
                        for (int i = 0; i < pedido.getItemPedidos().size(); i++){
                            relatorio += pedido.getItemPedidos().get(i).getProduto().toString();
                        }
                        
                        relatorio += "\nVALOR TOTAL: " + calcularTotal(pedido);
        
       return relatorio;         
    }
    
}
