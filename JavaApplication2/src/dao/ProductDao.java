/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.List;
import model.Product;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;

/**
 *
 * @author nguye
 */
public class ProductDao implements DAOInterface<Product> {

        MongoCollection<Document> collection = db.getCollection("Product");

        @Override
        public void insert(Product product) {
                System.out.println("got Collection! ");

                Document document = new Document("name", product.getProductName());
                document.append("gia_ban", product.getPriceRetail());
                document.append("gia_nhap", product.getImportPrice());
                document.append("so_luong", product.getQuantityInStock());

                collection.insertOne(document);
                System.out.println("Inserted! ");
        }

        @Override
        public List<Product> getAllElement() {
                List<Product> products = new ArrayList<>();
                MongoCursor<Document> cursor = collection.find().cursor();
                while (cursor.hasNext()) {
                        Product product = new Product();
                        Document doc = cursor.next();
                        product.setProductName(doc.getString("name"));
                        product.setPriceRetail(doc.getDouble("gia_ban"));
                        product.setImportPrice(doc.getDouble("gia_nhap"));
                        product.setQuantityInStock(doc.getInteger("so_luong"));
                        product.setProductCode(doc.get("_id").toString());

                        products.add(product);
                }
                return products;
        }

        @Override
        public Product getElementById(String id) {
                Product product = new Product();

                Bson query = Filters.eq("_id", new ObjectId(id));
                Document doc = collection.find(query).first();
                if (doc.isEmpty()) {
                        return null;
                }

                product.setProductName(doc.getString("name"));
                product.setPriceRetail(doc.getDouble("gia_ban"));
                product.setImportPrice(doc.getDouble("gia_nhap"));
                product.setQuantityInStock(doc.getInteger("so_luong"));
                product.setProductCode(doc.get("_id").toString());
                return product;
        }

        public Product getElementByName(String productName) {
                Product product = new Product();

                Bson query = Filters.eq("name", productName);
                Document doc = collection.find(query).first();
                if (doc == null) {
                        return null;
                }

                product.setProductName(doc.getString("name"));
                product.setPriceRetail(doc.getDouble("gia_ban"));
                product.setImportPrice(doc.getDouble("gia_nhap"));
                product.setQuantityInStock(doc.getInteger("so_luong"));
                product.setProductCode(doc.get("_id").toString());
                return product;
        }

        @Override
        public void update(Product product) {
                Bson query = Filters.eq("_id", new ObjectId(product.getProductCode()));
                Bson updates = Updates.combine(
                        Updates.set("name", product.getProductName()),
                        Updates.set("gia_ban", product.getPriceRetail()),
                        Updates.set("gia_nhap", product.getImportPrice()),
                        Updates.set("so_luong", product.getQuantityInStock())
                );
                if (product.getQuantityInStock() > 0) {
                        UpdateResult updateResult = collection.updateOne(query, updates);
                } else {
                        delete(product.getProductCode());
                }

        }

        @Override
        public void delete(String id) {
                Bson query = Filters.eq("_id", new ObjectId(id));
                collection.deleteOne(query);
                System.out.println("deleted document! ");
        }

        @Override
        public List<Product> getElementByCondition(String condition) {

                List<Product> allProducts = getAllElement();
                return allProducts.stream()
                        .filter(p -> p.getProductName().trim().toLowerCase().contains(condition.trim().toLowerCase()))
                        .toList();
        }
}
