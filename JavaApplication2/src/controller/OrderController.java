/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.OrderDAO;
import java.util.ArrayList;
import java.util.List;
import model.Order;

/**
 *
 * @author nguye
 */
public class OrderController implements ControllerInterface<Order, OrderDAO, OrderController>{
        Order order;
        OrderDAO orderDAO;
        OrderController orderController;

        public OrderController() {
                orderDAO = new OrderDAO();
        }
        @Override
        public void insert(Order order) {
                orderDAO.insert(order);
        }

        @Override
        public List<Order> getAllElement() {
                return orderDAO.getAllElement();
        }

        @Override
        public Order getElementById(String id) {
                return orderDAO.getElementById(id);
        }

        @Override
        public Order getElementByName(String name) { // phần này không có hoặc không hợp lệ. 
                return orderDAO.getElementById(name);
        }

        @Override
        public void update(Order order) {
                orderDAO.update(order);
        }

        @Override
        public void delete(String id) {
                orderDAO.delete(id);
        }

        @Override
        public ArrayList<Order> getElementByCondition(String condition) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody;
        }
        
}
