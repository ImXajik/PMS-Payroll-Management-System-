/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Sean
 */
//Import
import java.io.File;
import javax.swing.JFileChooser;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditEmployee extends javax.swing.JFrame {

    /**
     * Creates new form EditEmployee
     */
    //Database holder
//    private Database database;
//    //Constructor 
//    public EditEmployee(Database database) {
//        this.database = database;
//    }
//    Connection con;
//    PreparedStatement pst;
//    ResultSet rs;
    
    public EditEmployee() {
        initComponents();
//        Connect();
//        Fetch();
    }

//    public void Connect(){
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection(database.getUrl(), DBUser, DBPassword);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(PMS.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(PMS.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    public void Fetch(){
//        int q;
//        try {
//            pst = con.prepareStatement("SELECT * FROM Employee");
//            rs = pst.executeQuery();  
//            ResultSetMetaData rss = rs.getMetaData();
//            q = rss.getColumnCount();
//            
//            DefaultTableModel df = (DefaultTableModel)jTable1.getModel(); 
//            df.setRowCount(0);
//            while(rs.next()){
//                 Vector v2 = new Vector();
//                 for(int i = 1; i <= q; i++){
//                     v2.add(rs.getString("code"));
//                     v2.add(rs.getString("lname"));
//                     v2.add(rs.getString("fname"));
//                     v2.add(rs.getString("position"));
//                     v2.add(rs.getString("department"));
//                     v2.add(rs.getString("type"));
//                 }
//                 df.addRow(v2);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(PMS.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //Callback Previous Frame for Methods
    private PMS mainframe;
    public void mainframe(PMS pms){
        this.mainframe = pms;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lNameField2 = new javax.swing.JTextField();
        DepartmentField2 = new javax.swing.JTextField();
        PositionField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fNameField2 = new javax.swing.JTextField();
        TEmployeeButton2 = new javax.swing.JButton();
        NTEmployeeButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Code = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        payrate2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(320, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(350, 450));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Edit Employee");

        lNameField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lNameField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameField2ActionPerformed(evt);
            }
        });

        DepartmentField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        PositionField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("First Name:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Last Name:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Department:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Position:");

        fNameField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fNameField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameField2ActionPerformed(evt);
            }
        });

        TEmployeeButton2.setText("Add as Teaching Employee");
        TEmployeeButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEmployeeButton2ActionPerformed(evt);
            }
        });

        NTEmployeeButton2.setText("Add as Non-Teaching Employee");
        NTEmployeeButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NTEmployeeButton2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Code:");

        Code.setEditable(false);
        Code.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Pay Rate:");

        payrate2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel10)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fNameField2)
                            .addComponent(Code)
                            .addComponent(lNameField2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(3, 6, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NTEmployeeButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TEmployeeButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(payrate2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PositionField2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DepartmentField2))))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fNameField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lNameField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(DepartmentField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(PositionField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(payrate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TEmployeeButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NTEmployeeButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fNameField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameField2ActionPerformed

    private void TEmployeeButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEmployeeButton2ActionPerformed
        // TODO add your handling code here:
        String code = Code.getText();
        String fname = fNameField2.getText();
        String lname = lNameField2.getText();
        String department = DepartmentField2.getText();
        String position = PositionField2.getText();
        String type = "Teaching Employee";
        String payrate = payrate2.getText();
        //Check if Empty
        if(fname.equals("") || lname.equals("") || department.equals("") || position.equals("") || payrate.equals("")){
            JOptionPane.showMessageDialog(this, "Incomplete Record");
            return;
        }
        //Check if Only Alphabet
        if(fname.matches(".*\\\\d.*") || lname.matches(".*\\d.*") || department.matches(".*\\d.*") || position.matches(".*\\d.*" )){
            JOptionPane.showMessageDialog(this, "Contains Non-Alphabetic Characters");
            return;
        }
        //Check if Only Number
        if(payrate.matches(".*\\d.*|.*\\.\\d.*")){
        }
        else{
            JOptionPane.showMessageDialog(this, "Pay Rate Contains Non-Numeric Characters");
            return;
        }
        if(payrate.contains("-")){
            JOptionPane.showMessageDialog(this, "Input Contains Negative Value");
            return;
        }
        //Return Value
        PMS PMS = new PMS();
        mainframe.fNameField.setText(fname);
        mainframe.lNameField.setText(lname);
        mainframe.DepartmentField.setText(department);
        mainframe.PositionField.setText(position);
        mainframe.teachingtype.setText(type);
        mainframe.codee.setText(code);
        mainframe.payratee.setText(payrate);
        //Update
        mainframe.EditEmployeee();
        mainframe.Fetch();
        dispose();
    }//GEN-LAST:event_TEmployeeButton2ActionPerformed

    private void NTEmployeeButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NTEmployeeButton2ActionPerformed
        // TODO add your handling code here:
        String code = Code.getText();
        String fname = fNameField2.getText();
        String lname = lNameField2.getText();
        String department = DepartmentField2.getText();
        String position = PositionField2.getText();
        String type = "Non-Teaching Employee";
        String payrate = payrate2.getText();
        //Check if Empty
        if(fname.equals("") || lname.equals("") || department.equals("") || position.equals("") || payrate.equals("")){
            JOptionPane.showMessageDialog(this, "Incomplete Record");
            return;
        }
        //Check if Only Alphabet
        if(fname.matches(".*\\\\d.*") || lname.matches(".*\\d.*") || department.matches(".*\\d.*") || position.matches(".*\\d.*" )){
            JOptionPane.showMessageDialog(this, "Contains Non-Alphabetic Characters");
            return;
        }
        //Check if Only Number
        if(payrate.matches(".*\\d.*|.*\\.\\d.*")){
        }
        else{
            JOptionPane.showMessageDialog(this, "Pay Rate Contains Non-Numeric Characters");
            return;
        }
        if(payrate.contains("-")){
            JOptionPane.showMessageDialog(this, "Input Contains Negative Value");
            return;
        }
        //Return Value
        PMS PMS = new PMS();
        mainframe.fNameField.setText(fname);
        mainframe.lNameField.setText(lname);
        mainframe.DepartmentField.setText(department);
        mainframe.PositionField.setText(position);
        mainframe.teachingtype.setText(type);
        mainframe.codee.setText(code);
        mainframe.payratee.setText(payrate);
        //Update
        mainframe.EditEmployeee();
        mainframe.Fetch();
        dispose();
    }//GEN-LAST:event_NTEmployeeButton2ActionPerformed

    private void lNameField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameField2ActionPerformed

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
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Code;
    public javax.swing.JTextField DepartmentField2;
    private javax.swing.JButton NTEmployeeButton2;
    public javax.swing.JTextField PositionField2;
    private javax.swing.JButton TEmployeeButton2;
    public javax.swing.JTextField fNameField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField lNameField2;
    public javax.swing.JTextField payrate2;
    // End of variables declaration//GEN-END:variables
}
