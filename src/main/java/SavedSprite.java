import java.time.LocalDate;

public class SavedSprite {
    private String apiId;
    private boolean owned;
    private boolean mastered;
    private LocalDate dateObtained;

    public SavedSprite(String apiId, boolean owned, boolean mastered, LocalDate dateObtained) {
        this.apiId = apiId;
        this.owned = owned;
        this.mastered = mastered;
        this.dateObtained = dateObtained;
    }

    public SavedSprite() {

    }

    public String getApiId() {
        return this.apiId;
    }

    public boolean getOwned() {
        return this.owned;
    }

    public boolean getMastered() {
        return this.mastered;
    }

    public LocalDate getDateObtained() {
        return this.dateObtained;
    }

}
