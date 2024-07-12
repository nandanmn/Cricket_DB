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
public class AddUpdateDeleteStadium extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDeleteStadium
     */
    public AddUpdateDeleteStadium() {
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

        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        stadium_location = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        stadium_name = new javax.swing.JTextField();
        stadium_id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        capacity = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        save = new javax.swing.JButton();
        close = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStadium = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel1.setText("ADD/UPDATE/DELETE STADIUM DETAILS");

        stadium_location.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel13.setText("Capacity Of Stadium");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel14.setText("Stadium Location");

        stadium_name.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        stadium_id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setText("Stadium Name");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel12.setText("Stadium ID");

        capacity.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

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

        delete.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete.png"))); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
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

        reset.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reset.png"))); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        tblStadium.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tblStadium.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "STADIUM ID", "STADIUM NAME", "LOCATION", "CAPACITY"
                }) {
            Class[] types = new Class[] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblStadium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStadiumMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStadium);
        if (tblStadium.getColumnModel().getColumnCount() > 0) {
            tblStadium.getColumnModel().getColumn(1).setMinWidth(150);
            tblStadium.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 123,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(66, 66, 66)
                                                .addComponent(update)
                                                .addGap(54, 54, 54)
                                                .addComponent(delete)
                                                .addGap(57, 57, 57)
                                                .addComponent(reset)
                                                .addGap(60, 60, 60)
                                                .addComponent(close))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 974,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(stadium_id,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 244,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(stadium_name,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 244,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(67, 67, 67)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel13))
                                                .addGap(35, 35, 35)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(stadium_location,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 244,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 974,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(137, 137, 137)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(149, 149, 149)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel12)
                                                        .addGap(29, 29, 29)
                                                        .addComponent(jLabel11))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        layout.createSequentialGroup()
                                                                .addComponent(stadium_id,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(20, 20, 20)
                                                                .addComponent(stadium_name,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(stadium_location,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel14))
                                                .addGap(20, 20, 20)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel13))))
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(save)
                                        .addComponent(close)
                                        .addComponent(delete)
                                        .addComponent(update)
                                        .addComponent(reset))
                                .addGap(34, 34, 34)));

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
            pst = con.prepareStatement("select * from stadium");
            rs = pst.executeQuery();

            ResultSetMetaData rsd = rs.getMetaData();
            count = rsd.getColumnCount();
            d = (DefaultTableModel) tblStadium.getModel();
            d.setRowCount(0);
            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= count; i++) {
                    v2.add(rs.getString("stadium_id"));
                    v2.add(rs.getString("stadium_name"));
                    v2.add(rs.getString("stadium_location"));
                    v2.add(rs.getString("capacity"));
                }
                d.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateDeleteStadium.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_closeActionPerformed
        this.dispose();
    }// GEN-LAST:event_closeActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_resetActionPerformed
        stadium_id.setText("");
        stadium_name.setText("");
        stadium_location.setText("");
        capacity.setText("");
    }// GEN-LAST:event_resetActionPerformed

    private void tblStadiumMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblStadiumMouseClicked
        d = (DefaultTableModel) tblStadium.getModel();
        int selectIndex = tblStadium.getSelectedRow();
        // get the data from table to input fields
        stadium_id.setText(d.getValueAt(selectIndex, 0).toString());
        stadium_name.setText(d.getValueAt(selectIndex, 1).toString());
        stadium_location.setText(d.getValueAt(selectIndex, 2).toString());
        capacity.setText(d.getValueAt(selectIndex, 3).toString());
    }// GEN-LAST:event_tblStadiumMouseClicked

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_saveActionPerformed
        try {
            int stadiumid = Integer.parseInt(stadium_id.getText());
            String stadiumName = stadium_name.getText();
            String stadiumLocation = stadium_location.getText();
            int capacity = Integer.parseInt(this.capacity.getText());

            Connection con = ConnectionProvider.getConnection();
            pst = con.prepareStatement(
                    "insert into stadium (stadium_id, stadium_name, stadium_location, capacity) values(?, ?, ?, ?)");
            pst.setInt(1, stadiumid);
            pst.setString(2, stadiumName);
            pst.setString(3, stadiumLocation);
            pst.setInt(4, capacity);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Successfully Saved");

            this.dispose();
            new AddUpdateDeleteStadium().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateDeleteStadium.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_saveActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateActionPerformed
        try {
            int stadiumid = Integer.parseInt(stadium_id.getText());
            String stadiumName = stadium_name.getText();
            String stadiumLocation = stadium_location.getText();
            int capacity = Integer.parseInt(this.capacity.getText());

            Connection con = ConnectionProvider.getConnection();
            pst = con.prepareStatement(
                    "update stadium set stadium_name = ?, stadium_location = ?, capacity = ? where stadium_id = ?");
            pst.setString(1, stadiumName);
            pst.setString(2, stadiumLocation);
            pst.setInt(3, capacity);
            pst.setInt(4, stadiumid);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Successfully Updated");

            this.dispose();
            new AddUpdateDeleteStadium().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateDeleteStadium.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteActionPerformed
        try {
            int stadiumid = Integer.parseInt(stadium_id.getText());

            Connection con = ConnectionProvider.getConnection();
            pst = con.prepareStatement("delete from stadium where stadium_id = ?");
            pst.setInt(1, stadiumid);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Successfully Deleted");

            this.dispose();
            new AddUpdateDeleteStadium().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AddUpdateDeleteStadium.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(AddUpdateDeleteStadium.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUpdateDeleteStadium.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUpdateDeleteStadium.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUpdateDeleteStadium.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUpdateDeleteStadium().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField capacity;
    private javax.swing.JButton close;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JTextField stadium_id;
    private javax.swing.JTextField stadium_location;
    private javax.swing.JTextField stadium_name;
    private javax.swing.JTable tblStadium;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
