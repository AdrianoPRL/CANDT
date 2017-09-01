
package br.com.senac.candt.pi3;

import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author natalia.bandrade
 */
public class TelaInicial extends javax.swing.JFrame {
    CadastrarProduto cadastroProduto=null;
    ConsultarProduto consultaProduto=null;
    ModificaProduto atualizaProduto=null;
    public TelaInicial() {
        initComponents();
      
    }
    public CadastrarProduto getCadastrarCliente(){
        return cadastroProduto;
    }
    public void setCadastrarProduto(CadastrarProduto cadastraProduto){
        this.cadastroProduto=cadastraProduto;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inicial = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmenuProduto = new javax.swing.JMenu();
        jmenuItemCadastra = new javax.swing.JMenuItem();
        jmenuConsultar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Produtos");

        Inicial.setToolTipText("");
        Inicial.setAutoscrolls(true);
        Inicial.setName(""); // NOI18N
        Inicial.setPreferredSize(new java.awt.Dimension(1020, 700));

        javax.swing.GroupLayout InicialLayout = new javax.swing.GroupLayout(Inicial);
        Inicial.setLayout(InicialLayout);
        InicialLayout.setHorizontalGroup(
            InicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        InicialLayout.setVerticalGroup(
            InicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jmenuProduto.setText("Produto");
        jmenuProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmenuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuProdutoActionPerformed(evt);
            }
        });

        jmenuItemCadastra.setText("Cadastrar");
        jmenuItemCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuItemCadastraActionPerformed(evt);
            }
        });
        jmenuProduto.add(jmenuItemCadastra);

        jmenuConsultar.setText("Consultar");
        jmenuConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuConsultarActionPerformed(evt);
            }
        });
        jmenuProduto.add(jmenuConsultar);

        jMenuBar1.add(jmenuProduto);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmenuItemCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuItemCadastraActionPerformed
          if(cadastroProduto==null||!cadastroProduto.isDisplayable()){
            cadastroProduto=new CadastrarProduto();
            Inicial.add(cadastroProduto);
            this.openFrameInCenter(cadastroProduto);
        }
    }//GEN-LAST:event_jmenuItemCadastraActionPerformed

    private void jmenuConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuConsultarActionPerformed
        if(consultaProduto==null||!consultaProduto.isDisplayable()){
            consultaProduto=new ConsultarProduto();
            Inicial.add(consultaProduto);
            this.openFrameInCenter(consultaProduto);
        }
    }//GEN-LAST:event_jmenuConsultarActionPerformed

    private void jmenuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuProdutoActionPerformed
      

    }//GEN-LAST:event_jmenuProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }
    public void openFrameInCenter(JInternalFrame jif){
        Dimension desktopSize=Inicial.getSize();
        Dimension jInternalFrameSize=jif.getSize();
        int width=(desktopSize.width-jInternalFrameSize.width)/2;
         int height=(desktopSize.height-jInternalFrameSize.height)/2;
         jif.setLocation(width, height);
         jif.setVisible(true);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JDesktopPane Inicial;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmenuConsultar;
    private javax.swing.JMenuItem jmenuItemCadastra;
    private javax.swing.JMenu jmenuProduto;
    // End of variables declaration//GEN-END:variables
}
