import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ReadFile {
    public ArrayList<Product> getData() {
        ArrayList<Product> list = new ArrayList<Product>();
        try {
            // Tao FileReader tu file json (chu y json phai de ngoai thu muc src)
            FileReader reader = new FileReader("MOCK_DATA.json");
            // Lay kieu type du lieu
            Type objectType = new TypeToken<List<Product>>(){}.getType();
            // Format new.Gson().fromJson(FileReader, Type)
            list = new Gson().fromJson(reader, objectType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }
}