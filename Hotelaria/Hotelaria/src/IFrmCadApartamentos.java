/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulo
 */
public class IFrmCadApartamentos extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmCadApartamentos
     */
    public IFrmCadApartamentos() {
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

        lblNumero = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        txtNumero = new lib.jdb.control.jdbtextfield.JDBTextField();
        cbCategoria = new lib.jdb.control.jdblistcombobox.JDBListComboBox();
        cbTipo = new lib.jdb.control.jdblistcombobox.JDBListComboBox();
        txtNumero1 = new lib.jdb.control.jdbtextfield.JDBTextField();
        lblNumero1 = new javax.swing.JLabel();
        lblNumero2 = new javax.swing.JLabel();
        lblNumero3 = new javax.swing.JLabel();
        lblNumero4 = new javax.swing.JLabel();
        jDBRadioButton1 = new lib.jdb.control.jdbradiobutton.JDBRadioButton();
        jDBRadioButton2 = new lib.jdb.control.jdbradiobutton.JDBRadioButton();
        jDBSpinner1 = new lib.jdb.control.jdbspinner.JDBSpinner();
        jDBButtonNext1 = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDBList1 = new lib.jdb.control.jdblist.JDBList();
        jDBButtonPrevious1 = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        jScrollPane2 = new javax.swing.JScrollPane();
        jDBList2 = new lib.jdb.control.jdblist.JDBList();
        jDBButtonDelete1 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();
        jDBButtonFirst1 = new lib.jdb.control.jdbbuttonfirst.JDBButtonFirst();
        jDBButtonLast1 = new lib.jdb.control.jdbbuttonlast.JDBButtonLast();
        jDBButtonNew1 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonSave1 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBButtonPrevious2 = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        jDBButtonNext2 = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        jDBButtonRefresh1 = new lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh();
        jDBButtonCancel1 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Apartamentos");

        lblNumero.setText("Número");

        lblTipo.setText("Tipo");

        lblCategoria.setText("Categoria");

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteiro", "Casal", "Família" }));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Simples", "Luxo" }));

        lblNumero1.setText("Valor (R$)");

        lblNumero2.setText("Opcionais");

        lblNumero3.setText("Capacidade");

        lblNumero4.setText("Fumante");

        jDBRadioButton1.setText("Sim");
        jDBRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBRadioButton1ActionPerformed(evt);
            }
        });

        jDBRadioButton2.setText("Não");
        jDBRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDBRadioButton2ActionPerformed(evt);
            }
        });

        jDBButtonNext1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fast-forward24px.png"))); // NOI18N
        jDBButtonNext1.setActionCommand("");
        jDBButtonNext1.setText("");

        jDBList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Banheira", "Ar Condicionado", "TV LED 50\"", "TV LED 42\"", "TV LED 32\"" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jDBList1);

        jDBButtonPrevious1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fast-backward24px.png"))); // NOI18N
        jDBButtonPrevious1.setText("");

        jDBList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Banheira", "Ar Condicionado", "TV LED 50\"", "TV LED 42\"", "TV LED 32\"" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jDBList2);

        jDBButtonDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/trashCan24px.png"))); // NOI18N
        jDBButtonDelete1.setText("");

        jDBButtonFirst1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/first24px.png"))); // NOI18N
        jDBButtonFirst1.setText("");

        jDBButtonLast1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/last24px.png"))); // NOI18N
        jDBButtonLast1.setText("");

        jDBButtonNew1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/file24px.png"))); // NOI18N
        jDBButtonNew1.setText("");

        jDBButtonSave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/savePixelBuddha24px.png"))); // NOI18N
        jDBButtonSave1.setText("");

        jDBButtonPrevious2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fast-backward24px.png"))); // NOI18N
        jDBButtonPrevious2.setText("");

        jDBButtonNext2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fast-forward24px.png"))); // NOI18N
        jDBButtonNext2.setText("");

        jDBButtonRefresh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/reload.png"))); // NOI18N
        jDBButtonRefresh1.setText("");

        jDBButtonCancel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/error.png"))); // NOI18N
        jDBButtonCancel1.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumero3)
                            .addComponent(lblNumero)
                            .addComponent(lblTipo)
                            .addComponent(lblNumero2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jDBSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCategoria)
                                    .addComponent(lblNumero1)
                                    .addComponent(lblNumero4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jDBRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jDBRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNumero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDBButtonNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDBButtonPrevious1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDBButtonNew1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBButtonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBButtonDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBButtonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBButtonRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBButtonFirst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBButtonPrevious2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBButtonNext2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBButtonLast1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDBButtonCancel1, jDBButtonDelete1, jDBButtonFirst1, jDBButtonLast1, jDBButtonNew1, jDBButtonNext2, jDBButtonPrevious2, jDBButtonRefresh1, jDBButtonSave1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(lblCategoria)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero1)
                    .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero3)
                    .addComponent(lblNumero4)
                    .addComponent(jDBRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jDBButtonNext1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDBButtonPrevious1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addComponent(lblNumero2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jDBButtonDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonFirst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonLast1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNew1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonPrevious2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNext2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDBButtonCancel1, jDBButtonDelete1, jDBButtonFirst1, jDBButtonLast1, jDBButtonNew1, jDBButtonNext2, jDBButtonPrevious2, jDBButtonRefresh1, jDBButtonSave1});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDBRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBRadioButton1ActionPerformed

    private void jDBRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDBRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDBRadioButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib.jdb.control.jdblistcombobox.JDBListComboBox cbCategoria;
    private lib.jdb.control.jdblistcombobox.JDBListComboBox cbTipo;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel1;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete1;
    private lib.jdb.control.jdbbuttonfirst.JDBButtonFirst jDBButtonFirst1;
    private lib.jdb.control.jdbbuttonlast.JDBButtonLast jDBButtonLast1;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew1;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext jDBButtonNext1;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext jDBButtonNext2;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious jDBButtonPrevious1;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious jDBButtonPrevious2;
    private lib.jdb.control.jdbbuttonrefresh.JDBButtonRefresh jDBButtonRefresh1;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave1;
    private lib.jdb.control.jdblist.JDBList jDBList1;
    private lib.jdb.control.jdblist.JDBList jDBList2;
    private lib.jdb.control.jdbradiobutton.JDBRadioButton jDBRadioButton1;
    private lib.jdb.control.jdbradiobutton.JDBRadioButton jDBRadioButton2;
    private lib.jdb.control.jdbspinner.JDBSpinner jDBSpinner1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblNumero2;
    private javax.swing.JLabel lblNumero3;
    private javax.swing.JLabel lblNumero4;
    private javax.swing.JLabel lblTipo;
    private lib.jdb.control.jdbtextfield.JDBTextField txtNumero;
    private lib.jdb.control.jdbtextfield.JDBTextField txtNumero1;
    // End of variables declaration//GEN-END:variables
}
