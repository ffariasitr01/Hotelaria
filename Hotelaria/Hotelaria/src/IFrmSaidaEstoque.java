/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulo
 */
public class IFrmSaidaEstoque extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmSaidaEstoque
     */
    public IFrmSaidaEstoque() {
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

        lblProdutos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDBTable1 = new lib.jdb.control.jdbtable.JDBTable();
        lblCodigo = new javax.swing.JLabel();
        lblExibicaoCod = new javax.swing.JLabel();
        lblEntrada = new javax.swing.JLabel();
        txtEntrada = new lib.jdb.control.jdbtextfield.JDBTextField();
        cbDestino = new lib.jdb.control.jdbcombobox.JDBComboBox();
        lblDestino = new javax.swing.JLabel();
        txtQuantidade = new lib.jdb.control.jdbtextfield.JDBTextField();
        lblQuantidade = new javax.swing.JLabel();
        lblObservacao = new javax.swing.JLabel();
        txtObservacao = new lib.jdb.control.jdbtextarea.JDBTextArea();
        jDBButtonNew1 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonSave1 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBButtonRefresh1 = new lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh();
        jDBButtonCancel1 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Saida de Estoque");

        lblProdutos.setText("Tabela para escolher o produto");

        jDBTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jDBTable1);

        lblCodigo.setText("Código");

        lblExibicaoCod.setText("O código aparecerá nessa label");

        lblEntrada.setText("Data de Saída");

        cbDestino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Apartamentos", "Cozinha", "Manutenção", "Recepção" }));

        lblDestino.setText("Destino/Centro de custo");

        lblQuantidade.setText("Quantidade");

        lblObservacao.setText("Observação");

        jDBButtonNew1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/file24px.png"))); // NOI18N
        jDBButtonNew1.setText("");

        jDBButtonSave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/savePixelBuddha24px.png"))); // NOI18N
        jDBButtonSave1.setText("");

        jDBButtonRefresh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/reload.png"))); // NOI18N
        jDBButtonRefresh1.setText("");

        jDBButtonCancel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/error.png"))); // NOI18N
        jDBButtonCancel1.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtObservacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProdutos)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblExibicaoCod))
                            .addComponent(lblObservacao)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQuantidade)
                                .addGap(18, 18, 18)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(lblEntrada)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblDestino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jDBButtonNew1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDBButtonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDBButtonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDBButtonRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDBButtonCancel1, jDBButtonNew1, jDBButtonRefresh1, jDBButtonSave1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProdutos)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(lblExibicaoCod)
                    .addComponent(lblEntrada)
                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidade)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDestino)
                    .addComponent(cbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblObservacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jDBButtonRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNew1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDBButtonCancel1, jDBButtonNew1, jDBButtonRefresh1, jDBButtonSave1});

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib.jdb.control.jdbcombobox.JDBComboBox cbDestino;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel1;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew1;
    private lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh jDBButtonRefresh1;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave1;
    private lib.jdb.control.jdbtable.JDBTable jDBTable1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblExibicaoCod;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblQuantidade;
    private lib.jdb.control.jdbtextfield.JDBTextField txtEntrada;
    private lib.jdb.control.jdbtextarea.JDBTextArea txtObservacao;
    private lib.jdb.control.jdbtextfield.JDBTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}