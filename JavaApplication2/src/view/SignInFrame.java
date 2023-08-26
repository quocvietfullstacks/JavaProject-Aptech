/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.UserController;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author nguye
 */
public class SignInFrame extends javax.swing.JFrame {

        private UserController userController = new UserController();
        private User user;
        private String userName;
        private String password;

        /**
         * Creates new form SignInFrame
         */
        public SignInFrame() {
                initComponents();

        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                LoginResultLabel = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                passwordTextField = new javax.swing.JPasswordField();
                titleLabel = new javax.swing.JLabel();
                userNameLabel = new javax.swing.JLabel();
                paswordLabel = new javax.swing.JLabel();
                userNameTextField = new javax.swing.JTextField();
                signinButton = new javax.swing.JButton();
                question = new javax.swing.JLabel();
                gotoSignUpFrame = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 246, 236));

                passwordTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                passwordTextFieldActionPerformed(evt);
                        }
                });

                titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/App-login-manager-icon.png"))); // NOI18N
                titleLabel.setText("Đăng Nhập");
                titleLabel.setMaximumSize(new java.awt.Dimension(60, 20));

                userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                userNameLabel.setText("User Name");

                paswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                paswordLabel.setText("Password");

                userNameTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                userNameTextFieldActionPerformed(evt);
                        }
                });

                signinButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                signinButton.setText("Đăng Nhập");
                signinButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                signinButtonActionPerformed(evt);
                        }
                });

                question.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                question.setText("Bạn chưa có tài khoản?");

                gotoSignUpFrame.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                gotoSignUpFrame.setText("đăng ký");
                gotoSignUpFrame.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                gotoSignUpFrameActionPerformed(evt);
                        }
                });

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/coffees-icon (1).png"))); // NOI18N

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(paswordLabel)
                                                        .addComponent(userNameLabel))
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(signinButton)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(106, 106, 106)
                                                .addComponent(gotoSignUpFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(66, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(question)
                                .addGap(143, 143, 143))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1)))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(userNameLabel)
                                        .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(paswordLabel)
                                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(signinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(question)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gotoSignUpFrame)
                                .addContainerGap(41, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(LoginResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LoginResultLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void userNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_userNameTextFieldActionPerformed

        private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_passwordTextFieldActionPerformed

        private void signinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinButtonActionPerformed
                // TODO add your handling code here:

                userName = userNameTextField.getText().trim();
                password = String.valueOf(passwordTextField.getPassword()).trim();
                if (userName.equals("") || password.equals("")) {
                        JOptionPane.showConfirmDialog(rootPane, "Some Fields Are is Empty", "Error", 1);
                }
                user = userController.getElementByName(userName);
                if (user == null) {
                        LoginResultLabel.setText("Tên người dùng không tồn tại!");
                        JOptionPane.showMessageDialog(this, "Tên người dùng không tồn tại, vui lòng nhập lại!", "Error", JOptionPane.ERROR_MESSAGE);
                        
                }
                if (!user.getPassword().equals(password)) {
                        LoginResultLabel.setText("Mật khẩu đăng nhập không chính xác!");
                        JOptionPane.showMessageDialog(this, "Mật khẩu không đúng, vui lòng nhập lại!", "Error", JOptionPane.ERROR_MESSAGE);
                        
                } else {
                        JOptionPane.showMessageDialog(this, "Đăng nhập thành công", "Successful", JOptionPane.INFORMATION_MESSAGE);
                        int rollNum = user.getRollNum();
                        if (rollNum == 1) {
                                new AdminFrame(user).setVisible(true);
                                this.dispose();
                        } else {
                                new UserFrame(user).setVisible(true);
                                this.dispose();
                        }
                }


        }//GEN-LAST:event_signinButtonActionPerformed
        private void setField() {
                userNameTextField.setText("");
                passwordTextField.setText("");
        }
        private void gotoSignUpFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoSignUpFrameActionPerformed
                // TODO add your handling code here:
                new SignUpFrame().setVisible(true);
                this.dispose();
        }//GEN-LAST:event_gotoSignUpFrameActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel LoginResultLabel;
        private javax.swing.JButton gotoSignUpFrame;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPasswordField passwordTextField;
        private javax.swing.JLabel paswordLabel;
        private javax.swing.JLabel question;
        private javax.swing.JButton signinButton;
        private javax.swing.JLabel titleLabel;
        private javax.swing.JLabel userNameLabel;
        private javax.swing.JTextField userNameTextField;
        // End of variables declaration//GEN-END:variables
}
