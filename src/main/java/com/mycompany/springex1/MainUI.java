/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.springex1;

import java.util.ArrayList;
import javax.swing.DefaultListModel;



/**
 *
 * @author pekka
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    public MainUI() {
        initComponents();
        panelArray.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        labelResult = new javax.swing.JLabel();
        panelArray = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textFnames = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        listFnames = new javax.swing.JList<>();
        labelSelectedFname = new javax.swing.JLabel();
        btnShowFnames = new javax.swing.JButton();
        btnOpenJFrame = new javax.swing.JButton();
        btnOpenJDialog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Anna etunimesi");

        btnSave.setText("Tallenna");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        panelArray.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textFnames.setColumns(20);
        textFnames.setRows(5);
        jScrollPane1.setViewportView(textFnames);

        listFnames.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listFnames.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                fnameChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listFnames);

        labelSelectedFname.setText("jLabel2");

        javax.swing.GroupLayout panelArrayLayout = new javax.swing.GroupLayout(panelArray);
        panelArray.setLayout(panelArrayLayout);
        panelArrayLayout.setHorizontalGroup(
            panelArrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArrayLayout.createSequentialGroup()
                .addGroup(panelArrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelArrayLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelSelectedFname, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelArrayLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        panelArrayLayout.setVerticalGroup(
            panelArrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArrayLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelArrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(29, 29, 29)
                .addComponent(labelSelectedFname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnShowFnames.setText("N??yt?? etunimet");
        btnShowFnames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowFnamesActionPerformed(evt);
            }
        });

        btnOpenJFrame.setText("Avaa JFrame");
        btnOpenJFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenJFrameActionPerformed(evt);
            }
        });

        btnOpenJDialog.setText("Avaa JDialog");
        btnOpenJDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenJDialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(textFname, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShowFnames, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelArray, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnOpenJFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnOpenJDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFname, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnShowFnames)
                .addGap(44, 44, 44)
                .addComponent(panelArray, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpenJFrame)
                    .addComponent(btnOpenJDialog))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String fn=textFname.getText();
        labelResult.setText("Terve "+fn);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnShowFnamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowFnamesActionPerformed
        // TODO add your handling code here:
        panelArray.setVisible(true);
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Teppo"));
        persons.add(new Person("Liisa"));
        persons.add(new Person("Matti"));
        persons.add(new Person("Aino"));
        //lis??t????n nimet textAreaan
        String names="";
        for(Person p:persons){
            names+=p.getFname()+"\n";
        }
        System.out.println(names);
        textFnames.setText(names);
        
        //lis??t????n nimet jListiin
        DefaultListModel personModel=new DefaultListModel();
        for(Person p:persons){
            personModel.addElement(p.getFname());
        }
        listFnames.setModel(personModel);
    }//GEN-LAST:event_btnShowFnamesActionPerformed

    private void fnameChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_fnameChanged
        // TODO add your handling code here:
        String selectedFname=listFnames.getSelectedValue();
        labelSelectedFname.setText(selectedFname);
    }//GEN-LAST:event_fnameChanged

    private void btnOpenJFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenJFrameActionPerformed
        // TODO add your handling code here:
        MyJFrame objectMyJFrame = new MyJFrame(textFname.getText());
        //objectMyJFrame.setMyframeFname("Teppo");
        objectMyJFrame.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnOpenJFrameActionPerformed

    private void btnOpenJDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenJDialogActionPerformed
        // TODO add your handling code here:
        MyJDialog objectMyJDialog = new MyJDialog(this, rootPaneCheckingEnabled);
        objectMyJDialog.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnOpenJDialogActionPerformed

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpenJDialog;
    private javax.swing.JButton btnOpenJFrame;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnShowFnames;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelResult;
    private javax.swing.JLabel labelSelectedFname;
    private javax.swing.JList<String> listFnames;
    private javax.swing.JPanel panelArray;
    private javax.swing.JTextField textFname;
    private javax.swing.JTextArea textFnames;
    // End of variables declaration//GEN-END:variables
}
