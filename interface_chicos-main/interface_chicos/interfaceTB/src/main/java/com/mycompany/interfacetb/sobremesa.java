/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfacetb;

import javax.swing.JOptionPane;

public class sobremesa extends javax.swing.JFrame {

    /**
     * Creates new form sobremesa
     */
    public sobremesa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cat = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sabor_sobre = new javax.swing.JComboBox<>();
        tipo_sobre = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        congelado = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        frio = new javax.swing.JRadioButton();
        quente = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_sobre = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        salvar_sobremesa = new javax.swing.JButton();
        limpar_sobremesa = new javax.swing.JButton();
        nome_sobre = new javax.swing.JTextField();
        voltar_menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(161, 146, 134));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\ADS\\interface_chicos_burguer\\interface_chicos-main\\img\\IconBurguerPNG_200x200-removebg-preview.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, -1));

        sabor_sobre.setBackground(new java.awt.Color(255, 255, 255));
        sabor_sobre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sabor_sobre.setForeground(new java.awt.Color(0, 0, 0));
        sabor_sobre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Morango", "Limão", "Uva", "Banana", "Laranja", "Maracujá", "Frutas Vermelhas", "Vinho e Abacaxi", "Nata" }));
        sabor_sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabor_sobreActionPerformed(evt);
            }
        });
        jPanel2.add(sabor_sobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 74, 234, 30));

        tipo_sobre.setBackground(new java.awt.Color(255, 255, 255));
        tipo_sobre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tipo_sobre.setForeground(new java.awt.Color(0, 0, 0));
        tipo_sobre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Croissaint", "Bolo", "Sorvete", "Salada de frutas", "Torta" }));
        tipo_sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_sobreActionPerformed(evt);
            }
        });
        jPanel2.add(tipo_sobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 165, 282, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Escolha o sabor!");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, -1, -1));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Escolha o tipo!");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Categoria");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 134, -1, -1));

        cat.add(congelado);
        congelado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        congelado.setForeground(new java.awt.Color(0, 0, 0));
        congelado.setText("Congelado");
        jPanel2.add(congelado, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 174, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nome da Sobremesa!");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        cat.add(frio);
        frio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        frio.setForeground(new java.awt.Color(0, 0, 0));
        frio.setText("Frio");
        jPanel2.add(frio, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 174, -1, -1));

        cat.add(quente);
        quente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        quente.setForeground(new java.awt.Color(0, 0, 0));
        quente.setText("Quente");
        jPanel2.add(quente, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 174, -1, -1));

        area_sobre.setBackground(new java.awt.Color(255, 255, 255));
        area_sobre.setColumns(20);
        area_sobre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        area_sobre.setForeground(new java.awt.Color(0, 0, 0));
        area_sobre.setRows(5);
        jScrollPane1.setViewportView(area_sobre);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 463, 135));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nova Sobremesa!");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, 40));

        salvar_sobremesa.setBackground(new java.awt.Color(154, 88, 51));
        salvar_sobremesa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        salvar_sobremesa.setForeground(new java.awt.Color(0, 0, 0));
        salvar_sobremesa.setText("Salvar");
        salvar_sobremesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_sobremesaActionPerformed(evt);
            }
        });
        jPanel2.add(salvar_sobremesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 185, 43));

        limpar_sobremesa.setBackground(new java.awt.Color(154, 88, 51));
        limpar_sobremesa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        limpar_sobremesa.setForeground(new java.awt.Color(0, 0, 0));
        limpar_sobremesa.setText("Limpar");
        limpar_sobremesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_sobremesaActionPerformed(evt);
            }
        });
        jPanel2.add(limpar_sobremesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 185, 42));

        nome_sobre.setBackground(new java.awt.Color(255, 255, 255));
        nome_sobre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nome_sobre.setForeground(new java.awt.Color(0, 0, 0));
        nome_sobre.setText("Digite o nome da sobremesa");
        nome_sobre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nome_sobreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nome_sobreFocusLost(evt);
            }
        });
        jPanel2.add(nome_sobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 76, 282, -1));

        voltar_menu.setBackground(new java.awt.Color(154, 88, 51));
        voltar_menu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        voltar_menu.setForeground(new java.awt.Color(0, 0, 0));
        voltar_menu.setText("« Voltar Produtos");
        voltar_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_menuActionPerformed(evt);
            }
        });
        jPanel2.add(voltar_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 43));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sabor_sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabor_sobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sabor_sobreActionPerformed

    private void tipo_sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_sobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_sobreActionPerformed

    private void salvar_sobremesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_sobremesaActionPerformed
        // TODO add your handling code here:
        int valor = JOptionPane.showConfirmDialog(null,"Deseja salvar?","Opções", JOptionPane.YES_NO_CANCEL_OPTION);
        
        if(valor==0){
            sobremesaOBJ s = new sobremesaOBJ();
            s.setNome_sobremesa(nome_sobre.getText());
            s.setSabor_sobremesa((String)sabor_sobre.getSelectedItem());
            s.setTipo_sobremesa((String)tipo_sobre.getSelectedItem());
            if(congelado.isSelected()){
                s.setTipo_sobremesa("Congelado");
            }else if(frio.isSelected()){
                s.setTipo_sobremesa("Frio");
            }else{
                s.setTipo_sobremesa("Quente");
            }
        area_sobre.setText(s.status_sobremesa());
        }else if(valor==2){
            System.exit(0);
        }
    }//GEN-LAST:event_salvar_sobremesaActionPerformed

    private void voltar_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_menuActionPerformed
        // TODO add your handling code here:
        dispose();
        new carregamento().setVisible(true);
    }//GEN-LAST:event_voltar_menuActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
        new inicio().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void limpar_sobremesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_sobremesaActionPerformed
        // TODO add your handling code here:
        nome_sobre.setText("");
        sabor_sobre.setSelectedIndex(0);
        tipo_sobre.setSelectedIndex(0);
        quente.setSelected(false);
        frio.setSelected(false);
        congelado.setSelected(false);
        area_sobre.setText("");
    }//GEN-LAST:event_limpar_sobremesaActionPerformed

    private void nome_sobreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nome_sobreFocusGained
        // TODO add your handling code here:
        if(nome_sobre.getText().equals("Digite o nome da sobremesa")){
            nome_sobre.setText("");
        }
        
    }//GEN-LAST:event_nome_sobreFocusGained

    private void nome_sobreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nome_sobreFocusLost
        // TODO add your handling code here:
        if(nome_sobre.getText().equals("")){
            nome_sobre.setText("Digite o nome da sobremesa");
        }
    }//GEN-LAST:event_nome_sobreFocusLost

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
            java.util.logging.Logger.getLogger(sobremesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sobremesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sobremesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sobremesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sobremesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_sobre;
    private javax.swing.ButtonGroup cat;
    private javax.swing.JRadioButton congelado;
    private javax.swing.JRadioButton frio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpar_sobremesa;
    private javax.swing.JTextField nome_sobre;
    private javax.swing.JRadioButton quente;
    private javax.swing.JComboBox<String> sabor_sobre;
    private javax.swing.JButton salvar_sobremesa;
    private javax.swing.JComboBox<String> tipo_sobre;
    private javax.swing.JButton voltar_menu;
    // End of variables declaration//GEN-END:variables
}
