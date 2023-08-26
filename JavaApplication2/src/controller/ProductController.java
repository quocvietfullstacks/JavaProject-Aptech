/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ProductDao;
import dao.UserDAO;
import java.util.ArrayList;
import java.util.List;
import model.Product;

/**
 *
 * @author nguye
 */
public class ProductController implements ControllerInterface<Product, ProductDao, ProductController>{
        Product product;
        ProductDao productDao; 
        ProductController productController;
        
        public ProductController () {
                productDao = new ProductDao();
        }
        @Override
        public void insert(Product product) {
                productDao.insert(product);
        }

        @Override
        public List<Product> getAllElement() {
                return productDao.getAllElement();
        }

        @Override
        public Product getElementById(String id) {
                return productDao.getElementById(id);
        }

        @Override
        public void update(Product product) {
                productDao.update(product);
        }

        @Override
        public void delete(String id) {
                productDao.delete(id);
        }

        @Override
        public List<Product> getElementByCondition(String condition) {
                return productDao.getElementByCondition(condition);
        }

        @Override
        public Product getElementByName(String name) {
                return productDao.getElementByName(name);
        }
        
}
