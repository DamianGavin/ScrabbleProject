package ie.gmit.sw;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class TestLocalMongo {
    public static void main(String[] args) {

        MongoClient mongoClient = new MongoClient();
        MongoDatabase database = mongoClient.getDatabase("testDB");
        MongoCollection<Document> ourCall = database.getCollection("testCol");

        FindIterable<Document> findDocs = ourCall.find();
        System.out.println("find all docs in this collection");


        for (Document d : findDocs) {
            System.out.println("here:"+d.toJson());
        }//end for

        mongoClient.close();
    }//end main

}//end


