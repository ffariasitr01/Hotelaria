/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulo
 */
public class IFrmCadFornecedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmCadFornecedores
     */
    public IFrmCadFornecedores() {
        initComponents();
        Fornecedor.connectDB();
        qryFornecedor.execQuery();
        
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

        Fornecedor = new lib.jdb.connection.JDBConnection();
        qryFornecedor = new lib.jdb.jdbquery.JDBQuery();
        txtBairro = new lib.jdb.control.jdbtextfield.JDBTextField();
        txtTelefone1 = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBMaskedTextField1 = new lib.jdb.control.jdbmaskedtextfield.JDBMaskedTextField();
        lblCelular = new javax.swing.JLabel();
        jDBMaskedTextField2 = new lib.jdb.control.jdbmaskedtextfield.JDBMaskedTextField();
        jDBMaskedTextField3 = new lib.jdb.control.jdbmaskedtextfield.JDBMaskedTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone2 = new lib.jdb.control.jdbtextfield.JDBTextField();
        lblEmail = new javax.swing.JLabel();
        jDBMaskedTextField4 = new lib.jdb.control.jdbmaskedtextfield.JDBMaskedTextField();
        txtEmail = new lib.jdb.control.jdbtextfield.JDBTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new lib.jdb.control.jdbtextfield.JDBTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new lib.jdb.control.jdbtextfield.JDBTextField();
        cbEstado = new lib.jdb.control.jdbcombobox.JDBComboBox();
        lblEstado = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        lblFantasia = new javax.swing.JLabel();
        txtFantasia = new lib.jdb.control.jdbtextfield.JDBTextField();
        lblRazao = new javax.swing.JLabel();
        txtRazao = new lib.jdb.control.jdbtextfield.JDBTextField();
        txtNumero = new lib.jdb.control.jdbtextfield.JDBTextField();
        lblCNPJ = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblInscricao = new javax.swing.JLabel();
        txtInscricao = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBButtonFirst1 = new lib.jdb.control.jdbbuttonfirst.JDBButtonFirst();
        jDBButtonLast1 = new lib.jdb.control.jdbbuttonlast.JDBButtonLast();
        jDBButtonNew1 = new lib.jdb.control.jdbbuttonnew.JDBButtonNew();
        jDBButtonSave1 = new lib.jdb.control.jdbbuttonsave.JDBButtonSave();
        jDBButtonPrevious1 = new lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious();
        jDBButtonNext1 = new lib.jdb.control.jdbbuttonnext.JDBButtonNext();
        jDBButtonCancel1 = new lib.jdb.control.jdbbuttoncancel.JDBButtonCancel();
        jDBButtonDelete1 = new lib.jdb.control.jdbbuttondelete.JDBButtonDelete();

        Fornecedor.setURL("jdbc:mysql://localhost/hotelaria");
        Fornecedor.setDriver("com.mysql.jdbc.Driver ");
        Fornecedor.setPassword("");
        Fornecedor.setUserName("root");

        qryFornecedor.setJDBConnection(Fornecedor);
        qryFornecedor.setSQL("select * from fornecedor");

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro Fornecedores");

        txtBairro.setJDBQuery(qryFornecedor);
        txtBairro.setFieldName("bairro_forne");

        txtTelefone1.setJDBQuery(qryFornecedor);
        txtTelefone1.setFieldName("ddd_tel_forne");

        jDBMaskedTextField1.setJDBQuery(qryFornecedor);
        jDBMaskedTextField1.setFieldName("cep_forne");
        jDBMaskedTextField1.setMask("#####-###");

        lblCelular.setText("Celular");

        jDBMaskedTextField2.setJDBQuery(qryFornecedor);
        jDBMaskedTextField2.setFieldName("tel_forne");

        jDBMaskedTextField3.setJDBQuery(qryFornecedor);
        jDBMaskedTextField3.setFieldName("cel_forne");
        jDBMaskedTextField3.setMask("#####-####");

        lblTelefone.setText("Telefone");

        txtTelefone2.setJDBQuery(qryFornecedor);
        txtTelefone2.setFieldName("ddd_cel_forne");

        lblEmail.setText("Email");

        jDBMaskedTextField4.setJDBQuery(qryFornecedor);
        jDBMaskedTextField4.setFieldName("cnpj_forne");
        jDBMaskedTextField4.setMask("###.###.###/####-##");

        txtEmail.setJDBQuery(qryFornecedor);
        txtEmail.setFieldName("email_forne");

        lblEndereco.setText("Endereço");

        txtEndereco.setJDBQuery(qryFornecedor);
        txtEndereco.setFieldName("endereco_forne");

        lblCidade.setText("Cidade");

        txtCidade.setJDBQuery(qryFornecedor);
        txtCidade.setFieldName("cidade_forne");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RN", "RS", "RJ", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbEstado.setJDBQuery(qryFornecedor);
        cbEstado.setFieldName("estado_forne");

        lblEstado.setText("Estado");

        lblCep.setText("CEP");

        lblFantasia.setText("Nome Fantasia");

        txtFantasia.setJDBQuery(qryFornecedor);
        txtFantasia.setFieldName("nome_forne");

        lblRazao.setText("Razão Social");

        txtRazao.setJDBQuery(qryFornecedor);
        txtRazao.setFieldName("razao_forne");

        txtNumero.setJDBQuery(qryFornecedor);
        txtNumero.setFieldName("numero_forne");

        lblCNPJ.setText("CNPJ");

        lblNumero.setText("nº");

        lblBairro.setText("Bairro");

        lblInscricao.setText("I.E");

        txtInscricao.setJDBQuery(qryFornecedor);
        txtInscricao.setFieldName("insc_est_forne");

        jDBButtonFirst1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/first24px.png"))); // NOI18N
        jDBButtonFirst1.setJDBQuery(qryFornecedor);
        jDBButtonFirst1.setText("");

        jDBButtonLast1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/last24px.png"))); // NOI18N
        jDBButtonLast1.setJDBQuery(qryFornecedor);
        jDBButtonLast1.setText("");

        jDBButtonNew1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/file24px.png"))); // NOI18N
        jDBButtonNew1.setJDBQuery(qryFornecedor);
        jDBButtonNew1.setText("");

        jDBButtonSave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/savePixelBuddha24px.png"))); // NOI18N
        jDBButtonSave1.setJDBQuery(qryFornecedor);
        jDBButtonSave1.setText("");

        jDBButtonPrevious1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fast-backward24px.png"))); // NOI18N
        jDBButtonPrevious1.setJDBQuery(qryFornecedor);
        jDBButtonPrevious1.setText("");

        jDBButtonNext1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fast-forward24px.png"))); // NOI18N
        jDBButtonNext1.setJDBQuery(qryFornecedor);
        jDBButtonNext1.setText("");

        jDBButtonCancel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/error.png"))); // NOI18N
        jDBButtonCancel1.setJDBQuery(qryFornecedor);
        jDBButtonCancel1.setText("");

        jDBButtonDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/trashCan24px.png"))); // NOI18N
        jDBButtonDelete1.setText("");
        jDBButtonDelete1.setJDBQuery(qryFornecedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFantasia)
                                    .addComponent(lblTelefone)
                                    .addComponent(lblEmail)
                                    .addComponent(lblEndereco)
                                    .addComponent(lblBairro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNumero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jDBMaskedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jDBMaskedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCelular)
                                            .addComponent(lblInscricao))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jDBMaskedTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addComponent(txtFantasia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblCidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRazao)
                                .addGap(21, 21, 21)
                                .addComponent(txtRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCNPJ)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(jDBMaskedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblCep))
                                .addGap(18, 18, 18)
                                .addComponent(lblEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jDBButtonNew1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBButtonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBButtonDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBButtonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBButtonFirst1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBButtonPrevious1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBButtonNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBButtonLast1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDBButtonCancel1, jDBButtonDelete1, jDBButtonFirst1, jDBButtonLast1, jDBButtonNew1, jDBButtonNext1, jDBButtonPrevious1, jDBButtonSave1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRazao)
                    .addComponent(txtRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFantasia)
                    .addComponent(txtFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCNPJ)
                    .addComponent(lblInscricao)
                    .addComponent(txtInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBMaskedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone)
                    .addComponent(lblCelular)
                    .addComponent(jDBMaskedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBMaskedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCep)
                    .addComponent(jDBMaskedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jDBButtonSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonPrevious1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNext1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonFirst1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonLast1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDBButtonNew1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDBButtonCancel1, jDBButtonDelete1, jDBButtonFirst1, jDBButtonLast1, jDBButtonNew1, jDBButtonNext1, jDBButtonPrevious1, jDBButtonSave1});

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib.jdb.connection.JDBConnection Fornecedor;
    private lib.jdb.control.jdbcombobox.JDBComboBox cbEstado;
    private lib.jdb.control.jdbbuttoncancel.JDBButtonCancel jDBButtonCancel1;
    private lib.jdb.control.jdbbuttondelete.JDBButtonDelete jDBButtonDelete1;
    private lib.jdb.control.jdbbuttonfirst.JDBButtonFirst jDBButtonFirst1;
    private lib.jdb.control.jdbbuttonlast.JDBButtonLast jDBButtonLast1;
    private lib.jdb.control.jdbbuttonnew.JDBButtonNew jDBButtonNew1;
    private lib.jdb.control.jdbbuttonnext.JDBButtonNext jDBButtonNext1;
    private lib.jdb.control.jdbbuttonprevious.JDBButtonPrevious jDBButtonPrevious1;
    private lib.jdb.control.jdbbuttonsave.JDBButtonSave jDBButtonSave1;
    private lib.jdb.control.jdbmaskedtextfield.JDBMaskedTextField jDBMaskedTextField1;
    private lib.jdb.control.jdbmaskedtextfield.JDBMaskedTextField jDBMaskedTextField2;
    private lib.jdb.control.jdbmaskedtextfield.JDBMaskedTextField jDBMaskedTextField3;
    private lib.jdb.control.jdbmaskedtextfield.JDBMaskedTextField jDBMaskedTextField4;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFantasia;
    private javax.swing.JLabel lblInscricao;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRazao;
    private javax.swing.JLabel lblTelefone;
    private lib.jdb.jdbquery.JDBQuery qryFornecedor;
    private lib.jdb.control.jdbtextfield.JDBTextField txtBairro;
    private lib.jdb.control.jdbtextfield.JDBTextField txtCidade;
    private lib.jdb.control.jdbtextfield.JDBTextField txtEmail;
    private lib.jdb.control.jdbtextfield.JDBTextField txtEndereco;
    private lib.jdb.control.jdbtextfield.JDBTextField txtFantasia;
    private lib.jdb.control.jdbtextfield.JDBTextField txtInscricao;
    private lib.jdb.control.jdbtextfield.JDBTextField txtNumero;
    private lib.jdb.control.jdbtextfield.JDBTextField txtRazao;
    private lib.jdb.control.jdbtextfield.JDBTextField txtTelefone1;
    private lib.jdb.control.jdbtextfield.JDBTextField txtTelefone2;
    // End of variables declaration//GEN-END:variables
}
