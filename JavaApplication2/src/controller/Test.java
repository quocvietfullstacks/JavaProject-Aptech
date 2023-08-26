/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.FindIterable;
import static dao.DAOInterface.db;
import database.JDBCConnection;
import java.util.Iterator;
import model.Order;
import model.Product;
import model.User;

/**
 *
 * @author nguye
 */
public class Test {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
//                insertUser();
                for (int i = 0 ; i<10;i++){
                        insertProduct();
                        insertOrder();
                }
                
        }

        public static void insertUser() {
                MongoCollection<Document> collection = db.getCollection("User");
                System.out.println("got Collection! ");

                User user = new User("Dlow", "12", "male", "0557889665", "Hồ Chí Minh", "dlow1234", "hellohelloooo", 2);

                Document document = new Document("name", user.getName());
                document.append("age", user.getAge());
                document.append("gender", user.getGender());
                document.append("phone", user.getPhone());
                document.append("address", user.getAddress());
                document.append("userName", user.getUserName());
                document.append("password", user.getPassword());
                document.append("rollNum", 2);
                collection.insertOne(document);
                System.out.println("Inserted! ");

        }

        public static void insertProduct() {
                MongoCollection<Document> collection = db.getCollection("Product");
                System.out.println("got Collection! ");

                Product product = new Product("san pham 10", 120.000, 300.000, 10);

                Document document = new Document("name", product.getProductName());
                document.append("gia_ban", product.getPriceRetail());
                document.append("gia_nhap", product.getImportPrice());
                document.append("so_luong", product.getQuantityInStock());

                collection.insertOne(document);
                System.out.println("Inserted! ");
        }

        public static void insertOrder() {
                MongoCollection<Document> collection = db.getCollection("Order");
                System.out.println("got Collection! ");

                Order order = new Order("12345", "san pham 9", "người dùng a ", "Hai Phong", "01235788866", 12000,
                        2 , 24000);
                Document document = new Document("Product_ID",  order.getProductID());
                document.append("Product_Name", order.getProductName());
                document.append("User_Name", order.getUserName());
                document.append("Address", order.getUserAddress());
                document.append("Phone_Number", order.getUserPhoneNumber());
                document.append("Sale_Price", order.getSalePrice());
                document.append("Quantity", order.getQuantity());
                document.append("Total", order.getTotal());
                collection.insertOne(document);
                System.out.println("inserted!");
                
                
        }

}
