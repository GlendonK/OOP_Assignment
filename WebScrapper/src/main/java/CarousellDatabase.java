import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class CarousellDatabase extends PlatformDatabase {

    public CarousellDatabase() throws IOException {
        super();
    }

    @Override
    public void pushDatabase(String name, String price, String source)throws Exception {
        DatabaseReference databaseReference;
        FirebaseDatabase firebaseDatabase;
        DatabaseReference data = FirebaseDatabase.getInstance().getReference().child("Socks2").push(); // make unique instance of sock
        String uid = data.getKey(); // generate unique key
        data.child("header").setValueAsync(name).get(); // push into D
        data.child("price").setValueAsync(price).get();
        data.child("source").setValueAsync(source).get();

    }
}
