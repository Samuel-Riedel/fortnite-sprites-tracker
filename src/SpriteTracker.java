import java.util.ArrayList;
import java.util.List;


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

          public void markAsOwned(int id){
            for(int i = 0; i < spriteList.size(); i++){
                   if(spriteList.get(i).id==id)
                    spriteList.get(i).owned = true;
            }
          }

          public void markAsMastered(int id){
            for(int i = 0; i<spriteList.size(); i++){
              if(spriteList.get(i).id == id)
                spriteList.get(i).mastered = true;
            }
          }

          public ArrayList<Sprite> findMissingSprites(){
            ArrayList<Sprite> missingSpritesList = new ArrayList<Sprite>();
            for(int i = 0; i<spriteList.size(); i++){
              if(spriteList.get(i).owned == false)
               missingSpritesList.add(spriteList.get(i));
          }
            return missingSpritesList;

        }

        public int countOwnedSprites(){
          int ownedSpriteCounter = 0;
          for(int i = 0; i<spriteList.size(); i++){
            if(spriteList.get(i).owned == true)
              ownedSpriteCounter +=1;
        }
        return ownedSpriteCounter;
      }

      public int countMasteredSprites(){
        int masteredSpriteCounter = 0;
        for(int i = 0; i<spriteList.size(); i++){
          if(spriteList.get(i).mastered == true)
            masteredSpriteCounter +=1;
        }
        return masteredSpriteCounter;
      }
      }

