package com.mycompany.crudprojeto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabri
 */
public class Crud extends javax.swing.JFrame {
    List<Cliente> clientes;
    List<Produto> produtos;
    List<Pedido> pedidos;

    ServicosCrud servicos = new ServicosCrud();
    
    ObjectInputStream entrada;
    ObjectOutputStream saida;
    
    ObjectInputStream entradaProduto;
    ObjectOutputStream saidaProduto;
    
    ObjectInputStream entradaPedidos;
    ObjectOutputStream saidaPedidos;
            
            public void criarTabela(){
                DefaultTableModel model = (DefaultTableModel) tableClientes.getModel();
                model.setRowCount(0);
                String dadosLinha[] = new String[4];
                for(int i = 0; i < clientes.size(); i++){
                    dadosLinha[0] = String.valueOf(clientes.get(i).getCpf());
                    dadosLinha[1] = clientes.get(i).getNome();
                    dadosLinha[2] = String.valueOf(clientes.get(i).getDataNascimento());
                    dadosLinha[3] = String.valueOf(clientes.get(i).getContato());
                    model.addRow(dadosLinha);
                }
            }
            
            public void criarTabelaProduto(){
                DefaultTableModel model = (DefaultTableModel) tableProdutos.getModel();
                model.setRowCount(0);
                String dadosLinha[] = new String[4];
                for(int i = 0; i < produtos.size(); i++){
                    dadosLinha[0] = String.valueOf(produtos.get(i).getCodigo());
                    dadosLinha[1] = produtos.get(i).getNome();
                    dadosLinha[2] = String.valueOf(produtos.get(i).getPreco());
                    model.addRow(dadosLinha);
                }
            }
               
            
    public Crud() {
        
        initComponents();

        //Clientes
        File arquivo = new File("clientes.dat");
        File arquivoProdutos = new File("produtos.dat");
        File arquivoPedidos = new File("pedidos.dat");
        try {
            FileInputStream fluxoEntradaArquivo = new FileInputStream(arquivo);
            entrada = new ObjectInputStream(fluxoEntradaArquivo);
            clientes = (ArrayList) entrada.readObject();
        
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
       
            clientes = new ArrayList<>();
        }
        
        
        //Produtos
        try {
            FileInputStream fluxoEntradaArquivo = new FileInputStream(arquivoProdutos);
            entradaProduto = new ObjectInputStream(fluxoEntradaArquivo);
            produtos = (ArrayList) entradaProduto.readObject();
            //copiaProdutos = (ArrayList) entradaProduto.readObject();
           
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
       
            produtos = new ArrayList<>();
        }
        
        //pedidos
        try {
            FileInputStream fluxoEntradaArquivo = new FileInputStream(arquivoPedidos);
            entradaPedidos = new ObjectInputStream(fluxoEntradaArquivo);
            pedidos = (ArrayList) entradaPedidos.readObject();
     
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
 
            pedidos = new ArrayList<>();
        }
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        paneCliente = new javax.swing.JTabbedPane();
        produto = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPrecoProduto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCodigoProduto = new javax.swing.JTextField();
        cadastarProduto = new javax.swing.JButton();
        RemoverProduto = new javax.swing.JButton();
        alterarProduto = new javax.swing.JButton();
        atualizarProduto = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        pedido = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtNumeroPedido = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cadastarPedido = new javax.swing.JButton();
        RemoverPedido = new javax.swing.JButton();
        AtualizarPedido = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaPedidos = new javax.swing.JTextArea();
        txtCodigoClientePedido = new javax.swing.JTextField();
        txtCodigoRemocao = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Cliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JTextField();
        txtContato = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cadastar = new javax.swing.JButton();
        Remover = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtCodigoProdutoCarrinho = new javax.swing.JTextField();
        cadastarCarrinho = new javax.swing.JButton();
        txtQuantidadeCarrinho = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtNumeroPedidoCarrinho = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtDescontoCarrinho = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel7.setText("Cadastro de Produtos");

        jLabel8.setText("Nome:");

        jLabel9.setText("Pre??o:");

        jLabel10.setText("C??digo:");

        cadastarProduto.setText("Cadastar");
        cadastarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastarProdutoActionPerformed(evt);
            }
        });

        RemoverProduto.setText("Remover");
        RemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverProdutoActionPerformed(evt);
            }
        });

        alterarProduto.setText("Alterar");
        alterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarProdutoActionPerformed(evt);
            }
        });

        atualizarProduto.setText("Atualizar");
        atualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarProdutoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel12.setText("Lista de Produtos");

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Pre??o"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableProdutos);

        javax.swing.GroupLayout produtoLayout = new javax.swing.GroupLayout(produto);
        produto.setLayout(produtoLayout);
        produtoLayout.setHorizontalGroup(
            produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produtoLayout.createSequentialGroup()
                .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, produtoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(368, 368, 368)
                        .addComponent(cadastarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, produtoLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(produtoLayout.createSequentialGroup()
                                .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(produtoLayout.createSequentialGroup()
                                        .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(produtoLayout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(produtoLayout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(159, 159, 159)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produtoLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(276, 276, 276)))
                                .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(atualizarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(alterarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RemoverProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))))
                            .addComponent(jScrollPane3))))
                .addGap(79, 79, 79))
        );
        produtoLayout.setVerticalGroup(
            produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtoLayout.createSequentialGroup()
                .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(produtoLayout.createSequentialGroup()
                        .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(produtoLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(cadastarProduto))
                            .addGroup(produtoLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(produtoLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(RemoverProduto)))
                .addGap(18, 18, 18)
                .addComponent(alterarProduto)
                .addGap(4, 4, 4)
                .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarProduto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        paneCliente.addTab("Produto", produto);

        jLabel17.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel17.setText("Novo Pedido");

        jLabel18.setText("C??digo do pedido");

        jLabel19.setText("CPF cliente:");

        cadastarPedido.setText("Cadastar");
        cadastarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastarPedidoActionPerformed(evt);
            }
        });

        RemoverPedido.setText("Remover");
        RemoverPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverPedidoActionPerformed(evt);
            }
        });

        AtualizarPedido.setText("Atualizar");
        AtualizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarPedidoActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel22.setText("Lista de pedidos");

        listaPedidos.setColumns(20);
        listaPedidos.setRows(5);
        jScrollPane6.setViewportView(listaPedidos);

        jLabel11.setText("C??digo pedido: ");

        javax.swing.GroupLayout pedidoLayout = new javax.swing.GroupLayout(pedido);
        pedido.setLayout(pedidoLayout);
        pedidoLayout.setHorizontalGroup(
            pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pedidoLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pedidoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 394, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigoRemocao, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pedidoLayout.createSequentialGroup()
                        .addGroup(pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pedidoLayout.createSequentialGroup()
                                .addGroup(pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pedidoLayout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pedidoLayout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodigoClientePedido)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RemoverPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pedidoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pedidoLayout.createSequentialGroup()
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(263, 263, 263))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pedidoLayout.createSequentialGroup()
                                        .addComponent(cadastarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(364, 364, 364)))
                                .addComponent(AtualizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75)))
                .addGap(79, 79, 79))
        );
        pedidoLayout.setVerticalGroup(
            pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pedidoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pedidoLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86))
                    .addGroup(pedidoLayout.createSequentialGroup()
                        .addGroup(pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtCodigoRemocao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(RemoverPedido)
                        .addGap(39, 39, 39)
                        .addComponent(cadastarPedido)
                        .addGap(20, 20, 20)))
                .addGroup(pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtCodigoClientePedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AtualizarPedido, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        paneCliente.addTab("Pedido", pedido);

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("Data nascimento:");

        jLabel4.setText("Contato: ");

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel5.setText("Cadastro de clientes");

        cadastar.setText("Cadastar");
        cadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastarActionPerformed(evt);
            }
        });

        Remover.setText("Remover");
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });

        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Data nascimento", "Contato"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableClientes);

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel6.setText("Lista de clientes");

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClienteLayout = new javax.swing.GroupLayout(Cliente);
        Cliente.setLayout(ClienteLayout);
        ClienteLayout.setHorizontalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClienteLayout.createSequentialGroup()
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ClienteLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(404, 404, 404)
                        .addComponent(cadastar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ClienteLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ClienteLayout.createSequentialGroup()
                                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(159, 159, 159)
                                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                                        .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Remover, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))))))
                            .addGroup(ClienteLayout.createSequentialGroup()
                                .addGap(465, 465, 465)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))))
                .addGap(79, 79, 79))
        );
        ClienteLayout.setVerticalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLayout.createSequentialGroup()
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClienteLayout.createSequentialGroup()
                        .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ClienteLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(cadastar))
                            .addGroup(ClienteLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ClienteLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(Remover)))
                .addGap(18, 18, 18)
                .addComponent(alterar)
                .addGap(4, 4, 4)
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        paneCliente.addTab("Cliente", Cliente);

        jLabel21.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel21.setText("Items de pedido");

        jLabel24.setText("N??mero pedido:");

        cadastarCarrinho.setText("Lan??ar Item");
        cadastarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastarCarrinhoActionPerformed(evt);
            }
        });

        jLabel25.setText("Quantidade: ");

        jLabel26.setText("C??digo Produto:");

        jLabel28.setText("Desconto: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(333, 333, 333)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescontoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(txtCodigoProdutoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(cadastarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(473, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(340, 340, 340)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtQuantidadeCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(118, 626, Short.MAX_VALUE)))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(291, 291, 291)
                    .addComponent(txtNumeroPedidoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(958, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28)
                        .addComponent(txtDescontoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel24))
                .addGap(68, 68, 68)
                .addComponent(txtCodigoProdutoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(cadastarCarrinho)
                .addContainerGap(353, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(133, 133, 133)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(jLabel25)
                        .addComponent(txtQuantidadeCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(459, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(txtNumeroPedidoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(546, Short.MAX_VALUE)))
        );

        paneCliente.addTab("Carrinho", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneCliente)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastarActionPerformed
               // TODO add your handling code here:
        int cpf = Integer.parseInt(txtCPF.getText());
        String nome = txtNome.getText();
        String dataNascimento = txtDataNascimento.getText();
        String contato = txtContato.getText();
        
        
        clientes.add(new Cliente(cpf, nome, dataNascimento, contato));
        
        try {
            File arquivo = new File("clientes.dat");
            FileOutputStream fluxoSaidaArquivo = new FileOutputStream(arquivo);
            saida = new ObjectOutputStream(fluxoSaidaArquivo);
            saida.writeObject(clientes);
            saida.close();
            fluxoSaidaArquivo.close();
            JOptionPane.showMessageDialog(this,"Cadastrado com sucesso !");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        
        txtCPF.setText("");
        txtNome.setText("");
        txtDataNascimento.setText("");
        txtContato.setText("");
        criarTabela();
    }//GEN-LAST:event_cadastarActionPerformed

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        clientes.remove(clientes.size() -1);
        try {
            File arquivo = new File("clientes.dat");
            FileOutputStream fluxoSaidaArquivo = new FileOutputStream(arquivo);
            saida = new ObjectOutputStream(fluxoSaidaArquivo);
            saida.writeObject(clientes);
            saida.close();
            fluxoSaidaArquivo.close();
            JOptionPane.showMessageDialog(this,"Removido com sucesso !");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        criarTabela();
    }//GEN-LAST:event_RemoverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        criarTabela();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cadastarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastarProdutoActionPerformed

        int codigo = Integer.parseInt(txtCodigoProduto.getText());
        String nome = txtNomeProduto.getText();
        double preco = Double.parseDouble(txtPrecoProduto.getText());

        
        produtos.add(new Produto(codigo, nome, preco));
        
        try {
            File arquivo = new File("produtos.dat");
            FileOutputStream fluxoSaidaArquivo = new FileOutputStream(arquivo);
            saidaProduto = new ObjectOutputStream(fluxoSaidaArquivo);
            saidaProduto.writeObject(produtos);
            saidaProduto.close();
            fluxoSaidaArquivo.close();
            JOptionPane.showMessageDialog(this,"Cadastrado com sucesso !");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        
        txtCodigoProduto.setText("");
        txtNomeProduto.setText("");
        txtPrecoProduto.setText("");
        criarTabelaProduto();

    }//GEN-LAST:event_cadastarProdutoActionPerformed

    private void RemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverProdutoActionPerformed
        produtos.remove(produtos.size() -1);
        try {
            File arquivo = new File("produtos.dat");
            FileOutputStream fluxoSaidaArquivo = new FileOutputStream(arquivo);
            saidaProduto = new ObjectOutputStream(fluxoSaidaArquivo);
            saidaProduto.writeObject(produtos);
            saidaProduto.close();
            fluxoSaidaArquivo.close();
            JOptionPane.showMessageDialog(this,"Removido com sucesso !");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        criarTabelaProduto();
    }//GEN-LAST:event_RemoverProdutoActionPerformed

    private void atualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarProdutoActionPerformed
        criarTabelaProduto();
    }//GEN-LAST:event_atualizarProdutoActionPerformed

    private void cadastarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastarPedidoActionPerformed
        int codigoPedido = Integer.parseInt(txtNumeroPedido.getText());
        int codigoCliente = Integer.parseInt(txtCodigoClientePedido.getText());
        
        for(int i = 0; i < clientes.size(); i++){
            if(codigoCliente == clientes.get(i).getCpf()){
                pedidos.add(new Pedido(codigoPedido, clientes.get(i)));
            try {
                File arquivo = new File("pedidos.dat");
                FileOutputStream fluxoSaidaArquivo = new FileOutputStream(arquivo);
                saidaPedidos = new ObjectOutputStream(fluxoSaidaArquivo);
                saidaPedidos.writeObject(pedidos);
                saidaPedidos.close();
                fluxoSaidaArquivo.close();
                JOptionPane.showMessageDialog(this,"Cadastrado com sucesso !");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            txtCodigoClientePedido.setText("");
            txtNumeroPedido.setText("");

            }else{
                JOptionPane.showMessageDialog(this, "CPF invalido");
            }
        }

        
    }//GEN-LAST:event_cadastarPedidoActionPerformed

    private void RemoverPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverPedidoActionPerformed
        int codigo = Integer.parseInt(txtCodigoRemocao.getText());
        
        for (int i = 0; i < pedidos.size(); i++){
            if(pedidos.get(i).getCodigo() == codigo){
                pedidos.remove(pedidos.get(i));
                try {
                    File arquivo = new File("pedidos.dat");
                    FileOutputStream fluxoSaidaArquivo = new FileOutputStream(arquivo);
                    saidaPedidos = new ObjectOutputStream(fluxoSaidaArquivo);
                    saidaPedidos.writeObject(pedidos);
                    saidaPedidos.close();
                    fluxoSaidaArquivo.close();
                    JOptionPane.showMessageDialog(this,"Removido com sucesso !");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_RemoverPedidoActionPerformed

    private void AtualizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarPedidoActionPerformed
          
        listaPedidos.setText("");
        for(Pedido x : pedidos){
            if(x.getItemPedidos() == null){
                listaPedidos.append(x.toString());
            }else{
               listaPedidos.append(servicos.relatorio(x));
            }
            
        }
   
    }//GEN-LAST:event_AtualizarPedidoActionPerformed

    private void cadastarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastarCarrinhoActionPerformed
        int numeroPedidoCarrinho = Integer.parseInt(txtNumeroPedidoCarrinho.getText());
        int codigoProduto = Integer.parseInt(txtCodigoProdutoCarrinho.getText());
        int quantidade = Integer.parseInt(txtQuantidadeCarrinho.getText());
        double desconto = Double.parseDouble(txtDescontoCarrinho.getText());
   
       for(int i =0; i < pedidos.size(); i++){
           if(numeroPedidoCarrinho == pedidos.get(i).getCodigo()){
               for(int x = 0; x < produtos.size(); x++){
                   if(codigoProduto == produtos.get(x).getCodigo()){
                       pedidos.get(i).getItemPedidos().add(new ItemPedido(produtos.get(x), quantidade));
                       
                       if(desconto != 0){
                           pedidos.get(i).getItemPedidos().get(pedidos.get(i).getItemPedidos().size() - 1).getProduto().setPrecoDesconto
                           (servicos.calcularDesconto(pedidos.get(i).getItemPedidos().get(pedidos.get(i).getItemPedidos().size() - 1), desconto));   
                       }else{
                            pedidos.get(i).getItemPedidos().get(pedidos.get(i).getItemPedidos().size() - 1).getProduto().setPrecoDesconto(
                            pedidos.get(i).getItemPedidos().get(x).getProduto().getPreco());
                       }
                        try {
                            File arquivo = new File("pedidos.dat");
                            FileOutputStream fluxoSaidaArquivo = new FileOutputStream(arquivo);
                            saidaPedidos = new ObjectOutputStream(fluxoSaidaArquivo);
                            saidaPedidos.writeObject(pedidos);
                            saidaPedidos.close();
                            fluxoSaidaArquivo.close();
                            JOptionPane.showMessageDialog(this,"Cadastrado com sucesso !");
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(this, ex.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
                        }  
                   }else{
                       JOptionPane.showMessageDialog(this, "Algum c??digo est?? errado");
                   }
               }
           }
       }
    
    }//GEN-LAST:event_cadastarCarrinhoActionPerformed

    private void alterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarProdutoActionPerformed
        int codigo = Integer.parseInt(txtCodigoProduto.getText());
        String nome = txtNomeProduto.getText();
        double preco = Double.parseDouble(txtPrecoProduto.getText());
        
        for (int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).getCodigo() == codigo){
                produtos.remove(produtos.get(i));
                produtos.add(new Produto(codigo, nome, preco));
                
                try {
                    File arquivo = new File("produtos.dat");
                    FileOutputStream fluxoSaidaArquivo = new FileOutputStream(arquivo);
                    saidaProduto = new ObjectOutputStream(fluxoSaidaArquivo);
                    saidaProduto.writeObject(produtos);
                    saidaProduto.close();
                    fluxoSaidaArquivo.close();
                    JOptionPane.showMessageDialog(this,"Alterado com sucesso !");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        

        txtCodigoProduto.setText("");
        txtNomeProduto.setText("");
        txtPrecoProduto.setText("");
        criarTabelaProduto();
        
        
        
    }//GEN-LAST:event_alterarProdutoActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        int cpf = Integer.parseInt(txtCPF.getText());
        String nome = txtNome.getText();
        String dataNascimento = txtDataNascimento.getText();
        String contato = txtContato.getText();

        for (int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getCpf() == cpf){
                clientes.remove(clientes.get(i));
                clientes.add(new Cliente(cpf, nome, dataNascimento, contato));
                
                try {
                    File arquivo = new File("clientes.dat");
                    FileOutputStream fluxoSaidaArquivo = new FileOutputStream(arquivo);
                    saida = new ObjectOutputStream(fluxoSaidaArquivo);
                    saida.writeObject(clientes);
                    saida.close();
                    fluxoSaidaArquivo.close();
                    JOptionPane.showMessageDialog(this,"Atualizado com sucesso !");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.toString(), "Erro!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        
        txtCPF.setText("");
        txtNome.setText("");
        txtDataNascimento.setText("");
        txtContato.setText("");
        criarTabela();
    }//GEN-LAST:event_alterarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtualizarPedido;
    private javax.swing.JPanel Cliente;
    private javax.swing.JButton Remover;
    private javax.swing.JButton RemoverPedido;
    private javax.swing.JButton RemoverProduto;
    private javax.swing.JButton alterar;
    private javax.swing.JButton alterarProduto;
    private javax.swing.JButton atualizarProduto;
    private javax.swing.JButton cadastar;
    private javax.swing.JButton cadastarCarrinho;
    private javax.swing.JButton cadastarPedido;
    private javax.swing.JButton cadastarProduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea listaPedidos;
    private javax.swing.JTabbedPane paneCliente;
    private javax.swing.JPanel pedido;
    private javax.swing.JPanel produto;
    private javax.swing.JTable tableClientes;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCodigoClientePedido;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtCodigoProdutoCarrinho;
    private javax.swing.JTextField txtCodigoRemocao;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtDescontoCarrinho;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtNumeroPedido;
    private javax.swing.JTextField txtNumeroPedidoCarrinho;
    private javax.swing.JTextField txtPrecoProduto;
    private javax.swing.JTextField txtQuantidadeCarrinho;
    // End of variables declaration//GEN-END:variables
}
