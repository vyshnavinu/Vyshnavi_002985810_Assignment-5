/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import static java.time.Clock.system;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author srivyshnavi
 */
public class ManageCustomers extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomers
     */
     private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount user;
 
    
    public ManageCustomers(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
         populateNetworkTable();
         btnConfirmUpdate.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkJTable = new javax.swing.JTable();
        btnConfirmUpdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setText("Password");

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "User Name", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkJTable);

        btnConfirmUpdate.setText("Confirm Update");
        btnConfirmUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmUpdateActionPerformed(evt);
            }
        });

        jLabel5.setText("Username");

        jLabel3.setText("Name");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Customer Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(118, 118, 118)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(uNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 469, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(btnSubmit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConfirmUpdate)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(btnSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnConfirmUpdate)
                    .addComponent(btnUpdate))
                .addGap(27, 27, 27)
                .addComponent(backJButton)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();
        
        model.setRowCount(0);
        
       // for()
        for (UserAccount uuserr : system.getUserAccountDirectory().getUserAccountList()) {
           
            if ("Business.Role.CustomerRole".equals(uuserr.getRole().getClass().getName())) {
                Object[] row = new Object[5];
               
                row[0] = uuserr.getName();
                row[1] = uuserr.getUsername();
                row[2] = uuserr.getPassword();
                row[3] = uuserr.getContact();
                row[4] = uuserr.getAddress();
                
                model.addRow(row);
            }
            
        }
    }
    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = networkJTable.getSelectedRow();

        if(selectRow>=0){
            String username= (String) networkJTable.getValueAt(selectRow, 1);
            String pwd= (String) networkJTable.getValueAt(selectRow, 2);
            user=system.getUserAccountDirectory().authenticateUser(username, pwd);

            nameJTextField.setText(user.getName()+"");
            uNameTextField.setText(user.getUsername()+"");
            PasswordField.setText(user.getPassword()+"");
//            ContactField.setText(user.getContact()+ "");
//            AddressFiels.setText(user.getAddress()+ "");
            // system.getUserAccountDirectory().deleteUserAccount(user);

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row");
        }

        btnSubmit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnConfirmUpdate.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = networkJTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username= (String) networkJTable.getValueAt(selectedRow, 1);
                String pwd= (String) networkJTable.getValueAt(selectedRow, 2);
                UserAccount user=system.getUserAccountDirectory().authenticateUser(username, pwd);

                //UserAccount user = (UserAccount) networkJTable.getValueAt(selectedRow, 0);
                system.getUserAccountDirectory().deleteUserAccount(user);
                system.getCustomerDirectory().deleteCustomer(user.getUsername());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        populateNetworkTable();
    }//GEN-LAST:event_btnDeleteActionPerformed
     
    
    private void btnConfirmUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmUpdateActionPerformed
        // TODO add your handling code here:

        String name = nameJTextField.getText();
        String uname=uNameTextField.getText();
        String password=PasswordField.getText();
//        String contact = ContactField.getText();
//        String address= AddressFiels.getText();

        try {
            if(name==null || name.isEmpty()){
                throw new NullPointerException(" Name field is Empty");

            }else if(name.length()<5 || Pattern.matches("^[A-Za-z]+$", name)==false){
                throw new Exception("Please enter valid  Name");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Name is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "  Name is invalid");

            return;
        }

        try {
            if(uname==null || uname.isEmpty()){
                throw new NullPointerException("User Name field is Empty");

            }else if(uname.length()<5){
                throw new Exception("Please enter valid User Name");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "User Name is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " User Name is invalid");

            return;
        }

        try {

            if(password==null || password.isEmpty()){
                throw new NullPointerException("Pwd field is Empty");
            }else if(Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password)==false){
                throw new Exception("Invalid Password");
            }

        }  catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Password is Empty");

            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is of invalid pattern");

            return;
        }
        
        

        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(uname)==false) {
            JOptionPane.showMessageDialog(null,"  User Name already exists ");
        }else{

            system.getUserAccountDirectory().updateUserAccount(user,name,uname,password);
            populateNetworkTable();
            btnSubmit.setEnabled(true);
            btnDelete.setEnabled(true);
            btnUpdate.setEnabled(true);
            btnConfirmUpdate.setEnabled(false);

            nameJTextField.setText("");
            uNameTextField.setText("");
            PasswordField.setText("");
//            ContactField.setText("");
//            AddressFiels.setText("");
        }
    }//GEN-LAST:event_btnConfirmUpdateActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        String name = nameJTextField.getText();
        String uname=uNameTextField.getText();
        String password=PasswordField.getText();
//        String contact = ContactField.getText();
//        String address= AddressFiels.getText();


        try {
            if(name==null || name.isEmpty()){
                throw new NullPointerException(" Name field is Empty");

            }else if(name.length()<5 || Pattern.matches("^[A-Za-z]+$", name)==false){
                throw new Exception("Please enter valid  Name");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Name is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "  Name is invalid");

            return;
        }

        try {
            if(uname==null || uname.isEmpty()){
                throw new NullPointerException("User Name field is Empty");

            }else if(uname.length()<5){
                throw new Exception("Please enter valid User Name");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "User Name is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " User Name is invalid");

            return;
        }

        try {

            if(password==null || password.isEmpty()){
                throw new NullPointerException("Pwd field is Empty");
            }else if(Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password)==false){
                throw new Exception("Invalid Password");
            }

        }  catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Password is Empty");

            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is of invalid pattern");

            return;
        }
        
        


        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(uname)==false) {
            JOptionPane.showMessageDialog(null,"  User Name already exists ");
        }else{

            UserAccount ua1 =system.getUserAccountDirectory().createUserAccount(name,uname,password, null, new CustomerRole());
            Customer cust= system.getCustomerDirectory().createCustomer(uname);
            populateNetworkTable();
            nameJTextField.setText("");
            uNameTextField.setText("");
            PasswordField.setText("");
//            ContactField.setText("");
//            AddressFiels.setText("");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
//        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
//        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnConfirmUpdate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable networkJTable;
    private javax.swing.JTextField uNameTextField;
    // End of variables declaration//GEN-END:variables

}
