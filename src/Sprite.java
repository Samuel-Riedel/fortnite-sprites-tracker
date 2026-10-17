import java.time.LocalDate;

public class Sprite{

    int id;
    String apiId;
    String name;
    String season;
    String iconUrl;
    String largeIconUrl;
    boolean owned;
    boolean mastered;
    //LocalDate dateObtained;



    public Sprite(int id,String apiId, String season, String iconUrl, String largeIconUrl, String name,boolean owned,boolean mastered){
    this.id = id;
    this.apiId = apiId;
    this.name = name;
    this.season = season;
    this.iconUrl = iconUrl;
    this.largeIconUrl = largeIconUrl;
    this.owned = owned;
    this.mastered = mastered;
    //this.dateObtained = dateObtained;
    }

    public boolean isMissing(){
            return owned == false ? true:false;

        }

    public String toString(){
            return "Sprite ID: " + this.id + " Sprite Name: " + this.name;
          
           }


}


