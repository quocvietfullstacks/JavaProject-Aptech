/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author nguye
 */
public class Finance {

        private double investment, importedCapital, totalRevenue, 
                totalProfit, remainingCapital;

        public Finance() {
        }

        public Finance(double investment, List<Product> products, List<Order> orders) {
                this.investment = investment;
                for (Product p : products) {
                        this.importedCapital += p.getImportPrice() * p.getQuantityInStock();
                }
                for (Order o : orders) {
                        this.totalRevenue += o.getTotal();
                }
                this.totalProfit = this.totalRevenue - this.importedCapital;
                this.remainingCapital = this.investment-this.importedCapital;
        }

        public double getInvestment() {
                return investment;
        }

        public void setInvestment(double investment) {
                this.investment = investment;
                this.remainingCapital = this.investment-this.importedCapital;
        }

        public double getImportedCapital() {
                return importedCapital;
        }

        public void setImportedCapital(List<Product> products) {
                for (Product p : products) {
                        this.importedCapital += p.getImportPrice() * p.getQuantityInStock();
                }
                this.totalProfit = this.totalRevenue - this.importedCapital;
                this.remainingCapital = this.investment-this.importedCapital;
        }

        public double getTotalRevenue() {
                return totalRevenue;
        }

        public void setTotalRevenue(List<Order> orders) {
                for (Order o : orders) {
                        this.totalRevenue += o.getTotal();
                }
                this.totalProfit = this.totalRevenue - this.importedCapital;
                this.remainingCapital = this.investment-this.importedCapital;
        }

        public double getTotalProfit() {
                return totalProfit;
        }

        public void setTotalProfit(double totalProfit) {
                this.totalProfit = totalProfit;
        }

        public double getRemainingCapital() {
                return remainingCapital;
        }
        

}
