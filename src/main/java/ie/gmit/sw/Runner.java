package ie.gmit.sw;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Runner {
    public static void main(String[] args) {

        MongoClient mongoClient = new MongoClient();
        MongoDatabase database = mongoClient.getDatabase("testDB");
        MongoCollection<Document> testCal = database.getCollection("testCol");

        FindIterable<Document> findDocs = testCal.find();
        System.out.println("find all docs in this collection");

        for (Document d : findDocs) {
            System.out.println(d.toJson());
        }//end for

        System.out.println();

        //Add Document to Database/Collection
        try {
            Document myNewDoc = new Document();//Create a new Mongo Document

            System.out.println("Add Documents to Database/Collection");
            myNewDoc.append("_id", 1).append("name", "Peter").append("age", 37);


            testCal.insertOne(myNewDoc);

            for (Document d : findDocs) {//iterate over results of find()
                System.out.println(d.toJson());
            }

        } catch (Exception e) {
            System.out.println("User " + (testCal.count() -1) + " already added");
        }

        System.out.println();

        mongoClient.close();

    }//end main

}//end


