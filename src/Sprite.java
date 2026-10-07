import java.time.LocalDate;

public class Sprite{

    int id;
    String name;
    boolean owned;
    boolean mastered;
    //LocalDate dateObtained;



    public Sprite(int id,String name,boolean owned,boolean mastered){
    this.id = id;
    this.name = name;
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


