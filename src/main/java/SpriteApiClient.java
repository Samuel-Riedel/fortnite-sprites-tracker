import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

public class SpriteApiClient {
    HttpClient apiSprites = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://prod.fn-api.cc/v1/sprites")) // We call the url
            .GET()// we say to url send us data
            .build();// then we use build to get the dsata in our mold

    public ArrayList<Sprite> fetchSprites() {
        try {
            HttpResponse<String> response = apiSprites.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(response.body());
            // System.out.println(response.body());
            JsonNode spritesData = root.get("data");
            int counter = 1;

            for (int i = 0; i < spritesData.size(); i++) {
                JsonNode spriteData = spritesData.get(i);
                String spriteIdApi = spriteData.get("id").asText();
                String spriteName = spriteData.get("name").asText();
                String spriteSeason = spriteData.get("season").asText();
                String spriteIcon = spriteData.get("images").get("icon").asText();
                String spriteLargeIcon = spriteData.get("images").get("largeIcon").asText();
                Sprite sprite = new Sprite(counter, spriteIdApi, spriteName, spriteSeason, spriteIcon, spritLargeIcon,
                        false, false);
                counter++;

            }

        } catch (IOException e) {
            System.out.println("a communication problem, such as a connection failure." + e);

        } catch (InterruptedException e) {
            System.out.println("the thread waiting for the request was interrupted" + e);

        } catch (Exception e) {
            System.out.println(e);
        }

        finally {
            System.out.println("We are at fetchSprites Method, just testing if it works here");
        }
    }

}
