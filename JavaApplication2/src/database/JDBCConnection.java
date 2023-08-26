/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author nguye
 */
public class JDBCConnection {

        public MongoDatabase getJDBCConnection() {
//                MongoClient mongo = new MongoClient("localhost", 27017);
//                MongoDatabase db = mongo.getDatabase("Test2");

                String url = "mongodb+srv://vietnq1878:YcrUUmQAI2DOcbAG@shared-cluster.dyn6cle.mongodb.net/";
                MongoClientURI clientURI = new MongoClientURI(url);
                MongoClient mongoClient = new MongoClient(clientURI);
                MongoDatabase db = mongoClient.getDatabase("Project2");
                System.out.println("Conneted to the databse succesfully");
                return db;
        }
}
