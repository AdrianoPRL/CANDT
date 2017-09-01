package br.com.senac.candt.pi3;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;



public class CadastrarProduto extends javax.swing.JInternalFrame {
   
    public CadastrarProduto() {
        initComponents();
      inicializarData();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldCategoria = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SalvarButton = new javax.swing.JButton();
        CancelarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDesc = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        Data = new javax.swing.JFormattedTextField();
        jFValCompra = new javax.swing.JFormattedTextField();
        jFValorVenda = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastrar Produto");

        jLabel1.setText("Nome: ");

        fieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Descrição: ");

        jLabel3.setText("Categoria: ");

        jLabel6.setText("Valor Venda: ");

        jLabel7.setText("Valor Compra: ");

        SalvarButton.setText("Salvar");
        SalvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarButtonActionPerformed(evt);
            }
        });

        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });

        textDesc.setColumns(20);
        textDesc.setRows(5);
        jScrollPane1.setViewportView(textDesc);

        jLabel4.setText("Data/Hora:");

        Data.setEditable(false);

        jFValCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFValCompraFocusLost(evt);
            }
        });
        jFValCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFValCompraKeyTyped(evt);
            }
        });

        jFValorVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFValorVendaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SalvarButton)
                .addGap(18, 18, 18)
                .addComponent(CancelarButton)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jFValCompra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(Data, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jFValorVenda))
                        .addGap(16, 16, 16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CancelarButton, SalvarButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(fieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jFValCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalvarButton)
                    .addComponent(CancelarButton))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fieldCategoria, fieldNome});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CancelarButton, SalvarButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNomeActionPerformed
      
    }//GEN-LAST:event_fieldNomeActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void SalvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarButtonActionPerformed
          DAOProduto dao=new DAOProduto();
        Produto prod= new Produto();
       
        prod.setDescricao(textDesc.getText());
        prod.setCategorias(fieldCategoria.getText());
        prod.setNome(fieldNome.getText());
        
        BigDecimal x=new BigDecimal(jFValCompra.getText());
        BigDecimal y=new BigDecimal(jFValorVenda.getText());
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
        jFValorVenda.setText("");
        textDesc.setText("");
         
    }//GEN-LAST:event_SalvarButtonActionPerformed

    private void jFValCompraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFValCompraFocusLost
          String a=jFValCompra.getText();
        String b=a.replace(",", ".").replace(" ", ".00");
        jFValCompra.setValue(b);




    }//GEN-LAST:event_jFValCompraFocusLost

    private void jFValCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFValCompraKeyTyped
    

    }//GEN-LAST:event_jFValCompraKeyTyped

    private void jFValorVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFValorVendaFocusLost
       String a=jFValorVenda.getText();
        String b=a.replace(",", ".").replace(" ", ".00");
        
        jFValorVenda.setValue(b);

    }//GEN-LAST:event_jFValorVendaFocusLost
  private void inicializarData(){
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date hoje = Calendar.getInstance().getTime();
        String reportDate = df.format(hoje);
        Data.setText(reportDate);
        
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarButton;
    private javax.swing.JFormattedTextField Data;
    private javax.swing.JButton SalvarButton;
    private javax.swing.JTextField fieldCategoria;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JFormattedTextField jFValCompra;
    private javax.swing.JFormattedTextField jFValorVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textDesc;
    // End of variables declaration//GEN-END:variables
}
