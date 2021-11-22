

package userinterface.RestaurantAdminRole;


import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  srivyshnavi
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
        EcoSystem system;
    UserAccount account;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
      
        //valueLabel.setText();
    }
    
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        
        valueLabel.setText(account.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageRestaurantInfoJButton = new javax.swing.JButton();
        manageMenuJButton = new javax.swing.JButton();
        manageOrdersJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        manageRestaurantInfoJButton.setText("Manage Restaurant Info");
        manageRestaurantInfoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRestaurantInfoJButtonActionPerformed(evt);
            }
        });
        add(manageRestaurantInfoJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 180, -1));

        manageMenuJButton.setText("Manage menu");
        manageMenuJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMenuJButtonActionPerformed(evt);
            }
        });
        add(manageMenuJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 150, -1));

        manageOrdersJButton.setText("Manage Orders");
        manageOrdersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrdersJButtonActionPerformed(evt);
            }
        });
        add(manageOrdersJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Restaurant :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageRestaurantInfoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRestaurantInfoJButtonActionPerformed
        // TODO add your handling code here:
        
        ManageInformation manageInfo=new ManageInformation(userProcessContainer,account,system);
        userProcessContainer.add("Manage Restaurants",manageInfo);
        CardLayout CrdLyt=(CardLayout)userProcessContainer.getLayout();
        CrdLyt.next(userProcessContainer);
        
    }//GEN-LAST:event_manageRestaurantInfoJButtonActionPerformed

    private void manageMenuJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMenuJButtonActionPerformed
        ManageMenu manageMenu=new ManageMenu(userProcessContainer,account,system);
        userProcessContainer.add("Manage Restaurants",manageMenu);
        CardLayout CrdLyt=(CardLayout)userProcessContainer.getLayout();
        CrdLyt.next(userProcessContainer);
    }//GEN-LAST:event_manageMenuJButtonActionPerformed

    private void manageOrdersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrdersJButtonActionPerformed
        ManageOrders manageOrder=new ManageOrders(userProcessContainer,account,system);
        userProcessContainer.add("Manage Restaurants",manageOrder);
        CardLayout CrdLyt=(CardLayout)userProcessContainer.getLayout();
        CrdLyt.next(userProcessContainer);
    }//GEN-LAST:event_manageOrdersJButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageMenuJButton;
    private javax.swing.JButton manageOrdersJButton;
    private javax.swing.JButton manageRestaurantInfoJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
