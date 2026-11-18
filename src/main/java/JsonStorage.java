import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JsonStorage {
    ObjectMapper objectMapper = new ObjectMapper();

    public JsonStorage() {
        objectMapper.registerModule(new JavaTimeModule());

    }

    public void saveSprites(ArrayList<SavedSprite> savedSprites) {
        try {
            File file = new File("spritesCollection.json");
            objectMapper.writeValue(file, savedSprites);

        } catch (IOException e) {
            System.out.println("Something went wrong." + e);

        }

    }

}
