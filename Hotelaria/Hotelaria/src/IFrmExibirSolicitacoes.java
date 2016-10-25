/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulo
 */
public class IFrmExibirSolicitacoes extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmExibirSolicitacoes
     */
    public IFrmExibirSolicitacoes() {
        initComponents();
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IFrmAtualizarCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IFrmAtualizarCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IFrmAtualizarCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IFrmAtualizarCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSolicitado = new javax.swing.JLabel();
        lblCentro = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        lblExibeQtd = new javax.swing.JLabel();
        btnBaixarEstoque = new javax.swing.JButton();
        chbResolvido = new javax.swing.JCheckBox();
        jDBButtonPrevious1 = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        jDBButtonNext1 = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        jDBButtonSave1 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBButtonRefresh1 = new lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh();

        setClosable(true);
        setIconifiable(true);
        setTitle("Solicitações");

        lblSolicitado.setText("Solicitado por");

        lblCentro.setText("Centro de custo será exibido nessa label");

        lblQuantidade.setText("Quantidade");

        lblExibeQtd.setText("Quantidade será exibida nessa label");

        btnBaixarEstoque.setText("Baixar Estoque");
        btnBaixarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaixarEstoqueActionPerformed(evt);
            }
        });

        chbResolvido.setText("Resolvido");

        jDBButtonPrevious1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fast-backward24px.png"))); // NOI18N
        jDBButtonPrevious1.setText("");

        jDBButtonNext1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fast-forward24px.png"))); // NOI18N
        jDBButtonNext1.setText("");

        jDBButtonSave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/savePixelBuddha24px.png"))); // NOI18N
        jDBButtonSave1.setText("");

        jDBButtonRefresh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/reload.png"))); // NOI18N
        jDBButtonRefresh1.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSolicitado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCentro))
                    .addComponent(btnBaixarEstoque)
                    .addComponent(chbResolvido)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jDBButtonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jDBButtonRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jDBButtonPrevious1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jDBButtonNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblQuantidade)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblExibeQtd))))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDBButtonNext1, jDBButtonPrevious1, jDBButtonRefresh1, jDBButtonSave1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSolicitado)
                    .addComponent(lblCentro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidade)
                    .addComponent(lblExibeQtd))
                .addGap(18, 18, 18)
                .addComponent(btnBaixarEstoque)
                .addGap(11, 11, 11)
                .addComponent(chbResolvido)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jDBButtonPrevious1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNext1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDBButtonNext1, jDBButtonPrevious1, jDBButtonRefresh1, jDBButtonSave1});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBaixarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaixarEstoqueActionPerformed
        
    }//GEN-LAST:event_btnBaixarEstoqueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaixarEstoque;
    private javax.swing.JCheckBox chbResolvido;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext jDBButtonNext1;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious jDBButtonPrevious1;
    private lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh jDBButtonRefresh1;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave1;
    private javax.swing.JLabel lblCentro;
    private javax.swing.JLabel lblExibeQtd;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblSolicitado;
    // End of variables declaration//GEN-END:variables
}
