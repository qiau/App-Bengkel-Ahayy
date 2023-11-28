package views;

public class RegisterView extends MainView {
    
    public RegisterView(MainFrame mainFrame) {
        super(mainFrame);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsername = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        lblAsk = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnShowPw = new javax.swing.JCheckBox();
        lblBackground = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(750, 500));
        setMinimumSize(new java.awt.Dimension(750, 500));
        setPreferredSize(new java.awt.Dimension(750, 500));
        setLayout(null);

        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUsername.setText("  Username");
        txtUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 69, 0), 2, true));
        txtUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsernameMouseClicked(evt);
            }
        });
        add(txtUsername);
        txtUsername.setBounds(530, 260, 200, 30);

        txtFullName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFullName.setText("  Full Name");
        txtFullName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 69, 0), 2, true));
        txtFullName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFullNameMouseClicked(evt);
            }
        });
        add(txtFullName);
        txtFullName.setBounds(530, 140, 200, 30);

        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAddress.setText("  Address");
        txtAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 69, 0), 2, true));
        txtAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddressMouseClicked(evt);
            }
        });
        add(txtAddress);
        txtAddress.setBounds(530, 180, 200, 30);

        txtPhone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPhone.setText("  Phone Number");
        txtPhone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 69, 0), 2, true));
        txtPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPhoneMouseClicked(evt);
            }
        });
        add(txtPhone);
        txtPhone.setBounds(530, 220, 200, 30);

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPassword.setText("  Password");
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 69, 0), 2, true));
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        add(txtPassword);
        txtPassword.setBounds(530, 300, 200, 30);

        btnRegister.setBackground(new java.awt.Color(255, 69, 0));
        btnRegister.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Sign Up");
        btnRegister.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 69, 0), 4, true));
        add(btnRegister);
        btnRegister.setBounds(480, 370, 250, 26);

        lblAsk.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblAsk.setForeground(new java.awt.Color(255, 69, 0));
        lblAsk.setText("Sudah punya akun?");
        add(lblAsk);
        lblAsk.setBounds(480, 400, 180, 40);

        btnLogin.setBackground(new java.awt.Color(255, 69, 0));
        btnLogin.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Sign In");
        btnLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 69, 0), 4, true));
        add(btnLogin);
        btnLogin.setBounds(660, 410, 70, 24);

        btnShowPw.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnShowPw.setText("Show Password");
        btnShowPw.setBorder(null);
        btnShowPw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPwActionPerformed(evt);
            }
        });
        add(btnShowPw);
        btnShowPw.setBounds(530, 330, 140, 30);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bgRegister.png"))); // NOI18N
        add(lblBackground);
        lblBackground.setBounds(0, 0, 750, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsernameMouseClicked
        txtUsername.setText("");
    }//GEN-LAST:event_txtUsernameMouseClicked

    private void txtFullNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFullNameMouseClicked
        txtFullName.setText("");
    }//GEN-LAST:event_txtFullNameMouseClicked

    private void txtAddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddressMouseClicked
        txtAddress.setText("");
    }//GEN-LAST:event_txtAddressMouseClicked

    private void txtPhoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPhoneMouseClicked
        txtPhone.setText("");
    }//GEN-LAST:event_txtPhoneMouseClicked

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        txtPassword.setText("");
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void btnShowPwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPwActionPerformed
        
        if(btnShowPw.isSelected())
            txtPassword.setEchoChar((char)0);
        else
            txtPassword.setEchoChar('*');
    }//GEN-LAST:event_btnShowPwActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JCheckBox btnShowPw;
    private javax.swing.JLabel lblAsk;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
