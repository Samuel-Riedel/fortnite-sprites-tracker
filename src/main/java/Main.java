import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SpriteTracker tracker = new SpriteTracker();
        SpriteApiClient ApiTracker = new SpriteApiClient();
        ArrayList<Sprite> returnedSprite = ApiTracker.fetchSprites();
        SavedSprite savedSprite = new SavedSprite("sprite-12344", true, false, LocalDate.now());
        System.out.println(savedSprite.apiId);
        System.out.println(savedSprite.owned);
        System.out.println(savedSprite.mastered);
        System.out.println(savedSprite.dateObtained);

        for (int i = 0; i < returnedSprite.size(); i++) {
            tracker.addSprite(returnedSprite.get(i));
        }
        tracker.markAsOwned(1);
        tracker.markAsMastered(1);

        tracker.markAsOwned(1);
        tracker.markAsOwned(3);
        tracker.markAsOwned(5);

        // ApiTracker.fetchSprites();
        System.out.println(returnedSprite.get(1));

        // System.out.println(tracker.findMissingSprites());
        System.out.println(tracker.countOwnedSprites());
        System.out.println(tracker.countMasteredSprites());
        System.out.println(tracker.countMissingSprites());
        // tracker.showOwnedSprites();
        tracker.showMasteredSprites();

    }
}