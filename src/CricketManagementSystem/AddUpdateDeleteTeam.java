package CricketManagementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rokzz12
 */
public class AddUpdateDeleteTeam extends javax.swing.JFrame {

    /**
     * Creates new form AddUpdateDeleteTeam
     */
    public AddUpdateDeleteTeam() {
        initComponents();
        userLoad();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        team_id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        team_name = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        reset = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTeam = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel1.setText("ADD/UPDATE/DELETE TEAM DETAILS");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel12.setText("Team ID");

        team_id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setText("Team Name");

        team_name.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        save.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/save.png"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        close.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Exit application.png"))); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reset.png"))); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Update details.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete.png"))); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        tblTeam.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tblTeam.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "TEAM ID", "TEAM NAME"
                }) {
            Class[] types = new Class[] {
                    java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblTeam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTeamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTeam);
        if (tblTeam.getColumnModel().getColumnCount() > 0) {
            tblTeam.getColumnModel().getColumn(0).setMinWidth(100);
            tblTeam.getColumnModel().getColumn(0).setPreferredWidth(150);
            tblTeam.getColumnModel().getColumn(0).setMaxWidth(200);
            tblTeam.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 123,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(update)
                                .addGap(58, 58, 58)
                                .addComponent(delete)
                                .addGap(54, 54, 54)
                                .addComponent(reset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(close)
                                .addGap(58, 58, 58))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 974,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(152, 152, 152))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 974,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 974,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(181, 181, 181)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(110, 110, 110)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(team_id, javax.swing.GroupLayout.PREFERRED_SIZE, 211,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 131,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(team_name, javax.swing.GroupLayout.PREFERRED_SIZE, 274,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel12)
                                                .addComponent(team_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel11)
                                                .addComponent(team_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(22, 22, 22)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27,
                                        Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(save)
                                        .addComponent(close)
                                        .addComponent(reset)
                                        .addComponent(update)
                                        .addComponent(delete))
                                .addGap(21, 21, 21)));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel d;

    public void userLoad() {
        int count;
        try {
            Connection con = ConnectionProvider.getConnection();
            pst = con.prepareStatement("select * from team");
            rs = pst.executeQuery();

            ResultSetMetaData rsd = rs.getMetaData();
            count = rsd.getColumnCount();
            d = (DefaultTableModel) tblTeam.getModel();
            d.setRowCount(0);
            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= count; i++) {
                    v2.add(rs.getString("team_id"));
                    v2.add(rs.getString("team_name"));
                }
                d.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateDeleteTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_closeActionPerformed
        this.dispose();
    }// GEN-LAST:event_closeActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_resetActionPerformed
        team_id.setText("");
        team_name.setText("");
    }// GEN-LAST:event_resetActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_saveActionPerformed
        try {
            int teamid = Integer.parseInt(team_id.getText());
            String teamName = team_name.getText();

            Connection con = ConnectionProvider.getConnection();
            pst = con.prepareStatement("insert into team (team_id, team_name) values(?, ?)");
            pst.setInt(1, teamid);
            pst.setString(2, teamName);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Successfully Saved");

            this.dispose();
            new AddUpdateDeleteTeam().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateDeleteTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_saveActionPerformed

    private void tblTeamMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblTeamMouseClicked
        d = (DefaultTableModel) tblTeam.getModel();
        int selectIndex = tblTeam.getSelectedRow();
        // get the data from table to input fields
        team_id.setText(d.getValueAt(selectIndex, 0).toString());
        team_name.setText(d.getValueAt(selectIndex, 1).toString());
    }// GEN-LAST:event_tblTeamMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateActionPerformed
        try {
            // get the data from input field to variables
            int teamid = Integer.parseInt(team_id.getText());
            String teamName = team_name.getText();

            // Query to update the database table team
            Connection con = ConnectionProvider.getConnection();
            pst = con.prepareStatement("update team set team_name = ? where team_id = ?");
            pst.setString(1, teamName);
            pst.setInt(2, teamid);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Successfully Updated");

            this.dispose();
            new AddUpdateDeleteTeam().setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateDeleteTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteActionPerformed
        try {
            int teamid = Integer.parseInt(team_id.getText());
            Connection con = ConnectionProvider.getConnection();
            PreparedStatement pst = con.prepareStatement("delete from team where team_id = ?");
            pst.setInt(1, teamid);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Succesfully Deleted");

            this.dispose();
            new AddUpdateDeleteTeam().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateDeleteTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddUpdateDeleteTeam.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUpdateDeleteTeam.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUpdateDeleteTeam.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUpdateDeleteTeam.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUpdateDeleteTeam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JTable tblTeam;
    private javax.swing.JTextField team_id;
    private javax.swing.JTextField team_name;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
