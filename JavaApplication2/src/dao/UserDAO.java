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
import java.util.ArrayList;
import java.util.List;
import model.User;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author nguye
 */
public class UserDAO implements DAOInterface<User> {
        MongoCollection<Document> collection = db.getCollection("User");
        
        @Override
        public User getElementById (String id) {
                User user = new User(); 
                
                Bson query = Filters.eq("_id", new ObjectId(id));
                Document doc = collection. find(query).first();
                        user.setName(doc.getString("name"));
                        user.setAge(doc.getString("age"));
                        user.setGender(doc.getString("gender"));
                        user.setPhone(doc.getString("phone"));
                        user.setAddress(doc.getString("address"));
                        user.setUserName(doc.getString("userName"));
                        user.setPassword(doc.getString("password"));
                        user.setRollNum(doc.getInteger("rollNum")); 
                        user.setId(doc.get("_id").toString());
                return user;
        }
        
        public User getElementByUserName(String userName) {
                User user = new User(); 
                
                Bson query = Filters.eq("userName", userName);
                Document doc = collection. find(query).first();
                if (doc==null) {
                        return null;
                }
                        user.setName(doc.getString("name"));
                        user.setAge(doc.getString("age"));
                        user.setGender(doc.getString("gender"));
                        user.setPhone(doc.getString("phone"));
                        user.setAddress(doc.getString("address"));
                        user.setUserName(doc.getString("userName"));
                        user.setPassword(doc.getString("password"));
                        user.setRollNum(doc.getInteger("rollNum")); 
                        user.setId(doc.get("_id").toString());
                return user;
        }
        @Override
        public List<User> getAllElement() {
                List<User> users = new ArrayList<>();
//                MongoCursor<Document> cursor = (MongoCursor<Document>) collection.find();
                MongoCursor<Document> cursor = collection.find().cursor();
                while(cursor.hasNext()){
                        User user = new User();
                        Document doc = cursor.next();
                        user.setName(doc.getString("name"));
                        user.setAge(doc.getString("age"));
                        user.setGender(doc.getString("gender"));
                        user.setPhone(doc.getString("phone"));
                        user.setAddress(doc.getString("address"));
                        user.setUserName(doc.getString("userName"));
                        user.setPassword(doc.getString("password"));
                        user.setRollNum(doc.getInteger("rollNum")); 
                        user.setId(doc.get("_id").toString());
                        
//                        String id =  doc.get("_id").toString();
                        users.add(user);
                }
                return users;
        }
        @Override
        public  void insert(User  user) {
                System.out.println("got Collection! ");

//                Document document = new Document("name", "Viet");
//                        document.append("age", "30");
//                        document.append("gender", "male");
//                        document.append("phone", "098756233");
//                        document.append("address", "Under the hood");
//                        document.append("userName", "MinhLaiMaiLinh");
//                        document.append("password", "Vietdeptrai");
//                        document.append("rollNum", 1);
//                collection.insertOne(document);
                
                
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

        @Override
        public void  update(User user) {
                Bson query = Filters.eq("_id",  new ObjectId(user.getId()));
                Bson updates  = Updates.combine(
                        Updates.set("name", user.getName()), 
                        Updates.set("age", user.getAge()),
                        Updates.set("gender", user.getGender()), 
                        Updates.set("phone", user.getPhone()), 
                        Updates.set("address", user.getAddress()), 
                        Updates.set("userName", user.getUserName()), 
                        Updates.set("password", user.getPassword())                       
                );
                UpdateResult updateResult = collection.updateOne(query, updates);
        }

        @Override
        public void delete(String id) {
                Bson query = Filters.eq("_id",  new ObjectId(id));
                collection.deleteOne(query);
                System.out.println("deleted document! ");
                
        }

        
        @Override
        public List<User> getElementByCondition(String condition) {
                List <User> users = getAllElement();
               return users.stream().filter(it -> it.getUserName().trim().toLowerCase().contains(condition.trim().toLowerCase()))
                       .toList();
        }
        
        public List<User> getElementByConditionPhone(String condition) {
                List <User> users = getAllElement();
               return users.stream().filter(it -> it.getPhone().equals(condition))
                       .toList();
        }
}
