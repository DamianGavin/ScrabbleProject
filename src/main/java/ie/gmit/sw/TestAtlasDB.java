package ie.gmit.sw;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class TestAtlasDB {
    public static void main(String[] args) {
        //final String connectionString = "mongodb+srv://majo:Scr%40sbble1@scrabble-akmwk.mongodb.net/";
        final String username = "majo";
        final String password = "Scr%40sbble1";
        final String connectionString = "mongodb://" + username + ":" + password + "@scrabble-akmwk.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);


        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase db = mongoClient.getDatabase("TestDB");
        MongoCollection collection = db.getCollection("TestC");
        FindIterable f = collection.find();
        System.out.println(f);

        //db.getCollectionNames();


    }

}
