/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classesDB.DAOPhotoFlow;
import classesDB.DBCliente;
import classesDB.DBStatus_Tarefa;
import classesDB.DBTipo_Contato;
import classesDB.DBTipo_Relacionamento;
import componentes.TextDocument;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author Marlei M.S.B.
 */
public class TelaConfiguracoes extends javax.swing.JInternalFrame {

    private DBCliente cliente; 
    private Connection con; 
    private DAOPhotoFlow daoAtmus; 
    private Mensagem mensagem = new Mensagem();
    /**
     * Creates new form TelaCliente
     */
    public TelaConfiguracoes() {
        initComponents();
    }

    /**
     * Creates new form TelaCliente
     * @param con 
     */
    public TelaConfiguracoes(Connection con) {
        initComponents();
        this.con = con; 
    }    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tipo_contato_jtf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_tipo_contato_jl = new javax.swing.JList<>();
        add_tipo_contato_bt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        excluir_tipo_contato_bt = new javax.swing.JButton();
        mascara_jtf = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        lista_mascara_jl = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tipo_relacionamento_tF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_relacionamentos_jL = new javax.swing.JList<>();
        add_relac_bt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        excluir_tipo_rela_bt = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        status_tarefa_jtf = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista_status_jl = new javax.swing.JList<>();
        add_status_bt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        excluir_status_bt = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Configurações");
        setPreferredSize(new java.awt.Dimension(744, 546));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        tipo_contato_jtf.setDocument(new TextDocument(20));

        jScrollPane1.setViewportView(lista_tipo_contato_jl);

        add_tipo_contato_bt.setText("Add");
        add_tipo_contato_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_tipo_contato_btActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipos de Contato");

        excluir_tipo_contato_bt.setText("Excluir");
        excluir_tipo_contato_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluir_tipo_contato_btActionPerformed(evt);
            }
        });

        mascara_jtf.setDocument(new TextDocument(30));

        jScrollPane4.setViewportView(lista_mascara_jl);

        jLabel4.setText("Máscara");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(excluir_tipo_contato_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_tipo_contato_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tipo_contato_jtf, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane4)
                    .addComponent(mascara_jtf, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipo_contato_jtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_tipo_contato_bt)
                            .addComponent(mascara_jtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(excluir_tipo_contato_bt))))
                .addContainerGap(225, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tipos de Contato", jPanel10);

        tipo_relacionamento_tF.setDocument(new TextDocument(20));

        jScrollPane2.setViewportView(lista_relacionamentos_jL);

        add_relac_bt.setText("Add");
        add_relac_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_relac_btActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipos de Relacionamentos");

        excluir_tipo_rela_bt.setText("Excluir");
        excluir_tipo_rela_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluir_tipo_rela_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(excluir_tipo_rela_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_relac_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(tipo_relacionamento_tF, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(433, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_relacionamento_tF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_relac_bt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluir_tipo_rela_bt))
                .addContainerGap(225, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tipos de Relacionamentos", jPanel11);

        status_tarefa_jtf.setDocument(new TextDocument(20));

        jScrollPane3.setViewportView(lista_status_jl);

        add_status_bt.setText("Add");
        add_status_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_status_btActionPerformed(evt);
            }
        });

        jLabel3.setText("Status da Tarefa");

        excluir_status_bt.setText("Excluir");
        excluir_status_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluir_status_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(excluir_status_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_status_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(status_tarefa_jtf, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(433, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status_tarefa_jtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_status_bt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluir_status_bt))
                .addContainerGap(225, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Status Tarefa", jPanel12);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Geral", jPanel13);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void excluir_tipo_rela_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir_tipo_rela_btActionPerformed
        try {
            if (lista_relacionamentos_jL.getSelectedIndex() > -1) {
                int conf = mensagem.confirmarExclusao();
                if(conf == 0){ //se confirma excluão
                    DBTipo_Relacionamento tipo_rela = new DBTipo_Relacionamento(0, lista_relacionamentos_jL.getSelectedValue().trim());
                    DAOPhotoFlow.deleteTipoRelacionamento(con, tipo_rela);
                    load_lista_relacionamentos_jL();                    
                }                
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaConfiguracoes.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_excluir_tipo_rela_btActionPerformed

    private void excluir_status_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir_status_btActionPerformed

        try {
            if (lista_status_jl.getSelectedIndex() > -1) {
                int conf = mensagem.confirmarExclusao();
                if(conf == 0){ //se confirma excluão
                    DBStatus_Tarefa status_tarefa = new DBStatus_Tarefa(0, lista_status_jl.getSelectedValue().trim());
                    DAOPhotoFlow.deleteStatusTarefa(con, status_tarefa);
                    load_lista_status_jl();                    
                }                
            }

        } catch (SQLException ex) {
            Logger.getLogger(TelaConfiguracoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_excluir_status_btActionPerformed

    private void add_status_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_status_btActionPerformed
       
        if (!status_tarefa_jtf.getText().trim().equals("")){
            DBStatus_Tarefa status_tarefa = new DBStatus_Tarefa(0, status_tarefa_jtf.getText());
            try {
               DAOPhotoFlow.insertStatusTarefa(con, status_tarefa);
                   
               //carrega lista atualizada
               load_lista_status_jl();
               status_tarefa_jtf.setText("");
               
            } catch (SQLException ex) {
                Logger.getLogger(TelaConfiguracoes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            status_tarefa_jtf.requestFocus();
        }   
    }//GEN-LAST:event_add_status_btActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        load_lista_status_jl();
        load_lista_relacionamentos_jL();
        load_lista_contatos_jl();
    }//GEN-LAST:event_formComponentShown

    private void add_relac_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_relac_btActionPerformed
        if (!tipo_relacionamento_tF.getText().trim().equals("")){
            DBTipo_Relacionamento tipo_relac = new DBTipo_Relacionamento(0, tipo_relacionamento_tF.getText());
            try {
               DAOPhotoFlow.insertTipoRelacionamento(con, tipo_relac);
                   
               //carrega lista atualizada
               load_lista_relacionamentos_jL();
               tipo_relacionamento_tF.setText("");
               
            } catch (SQLException ex) {
                Logger.getLogger(TelaConfiguracoes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            tipo_relacionamento_tF.requestFocus();
        }  
    }//GEN-LAST:event_add_relac_btActionPerformed

    private void add_tipo_contato_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_tipo_contato_btActionPerformed
        if ((!tipo_contato_jtf.getText().trim().equals("")) &&  (!mascara_jtf.getText().trim().equals(""))){
            DBTipo_Contato tpContato = new DBTipo_Contato(0, tipo_contato_jtf.getText(), mascara_jtf.getText());
            try {
               DAOPhotoFlow.insertTipoContato(con, tpContato);
                   
               //carrega lista atualizada
               load_lista_contatos_jl();
               tipo_contato_jtf.setText("");
               mascara_jtf.setText("");
               
            } catch (SQLException ex) {
                Logger.getLogger(TelaConfiguracoes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            if(tipo_contato_jtf.getText().trim().equals("")){
                tipo_contato_jtf.requestFocus();
            }else{
                mascara_jtf.requestFocus();
            }
                
        }
    }//GEN-LAST:event_add_tipo_contato_btActionPerformed

    private void excluir_tipo_contato_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir_tipo_contato_btActionPerformed
        try {
            if (lista_tipo_contato_jl.getSelectedIndex() > -1) {
                int conf = mensagem.confirmarExclusao();
                if(conf == 0){ //se confirma excluão
                    DBTipo_Contato tpContato = new DBTipo_Contato(0, lista_tipo_contato_jl.getSelectedValue().trim(), "");
                    DAOPhotoFlow.deleteTipoContato(con, tpContato);
                    load_lista_contatos_jl();
                }                
            }

        } catch (SQLException ex) {
            Logger.getLogger(TelaConfiguracoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_excluir_tipo_contato_btActionPerformed

    /**
     * Carrega lista atualizada de status no componente lista_status_jl
     */
    private void load_lista_status_jl(){
        try {
            List lista_status = DAOPhotoFlow.selectAllStatusTarefa(con);
            
            DefaultListModel listModel = new DefaultListModel();
            for (Object lista_statu : lista_status) {
                DBStatus_Tarefa status  = (DBStatus_Tarefa) lista_statu;
                listModel.addElement(status.getStatus());                           
            }                    
            lista_status_jl.setModel(listModel);
        } catch (SQLException ex) {
            Logger.getLogger(TelaConfiguracoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Carrega lista atualizada de relacionamentos no componente lista_relacionamentos_jL
     */
    private void load_lista_relacionamentos_jL(){
        try{
            List lista_rel = DAOPhotoFlow.selectTipoRelacionamento(con);

            DefaultListModel listModel = new DefaultListModel();
            for (Object lista_rela : lista_rel) {
                DBTipo_Relacionamento relacionamento  = (DBTipo_Relacionamento) lista_rela;
                listModel.addElement(relacionamento.getTipo());                           
            }                    
            lista_relacionamentos_jL.setModel(listModel);            
        } catch (SQLException ex) {
            Logger.getLogger(TelaConfiguracoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Carrega lista atualizada de relacionamentos no componente lista_relacionamentos_jL
     */
    private void load_lista_contatos_jl(){
        try{
            List lista_tpContatos = DAOPhotoFlow.selectTipoContato(con);

            DefaultListModel listModel = new DefaultListModel();
            DefaultListModel listModel2 = new DefaultListModel();
            for (Object lista_contatos : lista_tpContatos) {
                DBTipo_Contato tpContato  = (DBTipo_Contato) lista_contatos ;
                listModel.addElement(tpContato.getTipo());
                listModel2.addElement(tpContato.getMascara());
            }                    
            lista_tipo_contato_jl.setModel(listModel);    
            lista_mascara_jl.setModel(listModel2);
        } catch (SQLException ex) {
            Logger.getLogger(TelaConfiguracoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_relac_bt;
    private javax.swing.JButton add_status_bt;
    private javax.swing.JButton add_tipo_contato_bt;
    private javax.swing.JButton excluir_status_bt;
    private javax.swing.JButton excluir_tipo_contato_bt;
    private javax.swing.JButton excluir_tipo_rela_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> lista_mascara_jl;
    private javax.swing.JList<String> lista_relacionamentos_jL;
    private javax.swing.JList<String> lista_status_jl;
    private javax.swing.JList<String> lista_tipo_contato_jl;
    private javax.swing.JTextField mascara_jtf;
    private javax.swing.JTextField status_tarefa_jtf;
    private javax.swing.JTextField tipo_contato_jtf;
    private javax.swing.JTextField tipo_relacionamento_tF;
    // End of variables declaration//GEN-END:variables
 
       

}


