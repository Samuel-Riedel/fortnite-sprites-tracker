import java.time.LocalDate;

public class SavedSprite {
    String apiId;
    boolean owned;
    boolean mastered;
    LocalDate dateObtained;

    public SavedSprite(String apiId, boolean owned, boolean mastered, LocalDate dateObtained) {
        this.apiId = apiId;
        this.owned = owned;
        this.mastered = mastered;
        this.dateObtained = dateObtained;
    }
}
