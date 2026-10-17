import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SpriteApiClient {
    HttpClient apiSprites = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create("https://prod.fn-api.cc/v1/sprites")) // We call the url
    .GET()// we say to url send us data 
    .build();// then we use build to get the dsata in our mold
    

    public void fetchSprites(){
        try{
            HttpResponse<String> response = apiSprites.send(request,HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());


        }
        catch(IOException e){
            System.out.println("a communication problem, such as a connection failure." + e);

        }
        catch(InterruptedException e){
            System.out.println("the thread waiting for the request was interrupted" + e);

        }
        catch(Exception e){
            System.out.println(e);
        }
        

        finally{
            System.out.println("We are at fetchSprites Method, just testing if it works here");
        }
    }

}

