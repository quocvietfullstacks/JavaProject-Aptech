/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import static dao.DAOInterface.db;
import java.util.ArrayList;
import java.util.List;
import model.Order;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author nguye
 */
public class OrderDAO implements DAOInterface<Order>{
        MongoCollection<Document> collection = db.getCollection("Order");
        

        @Override
        public void insert(Order order) {
                System.out.println("got Collection! ");
                
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

        @Override
        public List<Order> getAllElement() {
                List<Order> orders = new ArrayList<>();
                MongoCursor<Document> cursor = collection.find().cursor();
                while (cursor.hasNext()) {
                        Order order = new Order();
                        Document doc = cursor.next();
                        order.setProductID(doc.getString("Product_ID"));
                        order.setProductName(doc.getString("Product_Name"));
                        order.setUserName(doc.getString("User_Name"));
                        order.setSalePrice(doc.getDouble("Sale_Price"));
                        order.setQuantity(doc.getInteger("Quantity"));
                        order.setTotal(doc.getDouble("Total"));
                        order.setUserPhoneNumber(doc.getString("Phone_Number"));
                        order.setUserAddress(doc.getString("Address"));
                        order.setOrderID(doc.get("_id").toString());
                        
                        orders.add(order);
                }
                return orders;
        }

        @Override
        public Order getElementById(String id) {
                Order order = new Order();
                
                Bson query = Filters.eq("_id", new ObjectId(id));
                Document doc = collection.find(query).first();
                if (doc.isEmpty()) {
                        return null; 
                }
                order.setProductID(doc.getString("Product_ID"));
                        order.setProductName(doc.getString("Product_Name"));
                        order.setUserName(doc.getString("User_Name"));
                        order.setSalePrice(doc.getDouble("Sale_Price"));
                        order.setQuantity(doc.getInteger("Quantity"));
                        order.setTotal(doc.getDouble("Total"));
                        order.setUserPhoneNumber(doc.getString("Phone_Number"));
                        order.setUserAddress(doc.getString("Address"));
                        order.setOrderID(doc.get("_id").toString());
                return order;
        }

        
        @Override
        public void update(Order order) {
                Bson query = Filters.eq("_id", new ObjectId(order.getOrderID()));
                Bson updates = Updates.combine(
                        Updates.set("Product_ID", order.getProductID()),
                        Updates.set("Product_Name", order.getProductName()),
                        Updates.set("User_Name", order.getUserName()),
                        Updates.set("Sale_Price", order.getSalePrice()),
                        Updates.set("Quantity", order.getQuantity()),
                        Updates.set("Address", order.getUserAddress()),
                        Updates.set("Phone_Number", order.getUserPhoneNumber()),
                        Updates.set("Total", order.getTotal())
                        
                );
                UpdateResult updateResult = collection.updateOne(query, updates);
        }

        @Override
        public void delete(String id) {
                Bson query = Filters.eq("_id", new ObjectId(id));
                collection.deleteOne(query);
                System.out.println("deleted document! ");
        }

        @Override
        public ArrayList<Order> getElementByCondition(String condition) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
}
