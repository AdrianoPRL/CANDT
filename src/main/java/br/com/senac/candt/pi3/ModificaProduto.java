/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.candt.pi3;

import java.math.BigDecimal;
import java.util.Date;
import javax.swing.JOptionPane;



/**
 *
 * @author cassia.bmoura
 */
public class ModificaProduto extends javax.swing.JInternalFrame {
     Produto prod=new Produto();
    
    public ModificaProduto() {
        initComponents();
        aa();
    }
     public void setProduto(Produto prod){
       this.prod=prod;
   }
   public Produto getProduto(){
       return prod;
      
   }
     
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        salvarButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldCategoria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDesc = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        Data = new javax.swing.JFormattedTextField();
        jFValCompra = new javax.swing.JFormattedTextField();
        jFValVenda = new javax.swing.JFormattedTextField();
        fieldNome = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Atualizar Produto");

        jLabel6.setText("Valor Venda: ");

        jLabel7.setText("Valor Compra: ");

        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        jLabel1.setText("Nome: ");

        jLabel2.setText("Descrição: ");

        jLabel3.setText("Categoria: ");

        textDesc.setColumns(20);
        textDesc.setRows(5);
        jScrollPane1.setViewportView(textDesc);

        jLabel4.setText("Data/Hora:");

        Data.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFValCompra)
                            .addComponent(fieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldCategoria)
                            .addComponent(Data)
                            .addComponent(jFValVenda))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvarButton)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jFValVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jFValCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarButton)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        DAOProduto dao=new DAOProduto();
        Produto prod= new Produto();
       
        prod.setDescricao(textDesc.getText());
        prod.setCategorias(fieldCategoria.getText());
        prod.setNome(fieldNome.getText());
        BigDecimal x=new BigDecimal(jFValCompra.getText());
        BigDecimal y=new BigDecimal(jFValVenda.getText());
        prod.setValorCompra(x);
        prod.setValorVenda(y);
          Date data = null;
        try {
            data = (Date) Data.getValue();
        } catch (Exception e) {
           prod.setDtCadastro(data);
        }
        try {
         
                 dao.incluirComTransacao(prod);
        } catch (Exception e) {
          
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(rootPane, "Produto inserido",
                "Cadastro efetuado", JOptionPane.INFORMATION_MESSAGE);

       
       fieldCategoria.setText("");
        fieldNome.setText("");
        jFValCompra.setText("");
        jFValVenda.setText("");
        textDesc.setText("");

    }//GEN-LAST:event_salvarButtonActionPerformed
 public void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) { 
//      fieldCategoria.setText("ashuahsasa");
//        fieldCategoria.setText(prod.getCategorias());
//      fieldNome.setText(prod.getNome());
//      jFValCompra.setValue(prod.getValorCompra());
//      jFValVenda.setValue(prod.getValorVenda());
//      Data.setValue(prod.getDtCadastro());
//      textDesc.setText(prod.getDescricao());

 }
        public void aa(){
            System.out.println(prod.getDescricao());
        
           
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Data;
    private javax.swing.JTextField fieldCategoria;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFValCompra;
    private javax.swing.JFormattedTextField jFValVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salvarButton;
    private javax.swing.JTextArea textDesc;
    // End of variables declaration//GEN-END:variables
}
