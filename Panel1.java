
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Panel1 extends javax.swing.JPanel {

    /**
     * Creates new form Panel1
     */
    public Panel1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TPane = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        addPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        cellfield = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        addressField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        clsButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ALTable = new javax.swing.JTable();
        deleteContact = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        MNTable = new javax.swing.JTable();
        deleteContact1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        OZTable = new javax.swing.JTable();
        deleteContact2 = new javax.swing.JButton();

        TPane.setBackground(new java.awt.Color(204, 255, 255));
        TPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TPaneMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        addPanel.setBackground(new java.awt.Color(204, 255, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Cellphone ");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Address");

        clsButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clsButton.setText("Clear");
        clsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(clsButton))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namefield)
                    .addComponent(cellfield)
                    .addComponent(addressField))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cellfield, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clsButton)
                    .addComponent(jButton2))
                .addGap(43, 43, 43))
        );

        jLabel4.setBackground(new java.awt.Color(102, 153, 255));
        jLabel4.setFont(new java.awt.Font("Sitka Display", 2, 18)); // NOI18N
        jLabel4.setText("                               ADD A NEW CONTACT");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        TPane.addTab("ADD CONTACT", jPanel4);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Display Contacts from A to I");

        ALTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        ALTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ALTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Cellphone", "Address"
            }
        ));
        ALTable.setRowHeight(20);
        ALTable.setRowMargin(3);
        ALTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ALTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ALTable);

        deleteContact.setText("DELETE");
        deleteContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteContactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteContact, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteContact)
                .addGap(22, 22, 22))
        );

        TPane.addTab("A    -     I", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Display Contacts from J to S");

        MNTable.setAutoCreateRowSorter(true);
        MNTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        MNTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MNTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Cellphone", "Address"
            }
        ));
        MNTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MNTable.setRowHeight(20);
        MNTable.setRowMargin(3);
        jScrollPane3.setViewportView(MNTable);

        deleteContact1.setText("DELETE");
        deleteContact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteContact1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteContact1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        TPane.addTab("J    -    S", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Display Contacts from T to Z");

        OZTable.setAutoCreateRowSorter(true);
        OZTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        OZTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        OZTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Cellphone", "Address"
            }
        ));
        OZTable.setRowHeight(20);
        OZTable.setRowMargin(3);
        jScrollPane4.setViewportView(OZTable);

        deleteContact2.setText("DELETE");
        deleteContact2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteContact2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteContact2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteContact2)
                .addContainerGap())
        );

        TPane.addTab("T    -    Z", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TPane, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TPane.getAccessibleContext().setAccessibleName("A to L");
    }// </editor-fold>//GEN-END:initComponents

    private void deleteContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteContactActionPerformed
DefaultTableModel al = (DefaultTableModel) ALTable.getModel();
        int i = ALTable.getSelectedRow();
        if (i >= 0) {
            al.removeRow(i);
        } else {
            JOptionPane.showMessageDialog(ALTable, "Empty");
        }
    }//GEN-LAST:event_deleteContactActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        DefaultTableModel al = (DefaultTableModel) ALTable.getModel();
        DefaultTableModel mn = (DefaultTableModel) MNTable.getModel();
        DefaultTableModel oz = (DefaultTableModel) OZTable.getModel();

//A TO L
        if (namefield.getText().startsWith("A")
                || namefield.getText().startsWith("B")
                || namefield.getText().startsWith("C")
                || namefield.getText().startsWith("D")
                || namefield.getText().startsWith("E")
                || namefield.getText().startsWith("F")
                || namefield.getText().startsWith("G")
                || namefield.getText().startsWith("H")
                || namefield.getText().startsWith("I")) {
            
            al.addRow(new Object[]{namefield.getText(), cellfield.getText(), addressField.getText()});
            JOptionPane.showMessageDialog(addPanel, "Saved");
        }
// M TO 
        if (namefield.getText().startsWith("J")
                || namefield.getText().startsWith("K")
                || namefield.getText().startsWith("L")
                || namefield.getText().startsWith("M")
                || namefield.getText().startsWith("N")
                || namefield.getText().startsWith("O")
                || namefield.getText().startsWith("P")
                || namefield.getText().startsWith("Q")
                || namefield.getText().startsWith("R")
                || namefield.getText().startsWith("S")) {
            mn.addRow(new Object[]{namefield.getText(), cellfield.getText(), addressField.getText()});
            JOptionPane.showMessageDialog(addPanel, "Saved");
        }
        
        if (namefield.getText().startsWith("T")
                || namefield.getText().startsWith("U")
                || namefield.getText().startsWith("V")
                || namefield.getText().startsWith("W")
                || namefield.getText().startsWith("X")
                || namefield.getText().startsWith("Y")
                || namefield.getText().startsWith("Z")) {
            
            oz.addRow(new Object[]{namefield.getText(), cellfield.getText(), addressField.getText()});
            JOptionPane.showMessageDialog(addPanel, "Saved");
            
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void TPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPaneMouseClicked
   
    }//GEN-LAST:event_TPaneMouseClicked
// M
    private void deleteContact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteContact1ActionPerformed
        DefaultTableModel mn = (DefaultTableModel) MNTable.getModel();
        int i = MNTable.getSelectedRow();
        if (i >= 0) {
            mn.removeRow(i);
        } else {
            JOptionPane.showMessageDialog(MNTable, "Empty");
        }
    }//GEN-LAST:event_deleteContact1ActionPerformed

    private void deleteContact2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteContact2ActionPerformed
        DefaultTableModel oz = (DefaultTableModel) OZTable.getModel();
        int i = OZTable.getSelectedRow();
        if (i >= 0) {
            oz.removeRow(i);
        } else {
            JOptionPane.showMessageDialog(OZTable, "Empty");
        }
    }//GEN-LAST:event_deleteContact2ActionPerformed

    private void clsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clsButtonActionPerformed
        cellfield.setText(null);
        namefield.setText(null);
        addressField.setText(null);
    }//GEN-LAST:event_clsButtonActionPerformed

    private void ALTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ALTableMouseClicked
       boolean c = ALTable.isEditing();
       if(c == false){
           JOptionPane.showMessageDialog(this, "NOT EDITABLE");
       }
       
    }//GEN-LAST:event_ALTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable ALTable;
    private javax.swing.JTable MNTable;
    private javax.swing.JTable OZTable;
    private javax.swing.JTabbedPane TPane;
    private javax.swing.JPanel addPanel;
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField cellfield;
    private javax.swing.JButton clsButton;
    private javax.swing.JButton deleteContact;
    private javax.swing.JButton deleteContact1;
    private javax.swing.JButton deleteContact2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField namefield;
    // End of variables declaration//GEN-END:variables
}
