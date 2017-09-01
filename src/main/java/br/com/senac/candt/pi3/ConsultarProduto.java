package br.com.senac.candt.pi3;


import java.awt.Dimension;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConsultarProduto extends javax.swing.JInternalFrame {
     AtualizarProduto attaProd = new AtualizarProduto();
  String ultimaPesquisa = null;
    public ConsultarProduto() {
        initComponents();
    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fieldBusca = new javax.swing.JTextField();
        PesquisarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableConsulta = new javax.swing.JTable();
        SairButton = new javax.swing.JButton();
        ExcluirButton = new javax.swing.JButton();
        AlterarButton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Produto");
        setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N

        jLabel1.setText("Pesquisar:");

        PesquisarButton.setText("Pesquisar");
        PesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarButtonActionPerformed(evt);
            }
        });

        TableConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Valor compra", "Valor venda", "Categoria", "ID", "Data/Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableConsulta);

        SairButton.setText("Sair");
        SairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairButtonActionPerformed(evt);
            }
        });

        ExcluirButton.setText("Excluir");
        ExcluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirButtonActionPerformed(evt);
            }
        });

        AlterarButton.setText("Alterar");
        AlterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PesquisarButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExcluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AlterarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PesquisarButton))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SairButton)
                    .addComponent(ExcluirButton)
                    .addComponent(AlterarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public boolean refreshList() throws Exception {
    DAOProduto dao=new DAOProduto();
        Produto p=new Produto();
        p =dao.procurar(ultimaPesquisa);
        DefaultTableModel model = (DefaultTableModel) TableConsulta.getModel();
        model.setRowCount(0);
        if (p == null ) {
              return false;
         }
     
            if ( p != null) {
                Object[] row = new Object[7];
               
                row[0] =  p.getNome();
                row[1] =  p.getDescricao();
                row[2] =  p.getValorCompra();
                row[3] =  p.getValorVenda();
                row[4] = p.getCategorias();
                row[5] = p.getId();
                row[6]=p.getDtCadastro();
                model.addRow(row);
            }
              
         return true;
 
 }
   
    private void SairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairButtonActionPerformed
            this.dispose();
    }//GEN-LAST:event_SairButtonActionPerformed

    private void AlterarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarButtonActionPerformed
            DAOProduto dao=new DAOProduto(); 
        try {
            
            final int row = TableConsulta.getSelectedRow();
           
            if (row >= 0) {
                
                String  nome = (String) TableConsulta.getValueAt(row, 0);
                  Produto p =dao.procurar(nome);
               
                attaProd.dispose();
                attaProd = new AtualizarProduto();
                attaProd.setProduto(p);
                attaProd.setTitle("Produto " + p.getNome());
              
                this.getParent().add(attaProd);
                this.openFrameInCenter(attaProd);                
                attaProd.toFront();
            }
        } catch (Exception e) {
          
            e.printStackTrace();
            
            JOptionPane.showMessageDialog(rootPane, "Não é possível "
                + "exibir os detalhes deste produto.",
                "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
        }
   
                                   
    }//GEN-LAST:event_AlterarButtonActionPerformed

    private void ExcluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirButtonActionPerformed
        if (TableConsulta.getSelectedRow() >= 0) {

               DAOProduto dao=new DAOProduto();
              final int row = TableConsulta.getSelectedRow();
              
               String cod = (String) TableConsulta.getValueAt(row, 0);
               int resposta = JOptionPane.showConfirmDialog(rootPane,
               "Excluir o Produto \"" + cod + "\"?",
               "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
             
               if (resposta == JOptionPane.YES_OPTION) {
                   
                try {
                    long codProd = (long) TableConsulta.getValueAt(row, 5);
                    dao.excluir(codProd);
                } catch (Exception e) {
                    
                    e.printStackTrace();
                    
                    JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                            "Falha na Exclusão", JOptionPane.ERROR_MESSAGE);
                    
                }
            }
        }
    }//GEN-LAST:event_ExcluirButtonActionPerformed

    private void PesquisarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarButtonActionPerformed
             boolean resultSearch = false;
        
      
        if (fieldBusca.getText() != null &&
                !fieldBusca.getText().equals("")) {
            try {
                ultimaPesquisa = (fieldBusca.getText());
            } catch (Exception e) {
               
                JOptionPane.showMessageDialog(rootPane, "Só é possível"
                        + " pesquisar por um valor inteiro válido",
                        "Campo de pesquisa inválido", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        else {
            ultimaPesquisa = null;
        }

        try {
            
            resultSearch = refreshList();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
            return;
        }


        if (!resultSearch) {
            JOptionPane.showMessageDialog(rootPane, "A pesquisa não retornou "
                + "resultados ", "Sem resultados",
                JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_PesquisarButtonActionPerformed
public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = this.getParent().getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarButton;
    private javax.swing.JButton ExcluirButton;
    private javax.swing.JButton PesquisarButton;
    private javax.swing.JButton SairButton;
    private javax.swing.JTable TableConsulta;
    private javax.swing.JTextField fieldBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
