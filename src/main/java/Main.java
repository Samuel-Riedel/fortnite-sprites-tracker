
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        SpriteTracker tracker = new SpriteTracker();
        SpriteApiClient apiTracker = new SpriteApiClient();

        // Fetch sprites from the API
        ArrayList<Sprite> returnedSprite = apiTracker.fetchSprites();

        // Add sprites to the tracker
        for (int i = 0; i < returnedSprite.size(); i++) {
            tracker.addSprite(returnedSprite.get(i));
        }

        // Test collection management
        tracker.markAsOwned(1);
        tracker.markAsMastered(1);
        tracker.markAsOwned(3);
        tracker.markAsOwned(5);

        // Display collection statistics
        System.out.println("Owned sprites: " + tracker.countOwnedSprites());
        System.out.println("Mastered sprites: " + tracker.countMasteredSprites());
        System.out.println("Missing sprites: " + tracker.countMissingSprites());

        // Display mastered sprites
        tracker.showMasteredSprites();

        // SavedSprites methods & variables
        ArrayList<SavedSprite> savedSprite = new ArrayList<SavedSprite>();
        SavedSprite mySprite = new SavedSprite("sprite-1234", false, false, null);
        savedSprite.add(mySprite);

        JsonStorage jsonStorage = new JsonStorage();
        jsonStorage.saveSprites(savedSprite);
    }
}

// Remember our architecture:
// - Sprite contains information retrieved from the Fortnite API.
// - SavedSprite contains the player's personal collection information.
// - JsonStorage saves that personal collection to a JSON file.