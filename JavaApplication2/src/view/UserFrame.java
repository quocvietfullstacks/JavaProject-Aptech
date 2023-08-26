/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.OrderController;
import controller.ProductController;
import controller.UserController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Order;
import model.Product;
import model.User;

/**
 *
 * @author nguye
 */
public class UserFrame extends javax.swing.JFrame {

        UserController userController;
        ProductController productController;
        OrderController orderController;
        DefaultTableModel defaultUserTableModel;
        DefaultTableModel defaultProductTableModel;
        DefaultTableModel defaultOrderTableModel;
        User userNew = new User();
        User userById, thisUser, user;
        Product productById;

        /**
         * Creates new form AdminFrame
         */
        public UserFrame(User user) {
                this.user = user;
                userController = new UserController();
                productController = new ProductController();
                orderController = new OrderController();
                // tạm thời chình sửa để hợp lý với việc kiểm tra các ví dụ. 
                initComponents();
                
                totalOfAllOrder.setText(String.valueOf(setTotalOrder(orderController.getAllElement())));
        }

        public double setTotalOrder(List<Order> allOrder) {
                double total = 0;
                for (Order o : allOrder) {
                        total += o.getTotal();
                }
                return total;
        }

        private void setProductTable() {
                defaultProductTableModel = new DefaultTableModel() {
                        @Override
                        public boolean isCellEditable(int row, int column) {
                                return false;
                        }
                };
                productTable.setModel(defaultProductTableModel);
                defaultProductTableModel.addColumn("_id");
                defaultProductTableModel.addColumn("Tên sản phẩm");
                defaultProductTableModel.addColumn("Giá bán");
                defaultProductTableModel.addColumn("Số lượng");
                setProductTableData(productController.getAllElement());

                productTable.setComponentPopupMenu(productPopupMenu);
        }

        private void setProductTableData(List<Product> productList) {
                for (Product p : productList) {
                        defaultProductTableModel.addRow(new Object[]{
                                p.getProductCode(),
                                p.getProductName(),
                                p.getPriceRetail(),
                                p.getQuantityInStock()
                        });
                }
        }

        private void setOrderTable() {
                defaultOrderTableModel = new DefaultTableModel() {
                        @Override
                        public boolean isCellEditable(int row, int column) {
                                return false;
                        }
                };
                orderTable.setModel(defaultOrderTableModel);
                defaultOrderTableModel.addColumn("_id");
                defaultOrderTableModel.addColumn("Id sản phẩm");
                defaultOrderTableModel.addColumn("Tên sản phẩm");
                defaultOrderTableModel.addColumn("Tên tài khoản");
                defaultOrderTableModel.addColumn("Số điện thoại");
                defaultOrderTableModel.addColumn("Địa chỉ");
                defaultOrderTableModel.addColumn("Giá bán");
                defaultOrderTableModel.addColumn("Số lượng");
                defaultOrderTableModel.addColumn("Thành tiền");
                setOrderTableData(orderController.getAllElement());

                orderTable.setComponentPopupMenu(orderPopupMenu);
        }

        private void setOrderTableData(List<Order> orderList) {
                List<Order> userOrders = orderList.stream().filter(it -> it.getUserName().trim().equals(user.getUserName().trim())).toList();
                for (Order order : userOrders) {
                        defaultOrderTableModel.addRow(new Object[]{
                                order.getOrderID(),
                                order.getProductID(),
                                order.getProductName(),
                                order.getUserName(),
                                order.getUserPhoneNumber(),
                                order.getUserAddress(),
                                order.getSalePrice(),
                                order.getQuantity(),
                                order.getTotal()
                        });
                }
        }

        private void setAccountPanel(User user) {

                nameTextField1.setText(user.getName());
                ageTextField1.setText(user.getAge());
                String gender = user.getGender();
                if (gender != null) {
                        if (gender.equals("male")) {
                                maleGender1.setSelected(true);
                        } else {
                                femaleGender1.setSelected(true);
                        }
                }

                phoneTextField1.setText(user.getPhone());
                addressTextField1.setText(user.getAddress());
                userNameTextField1.setText(user.getUserName());
                passwordTextField1.setText(user.getPassword());
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                productPopupMenu = new javax.swing.JPopupMenu();
                createNewOrderMenuItem = new javax.swing.JMenuItem();
                orderPopupMenu = new javax.swing.JPopupMenu();
                orderUpdateQuantityMenuItem = new javax.swing.JMenuItem();
                orderDeleteOrderMenuItem = new javax.swing.JMenuItem();
                jPanel4 = new javax.swing.JPanel();
                jPanel7 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jPanel8 = new javax.swing.JPanel();
                accountAdminTabbedPane = new javax.swing.JTabbedPane();
                jPanel3 = new javax.swing.JPanel();
                jScrollPane3 = new javax.swing.JScrollPane();
                productTable = new javax.swing.JTable();
                jPanel5 = new javax.swing.JPanel();
                productSearchTextField = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                productSearchButton = new javax.swing.JButton();
                jPanel1 = new javax.swing.JPanel();
                jScrollPane4 = new javax.swing.JScrollPane();
                orderTable = new javax.swing.JTable();
                jPanel2 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                totalOfAllOrder = new javax.swing.JLabel();
                jPanel6 = new javax.swing.JPanel();
                jPanel10 = new javax.swing.JPanel();
                jLabel28 = new javax.swing.JLabel();
                jButton5 = new javax.swing.JButton();
                jPanel11 = new javax.swing.JPanel();
                jLabel29 = new javax.swing.JLabel();
                saveUserInforButton = new javax.swing.JButton();
                jLabel30 = new javax.swing.JLabel();
                maleGender1 = new javax.swing.JRadioButton();
                jLabel31 = new javax.swing.JLabel();
                femaleGender1 = new javax.swing.JRadioButton();
                nameTextField1 = new javax.swing.JTextField();
                ageTextField1 = new javax.swing.JTextField();
                reEnterPasswordField1 = new javax.swing.JPasswordField();
                phoneTextField1 = new javax.swing.JTextField();
                jLabel32 = new javax.swing.JLabel();
                userNameTextField1 = new javax.swing.JTextField();
                jLabel34 = new javax.swing.JLabel();
                jLabel35 = new javax.swing.JLabel();
                passwordTextField1 = new javax.swing.JPasswordField();
                jLabel36 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                addressTextField1 = new javax.swing.JTextArea();
                jLabel37 = new javax.swing.JLabel();
                confirmPasswordLabel = new javax.swing.JLabel();

                createNewOrderMenuItem.setText("Create new Order");
                createNewOrderMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                createNewOrderMenuItemActionPerformed(evt);
                        }
                });
                productPopupMenu.add(createNewOrderMenuItem);

                orderUpdateQuantityMenuItem.setText("Update Quantity");
                orderUpdateQuantityMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                orderUpdateQuantityMenuItemActionPerformed(evt);
                        }
                });
                orderPopupMenu.add(orderUpdateQuantityMenuItem);

                orderDeleteOrderMenuItem.setText("Delete");
                orderDeleteOrderMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                orderDeleteOrderMenuItemActionPerformed(evt);
                        }
                });
                orderPopupMenu.add(orderDeleteOrderMenuItem);

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel4.setBackground(new java.awt.Color(225, 111, 27));

                jPanel7.setBackground(new java.awt.Color(221, 153, 138));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/Java-icon.png"))); // NOI18N
                jLabel1.setText("ADAM Store");

                jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/coffee-icon.png"))); // NOI18N

                javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addGap(154, 154, 154)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel7Layout.setVerticalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                );

                jPanel8.setBackground(new java.awt.Color(162, 104, 92));

                accountAdminTabbedPane.setBackground(new java.awt.Color(162, 104, 92));
                accountAdminTabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                accountAdminTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                accountAdminTabbedPaneStateChanged(evt);
                        }
                });

                jPanel3.setBackground(new java.awt.Color(221, 153, 138));

                productTable.setBackground(new java.awt.Color(245, 219, 213));
                productTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "Title 1", "Title 2", "Title 3", "Title 4"
                        }
                ));
                jScrollPane3.setViewportView(productTable);

                jPanel5.setBackground(new java.awt.Color(221, 153, 138));

                productSearchTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                productSearchTextFieldActionPerformed(evt);
                        }
                });
                productSearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                productSearchTextFieldKeyReleased(evt);
                        }
                });

                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/ModernXP-20-Seach-icon.png"))); // NOI18N

                productSearchButton.setBackground(new java.awt.Color(255, 204, 204));
                productSearchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                productSearchButton.setText("Search");
                productSearchButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                productSearchButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap(41, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(productSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(productSearchButton)
                                .addGap(16, 16, 16))
                );
                jPanel5Layout.setVerticalGroup(
                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(1, 1, 1))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(productSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(productSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                                .addContainerGap())
                );

                accountAdminTabbedPane.addTab("Danh sách sản phẩm", jPanel3);

                jPanel1.setBackground(new java.awt.Color(162, 104, 92));

                orderTable.setBackground(new java.awt.Color(245, 219, 213));
                orderTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "Title 1", "Title 2", "Title 3", "Title 4"
                        }
                ));
                jScrollPane4.setViewportView(orderTable);

                jPanel2.setBackground(new java.awt.Color(255, 246, 236));

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel3.setText("tổng số tiền: ");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalOfAllOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(200, Short.MAX_VALUE))
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(totalOfAllOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9))
                );

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(17, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(94, Short.MAX_VALUE))
                );

                accountAdminTabbedPane.addTab("Danh sách đơn hàng", jPanel1);

                jPanel6.setBackground(new java.awt.Color(245, 219, 213));

                jPanel10.setBackground(new java.awt.Color(255, 246, 236));

                jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/personal-information-icon.png"))); // NOI18N
                jLabel28.setText("Thông tin cá nhân");

                jButton5.setBackground(new java.awt.Color(102, 153, 255));
                jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/system-log-out-icon.png"))); // NOI18N
                jButton5.setText("Log out");
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton5ActionPerformed(evt);
                        }
                });

                jPanel11.setBackground(new java.awt.Color(255, 246, 236));

                jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel29.setText("Số điển thoại ");

                saveUserInforButton.setBackground(new java.awt.Color(255, 204, 204));
                saveUserInforButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                saveUserInforButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/accept-icon.png"))); // NOI18N
                saveUserInforButton.setText("Save");
                saveUserInforButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                saveUserInforButtonActionPerformed(evt);
                        }
                });

                jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel30.setText("Địa chỉ ");

                maleGender1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                maleGender1.setText("male");
                maleGender1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                maleGender1ActionPerformed(evt);
                        }
                });

                jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel31.setText("Acount Name");

                femaleGender1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                femaleGender1.setText("female");
                femaleGender1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                femaleGender1ActionPerformed(evt);
                        }
                });

                nameTextField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                nameTextField1ActionPerformed(evt);
                        }
                });

                ageTextField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ageTextField1ActionPerformed(evt);
                        }
                });

                reEnterPasswordField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                reEnterPasswordField1ActionPerformed(evt);
                        }
                });
                reEnterPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                reEnterPasswordField1KeyPressed(evt);
                        }
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                reEnterPasswordField1KeyReleased(evt);
                        }
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                reEnterPasswordField1KeyTyped(evt);
                        }
                });

                phoneTextField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                phoneTextField1ActionPerformed(evt);
                        }
                });

                jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel32.setText("Re-enter Password");

                jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel34.setText("Password");

                jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel35.setText("Tên ");

                passwordTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                passwordTextField1FocusLost(evt);
                        }
                });

                jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel36.setText("Tuổi ");

                addressTextField1.setColumns(20);
                addressTextField1.setRows(5);
                jScrollPane1.setViewportView(addressTextField1);

                jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel37.setText("Giới tính ");

                javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
                jPanel11.setLayout(jPanel11Layout);
                jPanel11Layout.setHorizontalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(saveUserInforButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confirmPasswordLabel)
                                .addContainerGap(149, Short.MAX_VALUE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                        .addGap(35, 35, 35)
                                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                                                        .addComponent(userNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel32))
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(reEnterPasswordField1)
                                                                                .addComponent(passwordTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)))))
                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                                        .addGap(35, 35, 35)
                                                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                                                                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(ageTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(nameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(phoneTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                                        .addComponent(maleGender1)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(femaleGender1)))))
                                        .addContainerGap(19, Short.MAX_VALUE)))
                );
                jPanel11Layout.setVerticalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addContainerGap(392, Short.MAX_VALUE)
                                .addComponent(confirmPasswordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveUserInforButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(nameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ageTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(phoneTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(7, 7, 7)
                                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(maleGender1)
                                                                .addComponent(femaleGender1)))
                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(userNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(passwordTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(reEnterPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel32))
                                        .addContainerGap(84, Short.MAX_VALUE)))
                );

                javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
                jPanel10.setLayout(jPanel10Layout);
                jPanel10Layout.setHorizontalGroup(
                        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap(95, Short.MAX_VALUE)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addGap(27, 27, 27))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel10Layout.setVerticalGroup(
                        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addContainerGap(12, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton5)
                                        .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24))
                );

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(83, Short.MAX_VALUE))
                );
                jPanel6Layout.setVerticalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(64, Short.MAX_VALUE))
                );

                accountAdminTabbedPane.addTab("Account", jPanel6);

                javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
                jPanel8.setLayout(jPanel8Layout);
                jPanel8Layout.setHorizontalGroup(
                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(accountAdminTabbedPane)
                );
                jPanel8Layout.setVerticalGroup(
                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(accountAdminTabbedPane)
                                .addContainerGap())
                );

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel4Layout.setVerticalGroup(
                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents
        private void refreshProductTable() {
                defaultProductTableModel.setRowCount(0);
                setProductTableData(productController.getAllElement());
        }
        private void createNewOrderMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewOrderMenuItemActionPerformed
                // TODO add your handling code here:
                int row = productTable.getSelectedRow();
                Product thisProduct = new Product();
                if (row == -1) {
                        JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng trước khi cập nhật! ", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                        //get id
                        String productCode = String.valueOf(productTable.getValueAt(row, 0));
                        // get Product is selected
                        thisProduct = productController.getElementById(productCode);
                        String input = JOptionPane.showInputDialog(this, "Số lượng", "Số lượng hàng bạn muốn mua?", JOptionPane.DEFAULT_OPTION);
                        int quantity = Integer.parseInt(input);
                        // create new Order + insert+ update
                        Order newOrder = new Order(user, thisProduct, quantity);
                        orderController.insert(newOrder);
                        refreshOrderTable();
                        refreshProductTable();
                        // set total Price. 
                        totalOfAllOrder.setText(String.valueOf(setTotalOrder(orderController.getAllElement())));
                }


        }//GEN-LAST:event_createNewOrderMenuItemActionPerformed
        private void refreshOrderTable() {
                defaultOrderTableModel.setRowCount(0);
                setOrderTableData(orderController.getAllElement());
        }
        private void orderDeleteOrderMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDeleteOrderMenuItemActionPerformed
                // TODO add your handling code here:
                int row = orderTable.getSelectedRow();
                if (row == -1) {
                        JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng trước khi xóa! ", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                        int confirm = JOptionPane.showConfirmDialog(this, "bạn có chắc chắn muốn xóa không?");
                        if (confirm == JOptionPane.YES_OPTION) {
                                String orderID = String.valueOf(orderTable.getValueAt(row, 0));
                                //delete
                                deleteOrder(orderID);
                        }
                }
        }//GEN-LAST:event_orderDeleteOrderMenuItemActionPerformed
        private void deleteOrder(String orderID) { // để vừa xóa vừa cập nhật số lượng 
                // get this order
                Order thisOrder = orderController.getElementById(orderID);
                // get thisProduct
                Product thisProduct = productController.getElementById(thisOrder.getProductID());
                //set quatity in stock + update
                thisProduct.setQuantityInStock(thisProduct.getQuantityInStock() + thisOrder.getQuantity());
                productController.update(thisProduct);
                //delete
                orderController.delete(orderID);
                // refresh table
                refreshProductTable();
                refreshOrderTable();
                //set total
                totalOfAllOrder.setText(String.valueOf(setTotalOrder(orderController.getAllElement())));
        }
        private void orderUpdateQuantityMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderUpdateQuantityMenuItemActionPerformed
                // TODO add your handling code here:
                int row = orderTable.getSelectedRow();
                if (row == -1) {
                        JOptionPane.showMessageDialog(this, "Vui long chon row truoc! ", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                        //get ID String. 
                        String orderID = String.valueOf(orderTable.getValueAt(row, 0));
                        //to Update frame

                        // get Product is selected
                        Order thisOrder = orderController.getElementById(orderID);
                        Product thisProduct = productController.getElementById(thisOrder.getProductID());

                        String input = JOptionPane.showInputDialog(this, "Số lượng", "Số lượng hàng bạn muốn mua?", JOptionPane.DEFAULT_OPTION);
                        int quantity = Integer.parseInt(input);
                        if (quantity <= 0) {
                                // delete and update quantity instock
                                deleteOrder(orderID);
                        } else {
                                // update Order -> update Quatity in stock
                                thisProduct.setQuantityInStock(thisProduct.getQuantityInStock() + (thisOrder.getQuantity() - quantity));
                                productController.update(thisProduct);
                                // set and update Order
                                thisOrder.setQuantity(quantity);
                                thisOrder.setTotal(thisProduct.getPriceRetail() * quantity);
                                orderController.update(thisOrder);
                                // refresh table
                                refreshOrderTable();
                                refreshProductTable();
                                //set total
                                totalOfAllOrder.setText(String.valueOf(setTotalOrder(orderController.getAllElement())));
                        }

                }
        }//GEN-LAST:event_orderUpdateQuantityMenuItemActionPerformed

        private void accountAdminTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_accountAdminTabbedPaneStateChanged
                // TODO add your handling code here:
                                int index = accountAdminTabbedPane.getSelectedIndex();;
                                switch (index) {
                                        case 0 -> setProductTable();
                                        case 1 ->  setOrderTable();
                                        case 2 ->  setAccountPanel(user);
                                        default -> {
                                                return;
                                        }
                                }
        }//GEN-LAST:event_accountAdminTabbedPaneStateChanged

        private void passwordTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextField1FocusLost
                // TODO add your handling code here:
                user.setPassword(String.valueOf(passwordTextField1.getPassword()));
        }//GEN-LAST:event_passwordTextField1FocusLost

        private void phoneTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextField1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_phoneTextField1ActionPerformed

        private void reEnterPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reEnterPasswordField1KeyTyped
                // TODO add your handling code here:
        }//GEN-LAST:event_reEnterPasswordField1KeyTyped

        private void reEnterPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reEnterPasswordField1KeyReleased
                if (user.getPassword().equals(String.valueOf(reEnterPasswordField1.getPassword()))) {
                        confirmPasswordLabel.setText("Mật khẩu khớp!");
                } else {
                        confirmPasswordLabel.setText("Mật khẩu không trùng khớp! ");
                }
        }//GEN-LAST:event_reEnterPasswordField1KeyReleased

        private void reEnterPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reEnterPasswordField1KeyPressed
                // TODO add your handling code here:
        }//GEN-LAST:event_reEnterPasswordField1KeyPressed

        private void reEnterPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reEnterPasswordField1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_reEnterPasswordField1ActionPerformed

        private void ageTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextField1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_ageTextField1ActionPerformed

        private void nameTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextField1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_nameTextField1ActionPerformed

        private void femaleGender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleGender1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_femaleGender1ActionPerformed

        private void maleGender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleGender1ActionPerformed
                // TODO add your handling code here:

        }//GEN-LAST:event_maleGender1ActionPerformed

        private void saveUserInforButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveUserInforButtonActionPerformed
                // TODO add your handling code here:
                //userInput
                user.setName(nameTextField1.getText());
                user.setAge(ageTextField1.getText());
                String gender = "";
                if (maleGender1.isSelected()) {
                        gender += maleGender1.getText();
                } else if (femaleGender1.isSelected()) {
                        gender += femaleGender1.getText();
                }
                user.setGender(gender);
                user.setPhone(phoneTextField1.getText());
                user.setAddress(nameTextField1.getText());
                user.setUserName(userNameTextField1.getText());
                user.setPassword(String.valueOf(passwordTextField1.getPassword()));
                //update
                userController.update(user);
                JOptionPane.showMessageDialog(this, "Update thành công", "thông báo", JOptionPane.INFORMATION_MESSAGE);
        }//GEN-LAST:event_saveUserInforButtonActionPerformed

        private void productSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productSearchButtonActionPerformed
                // TODO add your handling code here:
                String searchString = productSearchTextField.getText();
                defaultProductTableModel.setRowCount(0);
                setProductTableData(productController.getElementByCondition(searchString));
        }//GEN-LAST:event_productSearchButtonActionPerformed

        private void productSearchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productSearchTextFieldKeyReleased
                // TODO add your handling code here:
                String searchString = productSearchTextField.getText();
                defaultProductTableModel.setRowCount(0);
                setProductTableData(productController.getElementByCondition(searchString));
        }//GEN-LAST:event_productSearchTextFieldKeyReleased

        private void productSearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productSearchTextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_productSearchTextFieldActionPerformed

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                // TODO add your handling code here:
                int confirm = JOptionPane.showConfirmDialog(this, "Bạn muốn đăng xuất?");
                if (confirm == JOptionPane.YES_OPTION) {
                        new SignInFrame().setVisible(true);
                        this.dispose();
                }

        }//GEN-LAST:event_jButton5ActionPerformed

        /**
         * @param args the command line arguments
         */
//        public static void main(String args[]) {
//                /* Set the Nimbus look and feel */
//                //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//                /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//                 */
//                try {
//                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                                if ("Nimbus".equals(info.getName())) {
//                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                                        break;
//                                }
//                        }
//                } catch (ClassNotFoundException ex) {
//                        java.util.logging.Logger.getLogger(AdminProductListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//                } catch (InstantiationException ex) {
//                        java.util.logging.Logger.getLogger(AdminProductListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//                } catch (IllegalAccessException ex) {
//                        java.util.logging.Logger.getLogger(AdminProductListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//                        java.util.logging.Logger.getLogger(AdminProductListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//                }
//                //</editor-fold>
//                //</editor-fold>
//
//                /* Create and display the form */
//                java.awt.EventQueue.invokeLater(new Runnable() {
//                        public void run() {
//                                User user = new User();
//                                new UserFrame(user).setVisible(true);
//                        }
//                });
//        } // Nam21313 - namdeptrai
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTabbedPane accountAdminTabbedPane;
        private javax.swing.JTextArea addressTextField1;
        private javax.swing.JTextField ageTextField1;
        private javax.swing.JLabel confirmPasswordLabel;
        private javax.swing.JMenuItem createNewOrderMenuItem;
        private javax.swing.JRadioButton femaleGender1;
        private javax.swing.JButton jButton5;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel28;
        private javax.swing.JLabel jLabel29;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel30;
        private javax.swing.JLabel jLabel31;
        private javax.swing.JLabel jLabel32;
        private javax.swing.JLabel jLabel34;
        private javax.swing.JLabel jLabel35;
        private javax.swing.JLabel jLabel36;
        private javax.swing.JLabel jLabel37;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel10;
        private javax.swing.JPanel jPanel11;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel8;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JRadioButton maleGender1;
        private javax.swing.JTextField nameTextField1;
        private javax.swing.JMenuItem orderDeleteOrderMenuItem;
        private javax.swing.JPopupMenu orderPopupMenu;
        private javax.swing.JTable orderTable;
        private javax.swing.JMenuItem orderUpdateQuantityMenuItem;
        private javax.swing.JPasswordField passwordTextField1;
        private javax.swing.JTextField phoneTextField1;
        private javax.swing.JPopupMenu productPopupMenu;
        private javax.swing.JButton productSearchButton;
        private javax.swing.JTextField productSearchTextField;
        private javax.swing.JTable productTable;
        private javax.swing.JPasswordField reEnterPasswordField1;
        private javax.swing.JButton saveUserInforButton;
        private javax.swing.JLabel totalOfAllOrder;
        private javax.swing.JTextField userNameTextField1;
        // End of variables declaration//GEN-END:variables

}
