 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.ProductController;

/**
 *
 * @author nguye
 */
public class Order {
        private ProductController productController ;
        private String orderID, productID, productName, userName, userAddress, userPhoneNumber;
        private double salePrice;
        private int quantity;
        private double total;

        public Order() {
        }

        // để vừa tạo Order vừa cập nhật số lượng. 
        public Order (User user, Product product, int quantity) { 
                this.productController = new ProductController();
                this.productID = product.getProductCode();
                this.productName = product.getProductName();
                this.userName = user.getUserName();
                this.salePrice = product.getPriceRetail();
                this.quantity = quantity;
                this.total = salePrice * quantity;
                
                this.userAddress = user.getAddress();
                this.userPhoneNumber = user.getPhone();
                product.setQuantityInStock(product.getQuantityInStock() - quantity);
                productController.update(product);
        }

        public Order(String productID, String productName, String userName, String userAddress, String userPhoneNumber, double salePrice, int quantity, double total) {
                this.productID = productID;
                this.productName = productName;
                this.userName = userName;
                this.userAddress = userAddress;
                this.userPhoneNumber = userPhoneNumber;
                this.salePrice = salePrice;
                this.quantity = quantity;
                this.total = total;
        }

        
        
        public String getUserAddress() {
                return userAddress;
        }

        public void setUserAddress(String userAddress) {
                this.userAddress = userAddress;
        }

        public String getUserPhoneNumber() {
                return userPhoneNumber;
        }

        public void setUserPhoneNumber(String userPhoneNumber) {
                this.userPhoneNumber = userPhoneNumber;
        }
        
        
        

        @Override
        public String toString() {
                return "Order{" + "orderID=" + orderID + ", productID=" + productID + ", productName=" + productName + ", userName=" + userName + ", salePrice=" + salePrice + ", quantity=" + quantity + ", total=" + total + '}';
        }

        public String getOrderID() {
                return orderID;
        }

        public void setOrderID(String orderID) {
                this.orderID = orderID;
        }

        public String getProductID() {
                return productID;
        }

        public void setProductID(String productID) {
                this.productID = productID;
        }

        public String getProductName() {
                return productName;
        }

        public void setProductName(String productName) {
                this.productName = productName;
        }

        public String getUserName() {
                return userName;
        }

        public void setUserName(String userName) {
                this.userName = userName;
        }

        public double getSalePrice() {
                return salePrice;
        }

        public void setSalePrice(double salePrice) {
                this.salePrice = salePrice;
        }

        public double getTotal() {
                return total;
        }

        public void setTotal(double total) {
                this.total = total;
        }

        public int getQuantity() {
                return quantity;
        }

        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }
        
        
        
}
