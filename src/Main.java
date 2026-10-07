public class Main {
    public static void main(String[] args){
        SpriteTracker tracker = new SpriteTracker();
        Sprite sprite = new Sprite(24,"Jonesy",true,false); // this creates the sprite jonesy
        Sprite sprite1 = new Sprite(26,"Adventure",true,false); // this creates the sprite jonesy

        tracker.addSprite(sprite);// and this calls the addSprite we created and adds it to the arraylist of sprites
        tracker.addSprite(sprite1);// and this calls the addSprite we created and adds it to the arraylist of sprites

        //System.out.println(tracker.getSpriteList());
        tracker.removeSprite(sprite); // This method removes a Sprite from the list Array called spriteList


        tracker.displaySprites();

    }
}