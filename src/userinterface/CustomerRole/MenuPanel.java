/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author srivyshnavi
 */
public class MenuPanel extends javax.swing.JPanel {

    /**
     * Creates new form MenuPanel
     */
    private JPanel userProcessContainer;
    int sum=0;
    private UserAccount userAccount;
    Restaurant rest;
    EcoSystem system;
    ArrayList<Menu> items=new ArrayList<Menu>();
    
    public MenuPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, Restaurant rest) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.rest = rest;
        this.system = system;
        this.userAccount = account;
        populateTable();
        valueLabel.setText(rest.getName());
    }
    public void populateTable(){
            DefaultTableModel model = (DefaultTableModel) menuTable.getModel();
            model.setRowCount(0);
                Object[] row = new Object[3];
                for(Menu dish:rest.getMenu()){
                     row[0] = dish;
                     row[1] = dish.getDescription();
                     row[2] = dish.getPrice();
                     model.addRow(row);
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

        cardBtn = new javax.swing.JButton();
        back = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        orderBtn1 = new javax.swing.JButton();
        RemoveBtn = new javax.swing.JButton();
        addressTxt = new javax.swing.JTextField();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        cardBtn.setText("Add to Cart");
        cardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardBtnActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel.setText("<value>");

        enterpriseLabel.setText("Address:");

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dish Name", "Ingredients", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cartTable);

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dish Name", "Ingredients", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(menuTable);

        orderBtn1.setText("Order");
        orderBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtn1ActionPerformed(evt);
            }
        });

        RemoveBtn.setText("Remove From Cart");
        RemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBtnActionPerformed(evt);
            }
        });

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setText("Order");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cardBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RemoveBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(orderBtn1)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(valueLabel)
                                .addComponent(back)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)))
                .addGap(1, 1, 1)
                .addComponent(cardBtn)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RemoveBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(orderBtn1)
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardBtnActionPerformed

        int selectedRow = menuTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Menu item=(Menu)menuTable.getValueAt(selectedRow, 0);

            populateCart(item);

        }

    }//GEN-LAST:event_cardBtnActionPerformed

    public void populateCart(Menu item){
        DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
        model.setRowCount(0);
        
         items.add(item);
         Object[] row = new Object[3];
                for(Menu dish:items){
                     row[0] = dish;
                     row[1] = dish.getDescription();
                     row[2] = dish.getPrice();
                     sum=sum+Integer.parseInt(dish.getPrice());
                     model.addRow(row);
                }  
     }
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel dwjp = (CustomerAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backActionPerformed

    private void orderBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtn1ActionPerformed
        // TODO add your handling code here:
        String address=addressTxt.getText();

        try {
            if(address==null || address.isEmpty()){
                throw new NullPointerException("Address field is Empty");

            }else if(address.length()<5){
                throw new Exception("Please enter valid address ");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Address is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " Address is invalid");

            return;
        }

        rest.addOrder(rest.getName(), userAccount.getUsername(), null, items, String.valueOf(sum) , address);
        for(Customer cust:system.getCustomerDirectory().getCustList()){
            if(userAccount.getUsername().equals(cust.getUserName())){
                cust.addOrder(rest.getName(), userAccount.getUsername(), null, items, String.valueOf(sum) , address);
            }
        }

        JOptionPane.showMessageDialog(null,"Your Order is placed","Thank You",JOptionPane.WARNING_MESSAGE);
        sum=0;
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel dwjp = (CustomerAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_orderBtn1ActionPerformed

    private void RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = cartTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Menu item=(Menu)cartTable.getValueAt(selectedRow, 0);

            items.remove(item);
            sum=sum-Integer.parseInt(item.getPrice());
            DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
            model.setRowCount(0);
            Object[] row = new Object[3];
            for(Menu dish:items){
                row[0] = dish;
                row[1] = dish.getDescription();
                row[2] = dish.getPrice();

                model.addRow(row);
            }

        }

    }//GEN-LAST:event_RemoveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RemoveBtn;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton back;
    private javax.swing.JButton cardBtn;
    private javax.swing.JTable cartTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable menuTable;
    private javax.swing.JButton orderBtn1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
