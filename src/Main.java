public class Main {
    public static void main(String[] args){
        SpriteTracker tracker = new SpriteTracker();
        SpriteApiClient ApiTracker = new SpriteApiClient();
    
        Sprite sprite = new Sprite(24,"Jonesy",false,false); // this creates the sprite jonesy
        Sprite sprite1 = new Sprite(26,"Adventure",false,false); // this creates the sprite Adeventure
        Sprite sprite2 = new Sprite(27,"Tails",true,false); // this creates the sprite Tails
        Sprite sprite3 = new Sprite(28,"Sonic",true,true); // this creates the sprite Sonic


        tracker.addSprite(sprite);// and this calls the addSprite we created and adds it to the arraylist of sprites
        tracker.addSprite(sprite1);// and this calls the addSprite we created and adds it to the arraylist of sprites
        tracker.addSprite(sprite2);// and this calls the addSprite we created and adds it to the arraylist of sprites
        tracker.addSprite(sprite3);// and this calls the addSprite we created and adds it to the arraylist of sprites

        ApiTracker.fetchSprites();


     
        System.out.println(tracker.findMissingSprites());
        System.out.println(tracker.countOwnedSprites());
        System.out.println(tracker.countMasteredSprites());
        System.out.println(tracker.countMissingSprites());



    }
}