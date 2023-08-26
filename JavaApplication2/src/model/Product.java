/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Product {

        private String productCode, productName;
        private double priceRetail, importPrice; //importPrice < priceRetail
        private int quantityInStock;

        public Product() {
        }

        public Product(
                String productName,
                double priceRetail,
                double importPrice,
                int quantityInStock) {
                this.productName = productName;
                this.priceRetail = priceRetail;
                this.importPrice = importPrice;
                this.quantityInStock = quantityInStock;
        }

        public String getProductCode() {
                return productCode;
        }

        public void setProductCode(String productCode) {
                this.productCode = productCode;
        }

        public String getProductName() {
                return productName;
        }

        public void setProductName(String productName) {
                this.productName = productName;
        }

        public double getPriceRetail() {
                return priceRetail;
        }

        public void setPriceRetail(double priceRetail) {
                this.priceRetail = priceRetail;
        }

        public double getImportPrice() {
                return importPrice;
        }

        public void setImportPrice(double importPrice) {
                this.importPrice = importPrice;
        }

        public int getQuantityInStock() {
                return quantityInStock;
        }

        public void setQuantityInStock(int quantityInStock) {
                this.quantityInStock = quantityInStock;
        }
}
