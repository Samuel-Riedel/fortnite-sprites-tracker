import java.util.ArrayList;


public class SpriteTracker{

           ArrayList<Sprite> spriteList = new ArrayList<Sprite>();


           public void addSprite(Sprite sprite){
            spriteList.add(sprite);
           }

           ArrayList<Sprite> getSpriteList(){
            return this.spriteList;
           }

          
           public void displaySprites(){
            for(int i = 0; i < spriteList.size(); i ++){
              System.out.println(spriteList.get(i).toString());

            }
           }

           public void removeSprite(Sprite sprite){
            spriteList.remove(sprite);

           }

           public Sprite findSpriteById(int id){
            for (int i = 0; i < spriteList.size(); i++) {
              if(spriteList.get(i).id == id)
                return spriteList.get(i);
           }
          return null;
          }

          public Sprite findSpriteByName(String name){
            for(int i = 0; i< spriteList.size(); i++){
              if(spriteList.get(i).name.equalsIgnoreCase(name))
                return spriteList.get(i);
            }
            return null;
          }


}

