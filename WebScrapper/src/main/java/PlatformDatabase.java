import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import java.io.FileInputStream;
import java.io.IOException;

abstract class PlatformDatabase {
    public PlatformDatabase() throws IOException {
        FileInputStream serviceAccount =
                new FileInputStream("C:\\Users\\glend\\Desktop\\ooop-6969-firebase-adminsdk-arx6j-fbc9ed80d0.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://ooop-6969.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);
    }

    public abstract void pushDatabase(String name, String price, String source)throws Exception;
}
