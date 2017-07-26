package cadastro;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ultilitarios.Conexao;
/**
 *
 * @author gabriel
 */
public class Cad_Cidade extends javax.swing.JFrame {
    int inicia_combox=0;
    int navega = 0;
    Conexao con_cidade;
    String ordenacao="nome";
    /**
     * Creates new form Cad_Cidade
     */
    public Cad_Cidade() {
        initComponents();
        con_cidade = new Conexao();
        con_cidade.Conecta();
        con_cidade.executasql("SELECT * FROM cidade order by "+ordenacao);
        atualiza_combo_box_cidade();
        preencher_jtable();
    }
    
    public void atualiza_combo_box_cidade(){
        try{
            con_cidade.executasql("SELECT * FROM cidade order by "+ordenacao);
            
            cb_pesquisa.removeAllItems();
            
            
            while(con_cidade.resultset.next()){
                
                cb_pesquisa.addItem(con_cidade.resultset.getString("nome"));
            }
            con_cidade.resultset.first();
            mostra_dados();
        }
        catch(SQLException erro){
           JOptionPane.showMessageDialog(null, "Dados não localizados: "+erro);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_ordenacao = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        cb_uf = new javax.swing.JComboBox<>();
        botao_primeiro = new javax.swing.JButton();
        botao_anterior = new javax.swing.JButton();
        botao_proximo = new javax.swing.JButton();
        botao_ultimo = new javax.swing.JButton();
        botao_gravar = new javax.swing.JButton();
        botao_novo = new javax.swing.JButton();
        botao_excluir = new javax.swing.JButton();
        botao_alterar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tf_pesquisa = new javax.swing.JTextField();
        cb_pesquisa = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        rb_codigo = new javax.swing.JRadioButton();
        rb_nome = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manutenção do Cadastro de Cidade");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.pink);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manutenção do Cadastro de Cidade");

        jLabel2.setText("Codigo:");

        tf_codigo.setEnabled(false);

        jLabel3.setText("Nome:");

        jLabel4.setText("UF:");

        cb_uf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RJ", "SP", "MG", "ES", "DF", "RS", "SC", "PR", "BH", "AM", "TO", "GO", " ", " " }));

        botao_primeiro.setText("<<");
        botao_primeiro.setToolTipText("Voltar para o primeiro");
        botao_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_primeiroActionPerformed(evt);
            }
        });

        botao_anterior.setText("<");
        botao_anterior.setToolTipText("Voltar para o ultimo");
        botao_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_anteriorActionPerformed(evt);
            }
        });

        botao_proximo.setText(">");
        botao_proximo.setToolTipText("proximo");
        botao_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_proximoActionPerformed(evt);
            }
        });

        botao_ultimo.setText(">>");
        botao_ultimo.setToolTipText("Ultimo");
        botao_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_ultimoActionPerformed(evt);
            }
        });

        botao_gravar.setIcon(new javax.swing.ImageIcon("/home/gabriel/NetBeansProjects/Estoque/imagens/save.png")); // NOI18N
        botao_gravar.setToolTipText("Salvar");
        botao_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_gravarActionPerformed(evt);
            }
        });

        botao_novo.setIcon(new javax.swing.ImageIcon("/home/gabriel/NetBeansProjects/Estoque/imagens/new.png")); // NOI18N
        botao_novo.setToolTipText("Inserir");
        botao_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_novoActionPerformed(evt);
            }
        });

        botao_excluir.setIcon(new javax.swing.ImageIcon("/home/gabriel/NetBeansProjects/Estoque/imagens/delet.png")); // NOI18N
        botao_excluir.setToolTipText("Excluir");
        botao_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_excluirActionPerformed(evt);
            }
        });

        botao_alterar.setIcon(new javax.swing.ImageIcon("/home/gabriel/NetBeansProjects/Estoque/imagens/edit.png")); // NOI18N
        botao_alterar.setToolTipText("Editar");
        botao_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_alterarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.red);
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tf_pesquisa.setToolTipText("Digite as iniciais da cidade para localizar");
        tf_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pesquisaActionPerformed(evt);
            }
        });

        cb_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_pesquisaActionPerformed(evt);
            }
        });

        jLabel5.setText("Pesquisar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel5)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome da cidade", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(java.awt.Color.cyan);

        jLabel6.setText("Ordenação:");

        grupo_ordenacao.add(rb_codigo);
        rb_codigo.setText("Código");
        rb_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_codigoActionPerformed(evt);
            }
        });

        grupo_ordenacao.add(rb_nome);
        rb_nome.setSelected(true);
        rb_nome.setText("Nome");
        rb_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_nomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rb_codigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_nome))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_nome)
                    .addComponent(rb_codigo))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(33, 33, 33)
                                        .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(42, 42, 42)
                                        .addComponent(cb_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(37, 37, 37)
                                        .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(botao_primeiro)
                        .addGap(18, 18, 18)
                        .addComponent(botao_anterior)
                        .addGap(18, 18, 18)
                        .addComponent(botao_proximo)
                        .addGap(18, 18, 18)
                        .addComponent(botao_ultimo)
                        .addGap(73, 73, 73)
                        .addComponent(botao_novo)
                        .addGap(29, 29, 29)
                        .addComponent(botao_gravar)
                        .addGap(34, 34, 34)
                        .addComponent(botao_excluir)
                        .addGap(37, 37, 37)
                        .addComponent(botao_alterar)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cb_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botao_novo)
                        .addComponent(botao_gravar)
                        .addComponent(botao_excluir)
                        .addComponent(botao_alterar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botao_primeiro)
                        .addComponent(botao_anterior)
                        .addComponent(botao_proximo)
                        .addComponent(botao_ultimo)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        setBounds(0, 0, 652, 582);
    }// </editor-fold>//GEN-END:initComponents

    private void botao_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_anteriorActionPerformed
        try{
            con_cidade.resultset.previous();
            mostra_dados();
            navega = 1;
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível ir ao registro anterior "+erro);
        }
    }//GEN-LAST:event_botao_anteriorActionPerformed

    private void botao_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_proximoActionPerformed
        try{
            con_cidade.resultset.next();
            mostra_dados();
            navega = 2;
            cb_uf.setSelectedItem("RJ");
            tf_nome.requestFocus();
            tf_codigo.setEditable(false);
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível ir ao próximo registro "+erro);
        }
    }//GEN-LAST:event_botao_proximoActionPerformed

    private void botao_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_novoActionPerformed
        tf_codigo.setText("");
        tf_nome.setText("");
        
    }//GEN-LAST:event_botao_novoActionPerformed

    private void botao_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_primeiroActionPerformed
        try{
            con_cidade.resultset.first();
                mostra_dados();
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível ir ao primeiro registro "+erro);
        }
    }//GEN-LAST:event_botao_primeiroActionPerformed

    private void botao_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_ultimoActionPerformed
        try{
            con_cidade.resultset.last();
            mostra_dados();
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível ir ao último registro "+erro);
        }
    }//GEN-LAST:event_botao_ultimoActionPerformed

    private void botao_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_alterarActionPerformed
        try{
            String sql = "UPDATE cidade set nome='"+tf_nome.getText()+"',"+
                    "uf = '"+cb_uf.getSelectedItem()+"' where codigo = "+tf_codigo.getText();
            con_cidade.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Alteração realizada com sucesso!");
            //atualiza resultset
            con_cidade.executasql("Select * from cidade order by "+ordenacao);
            atualiza_combo_box_cidade();
            con_cidade.resultset.next();
            mostra_dados();
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro na alteração: "+erro);
        }
    }//GEN-LAST:event_botao_alterarActionPerformed

    private void botao_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_gravarActionPerformed
        try{
            String sqlinsert = "INSERT INTO cidade (nome,uf) VALUES ('"+
                    tf_nome.getText()+"','"+
                    cb_uf.getSelectedItem()+"')";
            con_cidade.statement.executeUpdate(sqlinsert);
            JOptionPane.showMessageDialog(null, "Gravação realizado com sucesso");
            
            
            con_cidade.executasql("SELECT * FROM cidade order by "+ordenacao);
            atualiza_combo_box_cidade();
            con_cidade.resultset.first();
            mostra_dados();
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro na gravação: " + erro);
        }
        
    }//GEN-LAST:event_botao_gravarActionPerformed

    private void botao_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_excluirActionPerformed
        try{
            String sql ="select * from cidade where codigo = "+tf_codigo.getText();
            con_cidade.executasql(sql);
            con_cidade.resultset.first();
            String nome = "Deletar a cidade : "+con_cidade.resultset.getString("nome")+" ?";
            int opcao_escolhida = JOptionPane.showConfirmDialog(null,nome," Exclusão ",JOptionPane.YES_NO_OPTION);
            if (opcao_escolhida == JOptionPane.YES_OPTION){
                sql = "DELETE FROM cidade where codigo = "+tf_codigo.getText();
                int conseguiu_excluir = con_cidade.statement.executeUpdate(sql);
                if(conseguiu_excluir == 1){
                    JOptionPane.showMessageDialog(null,"Exclusão realizada com sucesso.");
                    //Atualiza o ResultSet
                    con_cidade.executasql("Select * from cidade order by "+ordenacao);
                    atualiza_combo_box_cidade();
                    con_cidade.resultset.first();
                    mostra_dados();
                }
            }
            else{
                return;
            }
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro a tentar excluir o registro..."+erro);
        }
    }//GEN-LAST:event_botao_excluirActionPerformed

    private void cb_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_pesquisaActionPerformed
        if(inicia_combox==1){
            try{
                con_cidade.resultset.first();
                    String igual = "n";
                    while(igual.equals("n")){
                        if(con_cidade.resultset.getString("nome").equals(cb_pesquisa.getSelectedItem())){
                            igual = "s";
                        }else{
                            con_cidade.resultset.next();
                        }
                        tf_codigo.setText(con_cidade.resultset.getString("codigo"));
                        mostra_dados();
                    }
                }
           catch(Exception erro){
                JOptionPane.showMessageDialog(null,"Não consegui localizar: "+erro);
           }
        }else{
            inicia_combox =1;
        }
        
    }//GEN-LAST:event_cb_pesquisaActionPerformed

    private void tf_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pesquisaActionPerformed
        try{
        con_cidade.resultset.first();
        String igual = "n";
        int tamanho_pesquisa = tf_pesquisa.getText().length();
        while(igual == "n"){
            String pesquisando = con_cidade.resultset.getString("nome").substring(0,(tamanho_pesquisa));
            if (pesquisando.equals(tf_pesquisa.getText())){
                igual = "s";
            }else{
                con_cidade.resultset.next();
            }
        }
        tf_codigo.setText(con_cidade.resultset.getString("codigo"));
        mostra_dados();
        cb_pesquisa.setSelectedItem(tf_nome.getText());
    } 
        
    catch(Exception erro){
        JOptionPane.showMessageDialog(null,"Não conseguiu localizar via digitação, "+erro);
    }
    }//GEN-LAST:event_tf_pesquisaActionPerformed

    private void rb_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_codigoActionPerformed
        ordem_visualizacao("codigo");
    }//GEN-LAST:event_rb_codigoActionPerformed

    private void rb_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_nomeActionPerformed
        ordem_visualizacao("nome");
    }//GEN-LAST:event_rb_nomeActionPerformed
    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cad_Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cad_Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cad_Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cad_Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cad_Cidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_alterar;
    private javax.swing.JButton botao_anterior;
    private javax.swing.JButton botao_excluir;
    private javax.swing.JButton botao_gravar;
    private javax.swing.JButton botao_novo;
    private javax.swing.JButton botao_primeiro;
    private javax.swing.JButton botao_proximo;
    private javax.swing.JButton botao_ultimo;
    private javax.swing.JComboBox<String> cb_pesquisa;
    private javax.swing.JComboBox<String> cb_uf;
    private javax.swing.ButtonGroup grupo_ordenacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rb_codigo;
    private javax.swing.JRadioButton rb_nome;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_pesquisa;
    // End of variables declaration//GEN-END:variables
    public void mostra_dados(){
        try{
            tf_codigo.setText(con_cidade.resultset.getString("codigo"));
            tf_nome.setText(con_cidade.resultset.getString("nome"));
            cb_uf.setSelectedItem(con_cidade.resultset.getString("uf"));


            }
            catch(SQLException erro){
                if (navega == 1){
                    JOptionPane.showMessageDialog(null, "Você já está no primeio registro.");
                }
                else if (navega == 2){
                    JOptionPane.showMessageDialog(null, "Você já está no útimo registro.");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Dados não localizados"+erro);
                }

                navega = 0;
            }
    }
    public void preencher_jtable(){
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);
        
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.setNumRows(0);
        try{
            while(con_cidade.resultset.next()){
                modelo.addRow(new Object[]{con_cidade.resultset.getString("codigo"),con_cidade.resultset.getString("nome"),con_cidade.resultset.getString("uf")});
                
            }
            con_cidade.resultset.first();
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao lista na tabela: " +erro);
        }
    }
    public void ordem_visualizacao(String ordem){
        ordenacao = ordem;
        con_cidade.executasql("select * from cidade order by "+ordenacao);
        preencher_jtable();
        atualiza_combo_box_cidade();
        try{
            con_cidade.resultset.first();
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro na ordenação dos dados:" + erro);
        }
        mostra_dados();
    }

}
