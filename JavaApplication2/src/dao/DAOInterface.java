/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import database.JDBCConnection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author nguye
 * @param <T>
 */
public interface  DAOInterface<T> {
        JDBCConnection connectDB = new JDBCConnection();
        MongoDatabase db = connectDB.getJDBCConnection();
    public  void insert (T t);
    public List<T> getAllElement();
    public T getElementById (String id);
    public void  update (T t);
    public void delete (String id);
    public List<T> getElementByCondition (String condition);
}
