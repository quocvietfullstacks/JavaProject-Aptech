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
import model.Finance;
import model.Order;
import model.Product;
import model.User;

/**
 *
 * @author nguye
 */
public class AdminFrame extends javax.swing.JFrame {

        UserController userController;
        ProductController productController;
        OrderController orderController;
        DefaultTableModel defaultUserTableModel;
        DefaultTableModel defaultProductTableModel;
        DefaultTableModel defaultOrderTableModel;
        User userNew = new User();
        User userById, thisUser, user;
        Product productById;
        Finance finance;

        /**
         * Creates new form AdminFrame
         */
        public AdminFrame(User user) {
                this.user = user;
                productController = new ProductController();
                orderController = new OrderController();
                userController = new UserController();
                // tạm thời chình sửa để hợp lý với việc kiểm tra các ví dụ. 
                initComponents();
                this.finance = new Finance(2000000000, productController.getAllElement(), orderController.getAllElement());
        }

        private void setFinance(Finance finance) {
                vonHienTai.setText(String.valueOf(finance.getInvestment()));
                tongTienHangNhap.setText(String.valueOf(finance.getImportedCapital()));
                tongThuNhap.setText(String.valueOf(finance.getTotalRevenue()));
                lai.setText(String.valueOf(finance.getTotalProfit()));
                soVonHienTai.setText(String.valueOf(finance.getRemainingCapital()));
        }

        private void setUserTable() {
                defaultUserTableModel = new DefaultTableModel() {
                        @Override
                        public boolean isCellEditable(int row, int column) {
                                return false;
                        }

                };
                userTable.setModel(defaultUserTableModel);
                defaultUserTableModel.addColumn("_id");
                defaultUserTableModel.addColumn("họ và tên");
                defaultUserTableModel.addColumn("Tuổi");
                defaultUserTableModel.addColumn("Giới tính");
                defaultUserTableModel.addColumn("Số điện thoại");
                defaultUserTableModel.addColumn("Địa chỉ");
                defaultUserTableModel.addColumn("Tên tài khoản");
                defaultUserTableModel.addColumn("Mật khẩu");
                defaultUserTableModel.addColumn("rollNum");
                setUserTableData(userController.getAllElement());

                userTable.setComponentPopupMenu(userPopupMenu);
        }

        private void setUserTableData(List<User> userList) {
                for (User user : userList) {
                        defaultUserTableModel.addRow(new Object[]{
                                user.getId(),
                                user.getName(),
                                user.getAge(),
                                user.getGender(),
                                user.getPhone(),
                                user.getAddress(),
                                user.getUserName(),
                                user.getPassword(),
                                user.getRollNum()
                        });
                }
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
                defaultProductTableModel.addColumn("Giá nhập");
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
                                p.getImportPrice(),
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
                for (Order order : orderList) {
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
                productUpdateMenuItem = new javax.swing.JMenuItem();
                productDeleteMenuItem = new javax.swing.JMenuItem();
                createNewOrderMenuItem = new javax.swing.JMenuItem();
                userPopupMenu = new javax.swing.JPopupMenu();
                userUpdateMenuItem = new javax.swing.JMenuItem();
                userDeleteMenuItem = new javax.swing.JMenuItem();
                createNewOrderDialog = new javax.swing.JDialog();
                jButton3 = new javax.swing.JButton();
                jPanel9 = new javax.swing.JPanel();
                jLabel18 = new javax.swing.JLabel();
                jLabel19 = new javax.swing.JLabel();
                jLabel20 = new javax.swing.JLabel();
                jLabel21 = new javax.swing.JLabel();
                jLabel22 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jTextField2 = new javax.swing.JTextField();
                jTextField3 = new javax.swing.JTextField();
                jTextField4 = new javax.swing.JTextField();
                jTextField5 = new javax.swing.JTextField();
                jLabel23 = new javax.swing.JLabel();
                jTextField6 = new javax.swing.JTextField();
                jLabel24 = new javax.swing.JLabel();
                jLabel25 = new javax.swing.JLabel();
                jLabel26 = new javax.swing.JLabel();
                jTextField7 = new javax.swing.JTextField();
                jTextField8 = new javax.swing.JTextField();
                jButton4 = new javax.swing.JButton();
                jLabel27 = new javax.swing.JLabel();
                orderPopupMenu = new javax.swing.JPopupMenu();
                orderUpdateQuantityMenuItem = new javax.swing.JMenuItem();
                orderDeleteOrderMenuItem = new javax.swing.JMenuItem();
                buttonGroup2 = new javax.swing.ButtonGroup();
                buttonGroup1 = new javax.swing.ButtonGroup();
                buttonGroup3 = new javax.swing.ButtonGroup();
                jPanel15 = new javax.swing.JPanel();
                jPanel17 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel41 = new javax.swing.JLabel();
                jPanel18 = new javax.swing.JPanel();
                accountAdminTabbedPane = new javax.swing.JTabbedPane();
                jPanel3 = new javax.swing.JPanel();
                jScrollPane3 = new javax.swing.JScrollPane();
                productTable = new javax.swing.JTable();
                jPanel4 = new javax.swing.JPanel();
                name1 = new javax.swing.JTextField();
                gia_nhap1 = new javax.swing.JTextField();
                gia_ban1 = new javax.swing.JTextField();
                so_luong1 = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();
                addProductButton = new javax.swing.JButton();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                saveProducButton = new javax.swing.JButton();
                jPanel5 = new javax.swing.JPanel();
                productSearchTextField = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                productSearchButton = new javax.swing.JButton();
                jSeparator3 = new javax.swing.JSeparator();
                jSeparator4 = new javax.swing.JSeparator();
                jPanel1 = new javax.swing.JPanel();
                jPanel16 = new javax.swing.JPanel();
                jLabel33 = new javax.swing.JLabel();
                jScrollPane4 = new javax.swing.JScrollPane();
                orderTable = new javax.swing.JTable();
                jPanel2 = new javax.swing.JPanel();
                jScrollPane2 = new javax.swing.JScrollPane();
                userTable = new javax.swing.JTable();
                jPanel7 = new javax.swing.JPanel();
                userSearchTextField = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                userSearchButton = new javax.swing.JButton();
                jPanel8 = new javax.swing.JPanel();
                passwordTextField = new javax.swing.JPasswordField();
                jLabel4 = new javax.swing.JLabel();
                jScrollPane5 = new javax.swing.JScrollPane();
                addressTextField = new javax.swing.JTextArea();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                addUserButton = new javax.swing.JButton();
                jLabel8 = new javax.swing.JLabel();
                maleGender = new javax.swing.JRadioButton();
                jLabel13 = new javax.swing.JLabel();
                femaleGender = new javax.swing.JRadioButton();
                nameTextField = new javax.swing.JTextField();
                ageTextField = new javax.swing.JTextField();
                reEnterPasswordField = new javax.swing.JPasswordField();
                phoneTextField = new javax.swing.JTextField();
                jLabel14 = new javax.swing.JLabel();
                userNameTextField = new javax.swing.JTextField();
                jLabel15 = new javax.swing.JLabel();
                jLabel16 = new javax.swing.JLabel();
                jLabel17 = new javax.swing.JLabel();
                confirmPasswordLabel = new javax.swing.JLabel();
                javax.swing.JButton saveUserButton = new javax.swing.JButton();
                jPanel12 = new javax.swing.JPanel();
                jPanel14 = new javax.swing.JPanel();
                jLabel39 = new javax.swing.JLabel();
                jLabel40 = new javax.swing.JLabel();
                jLabel42 = new javax.swing.JLabel();
                jLabel43 = new javax.swing.JLabel();
                jLabel44 = new javax.swing.JLabel();
                vonHienTai = new javax.swing.JTextField();
                tongTienHangNhap = new javax.swing.JTextField();
                tongThuNhap = new javax.swing.JTextField();
                lai = new javax.swing.JTextField();
                soVonHienTai = new javax.swing.JTextField();
                updateInvestmentjButton = new javax.swing.JButton();
                jLabel38 = new javax.swing.JLabel();
                jPanel6 = new javax.swing.JPanel();
                jPanel10 = new javax.swing.JPanel();
                jLabel28 = new javax.swing.JLabel();
                jPanel11 = new javax.swing.JPanel();
                jLabel29 = new javax.swing.JLabel();
                submitButton = new javax.swing.JButton();
                jLabel30 = new javax.swing.JLabel();
                maleGender1 = new javax.swing.JRadioButton();
                jLabel31 = new javax.swing.JLabel();
                femaleGender1 = new javax.swing.JRadioButton();
                nameTextField1 = new javax.swing.JTextField();
                ageTextField1 = new javax.swing.JTextField();
                reEnterPasswordField2 = new javax.swing.JPasswordField();
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
                confirmLabel = new javax.swing.JLabel();
                logoutButton = new javax.swing.JButton();

                productUpdateMenuItem.setText("Update");
                productUpdateMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                productUpdateMenuItemActionPerformed(evt);
                        }
                });
                productPopupMenu.add(productUpdateMenuItem);

                productDeleteMenuItem.setText("Delete");
                productDeleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                productDeleteMenuItemActionPerformed(evt);
                        }
                });
                productPopupMenu.add(productDeleteMenuItem);

                createNewOrderMenuItem.setText("Create new Order");
                createNewOrderMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                createNewOrderMenuItemActionPerformed(evt);
                        }
                });
                productPopupMenu.add(createNewOrderMenuItem);

                userUpdateMenuItem.setText("Update");
                userUpdateMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                userUpdateMenuItemActionPerformed(evt);
                        }
                });
                userPopupMenu.add(userUpdateMenuItem);

                userDeleteMenuItem.setText("Delete");
                userDeleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                userDeleteMenuItemActionPerformed(evt);
                        }
                });
                userPopupMenu.add(userDeleteMenuItem);

                jButton3.setText("Back");

                jLabel18.setText("Product ID");

                jLabel19.setText("Product Name");

                jLabel20.setText("UserName");

                jLabel21.setText("Sale Price");

                jLabel22.setText("Quantity");

                jTextField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField1ActionPerformed(evt);
                        }
                });

                jTextField2.setEditable(false);
                jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
                jTextField2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField2ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
                jPanel9.setLayout(jPanel9Layout);
                jPanel9Layout.setHorizontalGroup(
                        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 139, Short.MAX_VALUE))
                );
                jPanel9Layout.setVerticalGroup(
                        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                jLabel23.setText("Total");

                jTextField6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField6ActionPerformed(evt);
                        }
                });

                jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel24.setText("Thông tin giao hàng");

                jLabel25.setText("Phone Number: ");

                jLabel26.setText("Address: ");

                jTextField8.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField8ActionPerformed(evt);
                        }
                });

                jButton4.setText("Đặt hàng");

                jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel27.setText("Xác nhận thông tin đơn hàng!");

                javax.swing.GroupLayout createNewOrderDialogLayout = new javax.swing.GroupLayout(createNewOrderDialog.getContentPane());
                createNewOrderDialog.getContentPane().setLayout(createNewOrderDialogLayout);
                createNewOrderDialogLayout.setHorizontalGroup(
                        createNewOrderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(createNewOrderDialogLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(createNewOrderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(createNewOrderDialogLayout.createSequentialGroup()
                                                .addGroup(createNewOrderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(createNewOrderDialogLayout.createSequentialGroup()
                                                                .addGroup(createNewOrderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(createNewOrderDialogLayout.createSequentialGroup()
                                                                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jTextField8))
                                                                        .addGroup(createNewOrderDialogLayout.createSequentialGroup()
                                                                                .addComponent(jLabel25)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jTextField7))
                                                                        .addGroup(createNewOrderDialogLayout.createSequentialGroup()
                                                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(createNewOrderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                                                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(createNewOrderDialogLayout.createSequentialGroup()
                                                                .addComponent(jButton3)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                createNewOrderDialogLayout.setVerticalGroup(
                        createNewOrderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(createNewOrderDialogLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(createNewOrderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton3)
                                        .addGroup(createNewOrderDialogLayout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(createNewOrderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(createNewOrderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(createNewOrderDialogLayout.createSequentialGroup()
                                                .addGroup(createNewOrderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(createNewOrderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(createNewOrderDialogLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(38, 38, 38))
                );

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
                setBackground(new java.awt.Color(255, 51, 51));

                jPanel15.setBackground(new java.awt.Color(225, 111, 27));
                jPanel15.setForeground(new java.awt.Color(225, 111, 27));
                jPanel15.setToolTipText("");

                jPanel17.setBackground(new java.awt.Color(221, 153, 138));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/Java-icon.png"))); // NOI18N
                jLabel1.setText("ADAM Store");

                jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/coffee-icon.png"))); // NOI18N

                javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
                jPanel17.setLayout(jPanel17Layout);
                jPanel17Layout.setHorizontalGroup(
                        jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel41)
                                .addGap(225, 225, 225)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel17Layout.setVerticalGroup(
                        jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel41)
                                .addContainerGap(17, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                );

                jPanel18.setBackground(new java.awt.Color(162, 104, 92));

                accountAdminTabbedPane.setBackground(new java.awt.Color(162, 104, 92));
                accountAdminTabbedPane.setToolTipText("");
                accountAdminTabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                accountAdminTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                accountAdminTabbedPaneStateChanged(evt);
                        }
                });

                jPanel3.setBackground(new java.awt.Color(162, 104, 92));

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

                jPanel4.setBackground(new java.awt.Color(255, 246, 236));

                name1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                name1ActionPerformed(evt);
                        }
                });

                gia_nhap1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                gia_nhap1ActionPerformed(evt);
                        }
                });

                gia_ban1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                gia_ban1ActionPerformed(evt);
                        }
                });

                jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/Order-history-icon.png"))); // NOI18N
                jLabel7.setText("Chỉnh sửa thông tin sản phẩm. ");

                addProductButton.setBackground(new java.awt.Color(255, 204, 204));
                addProductButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                addProductButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/add-icon.png"))); // NOI18N
                addProductButton.setText("  Add");
                addProductButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addProductButtonActionPerformed(evt);
                        }
                });

                jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel9.setText("tên");

                jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel10.setText("giá nhập");

                jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel11.setText("giá bán");

                jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel12.setText("số lượng");

                saveProducButton.setBackground(new java.awt.Color(255, 204, 204));
                saveProducButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                saveProducButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/accept-icon.png"))); // NOI18N
                saveProducButton.setText("  Save");
                saveProducButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                saveProducButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(130, 130, 130)
                                                .addComponent(addProductButton)
                                                .addGap(59, 59, 59)
                                                .addComponent(saveProducButton))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel7)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(so_luong1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(gia_ban1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(gia_nhap1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(58, Short.MAX_VALUE))
                );
                jPanel4Layout.setVerticalGroup(
                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(gia_nhap1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(gia_ban1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(so_luong1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(saveProducButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49))
                );

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
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(productSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(productSearchButton)
                                .addContainerGap(701, Short.MAX_VALUE))
                );
                jPanel5Layout.setVerticalGroup(
                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(productSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(productSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 7, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                );

                jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                                .addGap(451, 451, 451)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(244, 244, 244))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jScrollPane3)
                                                .addGap(27, 27, 27))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                );

                accountAdminTabbedPane.addTab("Danh sách sản phẩm", jPanel3);

                jPanel1.setBackground(new java.awt.Color(162, 104, 92));

                jPanel16.setBackground(new java.awt.Color(221, 153, 138));

                jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/cart-icon (1).png"))); // NOI18N
                jLabel33.setText("     Danh sách đơn hàng");

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

                javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
                jPanel16.setLayout(jPanel16Layout);
                jPanel16Layout.setHorizontalGroup(
                        jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane4)
                                .addContainerGap())
                        .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(359, Short.MAX_VALUE))
                );
                jPanel16Layout.setVerticalGroup(
                        jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(18, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(46, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                );

                accountAdminTabbedPane.addTab("Danh sách đơn hàng", jPanel1);

                jPanel2.setBackground(new java.awt.Color(162, 104, 92));

                userTable.setAutoCreateRowSorter(true);
                userTable.setBackground(new java.awt.Color(245, 219, 213));
                userTable.setModel(new javax.swing.table.DefaultTableModel(
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
                userTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
                jScrollPane2.setViewportView(userTable);

                jPanel7.setBackground(new java.awt.Color(221, 153, 138));

                userSearchTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                userSearchTextFieldActionPerformed(evt);
                        }
                });
                userSearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                userSearchTextFieldKeyReleased(evt);
                        }
                });

                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/ModernXP-20-Seach-icon.png"))); // NOI18N

                userSearchButton.setBackground(new java.awt.Color(255, 204, 204));
                userSearchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                userSearchButton.setText("Search");
                userSearchButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                userSearchButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(userSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel7Layout.setVerticalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap(16, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(userSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                );

                jPanel8.setBackground(new java.awt.Color(255, 246, 236));

                passwordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                passwordTextFieldFocusLost(evt);
                        }
                });

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel4.setText("Tuổi ");

                addressTextField.setColumns(20);
                addressTextField.setRows(5);
                jScrollPane5.setViewportView(addressTextField);

                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel5.setText("Giới tính ");

                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel6.setText("phone");

                addUserButton.setBackground(new java.awt.Color(255, 204, 204));
                addUserButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                addUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/add-icon.png"))); // NOI18N
                addUserButton.setText("Add New");
                addUserButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addUserButtonActionPerformed(evt);
                        }
                });

                jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel8.setText("Địa chỉ ");

                maleGender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                maleGender.setText("male");
                maleGender.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                maleGenderActionPerformed(evt);
                        }
                });

                jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel13.setText("Acount Name");

                femaleGender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                femaleGender.setText("female");
                femaleGender.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                femaleGenderActionPerformed(evt);
                        }
                });

                nameTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                nameTextFieldActionPerformed(evt);
                        }
                });

                ageTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ageTextFieldActionPerformed(evt);
                        }
                });

                reEnterPasswordField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                reEnterPasswordFieldActionPerformed(evt);
                        }
                });
                reEnterPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                reEnterPasswordFieldKeyPressed(evt);
                        }
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                reEnterPasswordFieldKeyReleased(evt);
                        }
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                reEnterPasswordFieldKeyTyped(evt);
                        }
                });

                phoneTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                phoneTextFieldActionPerformed(evt);
                        }
                });

                jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel14.setText("Re-enter Password");

                jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/Actions-list-add-user-icon (1).png"))); // NOI18N
                jLabel15.setText("      Chỉnh sửa tài khoản người dùng");

                jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel16.setText("Password");

                jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel17.setText("Tên ");

                saveUserButton.setBackground(new java.awt.Color(255, 204, 204));
                saveUserButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                saveUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/accept-icon.png"))); // NOI18N
                saveUserButton.setText("Save");
                saveUserButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                saveUserButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
                jPanel8.setLayout(jPanel8Layout);
                jPanel8Layout.setHorizontalGroup(
                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel14))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(confirmPasswordLabel)
                                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(reEnterPasswordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                                                .addComponent(passwordTextField))))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel17))
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                                .addGap(312, 312, 312)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                                .addGap(314, 314, 314)
                                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addGroup(jPanel8Layout.createSequentialGroup()
                                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addComponent(maleGender)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addComponent(femaleGender))
                                                                                .addGroup(jPanel8Layout.createSequentialGroup()
                                                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(phoneTextField)))
                                                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                                                .addComponent(saveUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(26, 26, 26)
                                                                                .addComponent(addUserButton))))))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(53, Short.MAX_VALUE))
                );
                jPanel8Layout.setVerticalGroup(
                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(14, 14, 14))
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(maleGender)
                                        .addComponent(femaleGender))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(reEnterPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(saveUserButton)
                                        .addComponent(addUserButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(confirmPasswordLabel))
                );

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(14, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151))
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
                );

                accountAdminTabbedPane.addTab("Danh sách người dùng", jPanel2);

                jPanel12.setBackground(new java.awt.Color(245, 219, 213));

                jPanel14.setBackground(new java.awt.Color(255, 246, 236));

                jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel39.setText("Tổng tiền hàng nhập");

                jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel40.setText("Tổng thu nhập");

                jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel42.setText("Lãi");

                jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel43.setText("Vốn khởi điểm");

                jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel44.setText("Số vốn hiện tại");

                vonHienTai.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                vonHienTaiActionPerformed(evt);
                        }
                });

                tongTienHangNhap.setEditable(false);

                tongThuNhap.setEditable(false);

                lai.setEditable(false);
                lai.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                laiActionPerformed(evt);
                        }
                });

                soVonHienTai.setEditable(false);
                soVonHienTai.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                soVonHienTaiActionPerformed(evt);
                        }
                });

                updateInvestmentjButton.setBackground(new java.awt.Color(51, 51, 255));
                updateInvestmentjButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                updateInvestmentjButton.setForeground(new java.awt.Color(255, 255, 255));
                updateInvestmentjButton.setText("Cập nhật vốn khởi điểm");
                updateInvestmentjButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                updateInvestmentjButtonActionPerformed(evt);
                        }
                });

                jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/Custom-reports-icon.png"))); // NOI18N
                jLabel38.setText("Báo cáo tài chính");

                javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
                jPanel14.setLayout(jPanel14Layout);
                jPanel14Layout.setHorizontalGroup(
                        jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(updateInvestmentjButton)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tongTienHangNhap)
                                                .addComponent(tongThuNhap)
                                                .addComponent(lai)
                                                .addComponent(soVonHienTai, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                                        .addComponent(vonHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(108, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147))
                );
                jPanel14Layout.setVerticalGroup(
                        jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(vonHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tongTienHangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tongThuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(soVonHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(updateInvestmentjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))
                );

                javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
                jPanel12.setLayout(jPanel12Layout);
                jPanel12Layout.setHorizontalGroup(
                        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(277, Short.MAX_VALUE))
                );
                jPanel12Layout.setVerticalGroup(
                        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(206, Short.MAX_VALUE))
                );

                accountAdminTabbedPane.addTab("Báo  Cáo Tài Chính", jPanel12);

                jPanel6.setBackground(new java.awt.Color(245, 219, 213));

                jPanel10.setBackground(new java.awt.Color(255, 246, 236));

                jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/personal-information-icon.png"))); // NOI18N
                jLabel28.setText("Thông tin cá nhân");

                jPanel11.setBackground(new java.awt.Color(255, 246, 236));

                jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel29.setText("Số điển thoại ");

                submitButton.setBackground(new java.awt.Color(255, 204, 204));
                submitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                submitButton.setForeground(new java.awt.Color(51, 51, 51));
                submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/accept-icon.png"))); // NOI18N
                submitButton.setText("  Save");
                submitButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                submitButtonActionPerformed(evt);
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

                reEnterPasswordField2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                reEnterPasswordField2ActionPerformed(evt);
                        }
                });
                reEnterPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                reEnterPasswordField2KeyPressed(evt);
                        }
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                reEnterPasswordField2KeyReleased(evt);
                        }
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                reEnterPasswordField2KeyTyped(evt);
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

                confirmLabel.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                confirmLabelKeyReleased(evt);
                        }
                });

                javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
                jPanel11.setLayout(jPanel11Layout);
                jPanel11Layout.setHorizontalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ageTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addComponent(maleGender1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(femaleGender1))
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(confirmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(45, Short.MAX_VALUE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                                                .addComponent(userNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel32))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(reEnterPasswordField2)
                                                                        .addComponent(passwordTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))))
                                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addContainerGap(37, Short.MAX_VALUE)))
                );
                jPanel11Layout.setVerticalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addContainerGap(57, Short.MAX_VALUE)
                                .addComponent(nameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ageTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(phoneTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(maleGender1)))
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(femaleGender1)))
                                .addGap(122, 122, 122)
                                .addComponent(confirmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(userNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(passwordTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(reEnterPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel32))
                                        .addContainerGap(101, Short.MAX_VALUE)))
                );

                logoutButton.setBackground(new java.awt.Color(255, 204, 204));
                logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/Icon/img/system-log-out-icon.png"))); // NOI18N
                logoutButton.setText("Log out");
                logoutButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                logoutButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
                jPanel10.setLayout(jPanel10Layout);
                jPanel10Layout.setHorizontalGroup(
                        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(logoutButton)
                                .addGap(19, 19, 19))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addGap(200, 200, 200)
                                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addGap(87, 87, 87)
                                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(85, Short.MAX_VALUE))
                );
                jPanel10Layout.setVerticalGroup(
                        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(logoutButton)
                                .addContainerGap(79, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(221, Short.MAX_VALUE)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(226, 226, 226))
                );
                jPanel6Layout.setVerticalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                accountAdminTabbedPane.addTab("Account", jPanel6);

                javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
                jPanel18.setLayout(jPanel18Layout);
                jPanel18Layout.setHorizontalGroup(
                        jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(accountAdminTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                );
                jPanel18Layout.setVerticalGroup(
                        jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(accountAdminTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                );

                javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
                jPanel15.setLayout(jPanel15Layout);
                jPanel15Layout.setHorizontalGroup(
                        jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel15Layout.createSequentialGroup()
                                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 1062, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );
                jPanel15Layout.setVerticalGroup(
                        jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(15, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(19, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(461, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void accountAdminTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_accountAdminTabbedPaneStateChanged
                // TODO add your handling code here:
                int index = accountAdminTabbedPane.getSelectedIndex();
                switch (index) {
                        case 0 ->
                                setProductTable();
                        case 1 ->
                                setOrderTable();
                        case 2 ->
                                setUserTable();
                        case 3 ->      
                                setFinance(finance);
                        case 4 ->  
                                setAccountPanel(user);
                        default -> {
                                return;
                        }
                }
        }//GEN-LAST:event_accountAdminTabbedPaneStateChanged

        private void productSearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productSearchTextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_productSearchTextFieldActionPerformed

        private void addProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductButtonActionPerformed
                // TODO add your handling code here:
                Product existProduct = productController.getElementByName(name1.getText());
                Product newProduct = new Product();
                if (existProduct == null) {
                        // chưa tồn tại thì thêm mới
                        newProduct.setProductName(name1.getText());
                        newProduct.setPriceRetail(Double.parseDouble(gia_ban1.getText()));
                        newProduct.setImportPrice(Double.parseDouble(gia_nhap1.getText()));
                        newProduct.setQuantityInStock(Integer.parseInt(so_luong1.getText()));

                        productController.insert(newProduct);
                        finance.setImportedCapital(productController.getAllElement());
                        refreshProductTable();
                } else {
                        // tồn tại thì cập nhật số lượng 
                        existProduct.setQuantityInStock(existProduct.getQuantityInStock() + Integer.parseInt(so_luong1.getText()));
                        productController.update(existProduct);
                        finance.setImportedCapital(productController.getAllElement());
                        refreshProductTable();
                }
        }//GEN-LAST:event_addProductButtonActionPerformed
        private void refreshProductTable() {
                defaultProductTableModel.setRowCount(0);
                setProductTableData(productController.getAllElement());
        }
        private void gia_ban1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gia_ban1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_gia_ban1ActionPerformed

        private void gia_nhap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gia_nhap1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_gia_nhap1ActionPerformed

        private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_name1ActionPerformed

        private void productUpdateMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productUpdateMenuItemActionPerformed
                // TODO add your handling code here:
                int row = productTable.getSelectedRow();
                if (row == -1) {
                        JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng trước khi cập nhật! ", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                        //get id
                        String productCode = String.valueOf(productTable.getValueAt(row, 0));
                        //to Update Frame
                        setUpdateProductForm(productCode);
                }
        }//GEN-LAST:event_productUpdateMenuItemActionPerformed

        private void saveProducButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProducButtonActionPerformed
                // TODO add your handling code here:
                productById.setProductName(name1.getText());
                productById.setPriceRetail(Double.parseDouble(gia_ban1.getText()));
                productById.setImportPrice(Double.parseDouble(gia_nhap1.getText()));
                productById.setQuantityInStock(Integer.parseInt(so_luong1.getText()));

                productController.update(productById);
                finance.setImportedCapital(productController.getAllElement());
                refreshProductTable();
        }//GEN-LAST:event_saveProducButtonActionPerformed

        private void productDeleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productDeleteMenuItemActionPerformed
                // TODO add your handling code here:
                int row = productTable.getSelectedRow();
                if (row == -1) {
                        JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng trước khi xóa! ", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                        int confirm = JOptionPane.showConfirmDialog(this, "bạn có chắc chắn muốn xóa không?");
                        if (confirm == JOptionPane.YES_OPTION) {
                                String productCode = String.valueOf(productTable.getValueAt(row, 0));
                                //delete
                                productController.delete(productCode);
                                finance.setImportedCapital(productController.getAllElement());
                                setAccountPanel(user);
                                refreshProductTable();
                        }
                }
        }//GEN-LAST:event_productDeleteMenuItemActionPerformed

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

        private void userSearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSearchTextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_userSearchTextFieldActionPerformed

        private void userSearchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userSearchTextFieldKeyReleased
                // TODO add your handling code here:
                String searchString = userSearchTextField.getText();
                defaultUserTableModel.setRowCount(0);
                setUserTableData(userController.getElementByCondition(searchString));
        }//GEN-LAST:event_userSearchTextFieldKeyReleased

        private void userSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSearchButtonActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_userSearchButtonActionPerformed

        private void passwordTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFieldFocusLost
                // TODO add your handling code here:

                userNew.setPassword(String.valueOf(passwordTextField.getPassword()));
        }//GEN-LAST:event_passwordTextFieldFocusLost

        private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
                // TODO add your handling code here:
                //userInput
                userNew.setName(nameTextField.getText());
                userNew.setAge(ageTextField.getText());
                String gender = "";
                if (maleGender.isSelected()) {
                        gender += maleGender.getText();
                } else if (femaleGender.isSelected()) {
                        gender += femaleGender.getText();
                }
                userNew.setGender(gender);
                userNew.setPhone(phoneTextField.getText());
                userNew.setAddress(addressTextField.getText());
                userNew.setUserName(userNameTextField.getText());
                userNew.setPassword(String.valueOf(passwordTextField.getPassword()));
                userNew.setRollNum(2);

                // if null
                if (userNew.getName().isEmpty() || userNew.getAge().isEmpty() || userNew.getGender().isEmpty() || userNew.getPhone().isEmpty()
                        || userNew.getAddress().isEmpty() || userNew.getUserName().isEmpty() || userNew.getPassword().isEmpty()) {
                        JOptionPane.showConfirmDialog(rootPane, "Some Fields Are is Empty",
                                "Error", 1);
                } else {
                        userById = userController.getElementByName(userNew.getUserName());

                        if (userById != null) { //  ten tai khoan da ton tai
                                JOptionPane.showMessageDialog(this, "UserName đã tồn tại!",
                                        "Error", JOptionPane.ERROR_MESSAGE);
                                //Note
                        } else if (userController.getElementByConditionPhone(userNew.getPhone()).size() != 0) {
                                JOptionPane.showMessageDialog(this, "Số điện thoại đã được đăng ký! ",
                                        "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                                userController.insert(userNew);
                                JOptionPane.showMessageDialog(this, "Tạo tài khoản thành công!",
                                        "Successful", JOptionPane.INFORMATION_MESSAGE);
                                refreshUserTable();
                        }
                }

        }//GEN-LAST:event_addUserButtonActionPerformed
        private void refreshUserTable() {
                defaultUserTableModel.setRowCount(0);
                setUserTableData(userController.getAllElement());
        }
        private void maleGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleGenderActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_maleGenderActionPerformed

        private void femaleGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleGenderActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_femaleGenderActionPerformed

        private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_nameTextFieldActionPerformed

        private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_ageTextFieldActionPerformed

        private void reEnterPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reEnterPasswordFieldActionPerformed

        }//GEN-LAST:event_reEnterPasswordFieldActionPerformed

        private void reEnterPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reEnterPasswordFieldKeyPressed

        }//GEN-LAST:event_reEnterPasswordFieldKeyPressed

        private void reEnterPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reEnterPasswordFieldKeyReleased
                if (userNew.getPassword().equals(String.valueOf(reEnterPasswordField.getPassword()))) {
                        confirmPasswordLabel.setText("Mật khẩu khớp!");
                } else {
                        confirmPasswordLabel.setText("Mật khẩu không trùng khớp! ");
                }
        }//GEN-LAST:event_reEnterPasswordFieldKeyReleased

        private void reEnterPasswordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reEnterPasswordFieldKeyTyped
                // TODO add your handling code here:

        }//GEN-LAST:event_reEnterPasswordFieldKeyTyped

        private void phoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_phoneTextFieldActionPerformed

        private void userUpdateMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userUpdateMenuItemActionPerformed
                // TODO add your handling code here:
                int row = userTable.getSelectedRow();
                if (row == -1) {
                        JOptionPane.showMessageDialog(this, "Vui long chon row truoc! ", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                        //get ID String. 
                        String userID = String.valueOf(userTable.getValueAt(row, 0));
                        //to Update frame
                        setUpdateUserForm(userID);
                }
        }//GEN-LAST:event_userUpdateMenuItemActionPerformed

        private void userDeleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDeleteMenuItemActionPerformed
                // TODO add your handling code here:
                int row = userTable.getSelectedRow();
                if (row == -1) {
                        JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng trước khi xóa! ", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                        int confirm = JOptionPane.showConfirmDialog(this, "bạn có chắc chắn muốn xóa không?");
                        if (confirm == JOptionPane.YES_OPTION) {
                                String userID = String.valueOf(userTable.getValueAt(row, 0));
                                //delete
                                userController.delete(userID);
                                //set lai Table Data
                                refreshUserTable();
                        }
                }
        }//GEN-LAST:event_userDeleteMenuItemActionPerformed

        private void saveUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveUserButtonActionPerformed
                // TODO add your handling code here:
                userById.setName(nameTextField.getText());
                userById.setAge(ageTextField.getText());
                String gender = "";
                if (maleGender.isSelected()) {
                        gender += maleGender.getText();
                } else if (femaleGender.isSelected()) {
                        gender += femaleGender.getText();
                }
                userById.setGender(gender);
                userById.setPhone(phoneTextField.getText());
                userById.setAddress(nameTextField.getText());
                userById.setUserName(userNameTextField.getText());
                userById.setPassword(String.valueOf(passwordTextField.getPassword()));
                //update
                userController.update(userById);
                refreshUserTable();
        }//GEN-LAST:event_saveUserButtonActionPerformed

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
                        // create new Order + insert
                        Order newOrder = new Order(user, thisProduct, quantity);
                        orderController.insert(newOrder);
                        finance.setTotalRevenue(orderController.getAllElement());
                        refreshOrderTable();
                        refreshProductTable();
                }


        }//GEN-LAST:event_createNewOrderMenuItemActionPerformed
        private void refreshOrderTable() {
                defaultOrderTableModel.setRowCount(0);
                setOrderTableData(orderController.getAllElement());
        }
        private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField2ActionPerformed

        private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField1ActionPerformed

        private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField6ActionPerformed

        private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField8ActionPerformed

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
                                finance.setTotalRevenue(orderController.getAllElement());
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
                                finance.setTotalRevenue(orderController.getAllElement());
                                refreshOrderTable();
                        } else {
                                // update Order -> update Quatity in stock
                                thisProduct.setQuantityInStock(thisProduct.getQuantityInStock() + (thisOrder.getQuantity() - quantity));
                                productController.update(thisProduct);
                                // set and update Order
                                thisOrder.setQuantity(quantity);
                                thisOrder.setTotal(thisProduct.getPriceRetail() * quantity);
                                orderController.update(thisOrder);
                                // refresh table
                                finance.setTotalRevenue(orderController.getAllElement());
                                refreshOrderTable();
                                refreshProductTable();
                        }

                }
        }//GEN-LAST:event_orderUpdateQuantityMenuItemActionPerformed

        private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
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
                String pass = user.getPassword();
                String repass = String.valueOf(reEnterPasswordField2.getPassword());
                if (pass.equals(repass)) {
                        userController.update(user);
                        JOptionPane.showMessageDialog(this, "Update thành công", "thông báo", JOptionPane.INFORMATION_MESSAGE);
                        refreshUserTable();
                } else {
                        JOptionPane.showMessageDialog(this, "Some Fields Are is Empty, or reEnterPasswordField is not correct", "thông báo", JOptionPane.INFORMATION_MESSAGE);
                }

        }//GEN-LAST:event_submitButtonActionPerformed

        private void maleGender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleGender1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_maleGender1ActionPerformed

        private void femaleGender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleGender1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_femaleGender1ActionPerformed

        private void nameTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextField1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_nameTextField1ActionPerformed

        private void ageTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextField1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_ageTextField1ActionPerformed

        private void reEnterPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reEnterPasswordField2ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_reEnterPasswordField2ActionPerformed

        private void reEnterPasswordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reEnterPasswordField2KeyPressed
                // TODO add your handling code here:
        }//GEN-LAST:event_reEnterPasswordField2KeyPressed

        private void reEnterPasswordField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reEnterPasswordField2KeyReleased
                if (user.getPassword().equals(String.valueOf(reEnterPasswordField2.getPassword()))) {
                        confirmLabel.setText("Mật khẩu khớp!");
                } else {
                        confirmLabel.setText("Mật khẩu không trùng khớp! ");
                }
        }//GEN-LAST:event_reEnterPasswordField2KeyReleased

        private void reEnterPasswordField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reEnterPasswordField2KeyTyped
                // TODO add your handling code here:
        }//GEN-LAST:event_reEnterPasswordField2KeyTyped

        private void phoneTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextField1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_phoneTextField1ActionPerformed

        private void passwordTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextField1FocusLost
                // TODO add your handling code here:
                user.setPassword(String.valueOf(passwordTextField1.getPassword()));
        }//GEN-LAST:event_passwordTextField1FocusLost

        private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
                // TODO add your handling code here:
                int confirm = JOptionPane.showConfirmDialog(this, "Bạn muốn đăng xuất?");
                if (confirm == JOptionPane.YES_OPTION) {
                        new SignInFrame().setVisible(true);
                        this.dispose();
                }
        }//GEN-LAST:event_logoutButtonActionPerformed

        private void updateInvestmentjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInvestmentjButtonActionPerformed
                // TODO add your handling code here:
                finance.setInvestment(Double.parseDouble(vonHienTai.getText()));
                setFinance(finance);
        }//GEN-LAST:event_updateInvestmentjButtonActionPerformed

        private void soVonHienTaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soVonHienTaiActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_soVonHienTaiActionPerformed

        private void laiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laiActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_laiActionPerformed

        private void vonHienTaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vonHienTaiActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_vonHienTaiActionPerformed

        private void confirmLabelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmLabelKeyReleased
                // TODO add your handling code here:
                if (user.getPassword().equals(String.valueOf(reEnterPasswordField2.getPassword()))) {
                        confirmLabel.setText("Mật khẩu khớp!");
                } else {
                        confirmLabel.setText("Mật khẩu không trùng khớp! ");
                }
        }//GEN-LAST:event_confirmLabelKeyReleased

        private void setUpdateProductForm(String productCode) {
                productById = productController.getElementById(productCode);

                name1.setText(productById.getProductName());
                gia_ban1.setText(String.valueOf(productById.getPriceRetail()));
                gia_nhap1.setText(String.valueOf(productById.getImportPrice()));
                so_luong1.setText(String.valueOf(productById.getQuantityInStock()));
        }

        private void setUpdateUserForm(String userID) {
                userById = userController.getElementById(userID);

                nameTextField.setText(userById.getName());
                ageTextField.setText(userById.getAge());
                String gender = userById.getGender();
                if (gender != null) {
                        if (gender.equals("male")) {
                                maleGender.setSelected(true);
                        } else {
                                femaleGender.setSelected(true);
                        }
                }

                phoneTextField.setText(userById.getPhone());
                addressTextField.setText(userById.getAddress());
                userNameTextField.setText(userById.getUserName());
                passwordTextField.setText(userById.getPassword());
        }

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
        private javax.swing.JButton addProductButton;
        private javax.swing.JButton addUserButton;
        private javax.swing.JTextArea addressTextField;
        private javax.swing.JTextArea addressTextField1;
        private javax.swing.JTextField ageTextField;
        private javax.swing.JTextField ageTextField1;
        private javax.swing.ButtonGroup buttonGroup1;
        private javax.swing.ButtonGroup buttonGroup2;
        private javax.swing.ButtonGroup buttonGroup3;
        private javax.swing.JLabel confirmLabel;
        private javax.swing.JLabel confirmPasswordLabel;
        private javax.swing.JDialog createNewOrderDialog;
        private javax.swing.JMenuItem createNewOrderMenuItem;
        private javax.swing.JRadioButton femaleGender;
        private javax.swing.JRadioButton femaleGender1;
        private javax.swing.JTextField gia_ban1;
        private javax.swing.JTextField gia_nhap1;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel17;
        private javax.swing.JLabel jLabel18;
        private javax.swing.JLabel jLabel19;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel20;
        private javax.swing.JLabel jLabel21;
        private javax.swing.JLabel jLabel22;
        private javax.swing.JLabel jLabel23;
        private javax.swing.JLabel jLabel24;
        private javax.swing.JLabel jLabel25;
        private javax.swing.JLabel jLabel26;
        private javax.swing.JLabel jLabel27;
        private javax.swing.JLabel jLabel28;
        private javax.swing.JLabel jLabel29;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel30;
        private javax.swing.JLabel jLabel31;
        private javax.swing.JLabel jLabel32;
        private javax.swing.JLabel jLabel33;
        private javax.swing.JLabel jLabel34;
        private javax.swing.JLabel jLabel35;
        private javax.swing.JLabel jLabel36;
        private javax.swing.JLabel jLabel37;
        private javax.swing.JLabel jLabel38;
        private javax.swing.JLabel jLabel39;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel40;
        private javax.swing.JLabel jLabel41;
        private javax.swing.JLabel jLabel42;
        private javax.swing.JLabel jLabel43;
        private javax.swing.JLabel jLabel44;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel10;
        private javax.swing.JPanel jPanel11;
        private javax.swing.JPanel jPanel12;
        private javax.swing.JPanel jPanel14;
        private javax.swing.JPanel jPanel15;
        private javax.swing.JPanel jPanel16;
        private javax.swing.JPanel jPanel17;
        private javax.swing.JPanel jPanel18;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel8;
        private javax.swing.JPanel jPanel9;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JScrollPane jScrollPane5;
        private javax.swing.JSeparator jSeparator3;
        private javax.swing.JSeparator jSeparator4;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JTextField jTextField4;
        private javax.swing.JTextField jTextField5;
        private javax.swing.JTextField jTextField6;
        private javax.swing.JTextField jTextField7;
        private javax.swing.JTextField jTextField8;
        private javax.swing.JTextField lai;
        private javax.swing.JButton logoutButton;
        private javax.swing.JRadioButton maleGender;
        private javax.swing.JRadioButton maleGender1;
        private javax.swing.JTextField name1;
        private javax.swing.JTextField nameTextField;
        private javax.swing.JTextField nameTextField1;
        private javax.swing.JMenuItem orderDeleteOrderMenuItem;
        private javax.swing.JPopupMenu orderPopupMenu;
        private javax.swing.JTable orderTable;
        private javax.swing.JMenuItem orderUpdateQuantityMenuItem;
        private javax.swing.JPasswordField passwordTextField;
        private javax.swing.JPasswordField passwordTextField1;
        private javax.swing.JTextField phoneTextField;
        private javax.swing.JTextField phoneTextField1;
        private javax.swing.JMenuItem productDeleteMenuItem;
        private javax.swing.JPopupMenu productPopupMenu;
        private javax.swing.JButton productSearchButton;
        private javax.swing.JTextField productSearchTextField;
        private javax.swing.JTable productTable;
        private javax.swing.JMenuItem productUpdateMenuItem;
        private javax.swing.JPasswordField reEnterPasswordField;
        private javax.swing.JPasswordField reEnterPasswordField2;
        private javax.swing.JButton saveProducButton;
        private javax.swing.JTextField soVonHienTai;
        private javax.swing.JTextField so_luong1;
        private javax.swing.JButton submitButton;
        private javax.swing.JTextField tongThuNhap;
        private javax.swing.JTextField tongTienHangNhap;
        private javax.swing.JButton updateInvestmentjButton;
        private javax.swing.JMenuItem userDeleteMenuItem;
        private javax.swing.JTextField userNameTextField;
        private javax.swing.JTextField userNameTextField1;
        private javax.swing.JPopupMenu userPopupMenu;
        private javax.swing.JButton userSearchButton;
        private javax.swing.JTextField userSearchTextField;
        private javax.swing.JTable userTable;
        private javax.swing.JMenuItem userUpdateMenuItem;
        private javax.swing.JTextField vonHienTai;
        // End of variables declaration//GEN-END:variables

}
