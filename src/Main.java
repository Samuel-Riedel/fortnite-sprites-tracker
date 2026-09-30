import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
               Sprite sprite = new Sprite(24,"Jonesy",true,false);
               Sprite sprite1 = new Sprite(25,"Bush",true,false);
               Sprite sprite2 = new Sprite(26,"Adventure",true,false);
               Sprite sprite3 = new Sprite(27,"Tails",true,false);
               Sprite sprite4 = new Sprite(29,"Sonic",false,false);



       ArrayList<Sprite> spriteList = new ArrayList<Sprite>();

       spriteList.add(sprite);
       spriteList.add(sprite1);
       spriteList.add(sprite2);
       spriteList.add(sprite3);
       spriteList.add(sprite4);

       for(int i = 0; i <spriteList.size();i++){
               System.out.println("Sprite ID: " + spriteList.get(i).id + " Sprite Name: " + spriteList.get(i).name + " is missing?: " + spriteList.get(i).isMissing());

        
       }


    }
}



