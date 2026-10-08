public class Main {
    public static void main(String[] args){
        SpriteTracker tracker = new SpriteTracker();
        Sprite sprite = new Sprite(24,"Jonesy",false,false); // this creates the sprite jonesy
        Sprite sprite1 = new Sprite(26,"Adventure",false,false); // this creates the sprite Adeventure
        Sprite sprite2 = new Sprite(27,"Tails",true,false); // this creates the sprite Tails
        Sprite sprite3 = new Sprite(28,"Sonic",true,false); // this creates the sprite Sonic


        tracker.addSprite(sprite);// and this calls the addSprite we created and adds it to the arraylist of sprites
        tracker.addSprite(sprite1);// and this calls the addSprite we created and adds it to the arraylist of sprites
        tracker.addSprite(sprite2);// and this calls the addSprite we created and adds it to the arraylist of sprites
        tracker.addSprite(sprite3);// and this calls the addSprite we created and adds it to the arraylist of sprites


        //System.out.println(tracker.getSpriteList());
        //tracker.removeSprite(sprite); // This method removes a Sprite from the list Array called spriteList

        System.out.println(tracker.findMissingSprites());
        System.out.println(tracker.countSprites());

/* 
        //tracker.displaySprites();
        System.out.println("Here values are false ");
        System.out.println(tracker.findSpriteByName("Adventure").toString());
        System.out.println(tracker.findSpriteById(26).owned);
        System.out.println(tracker.findSpriteById(26).mastered);
        //System.out.println(tracker.findSpriteById(26).toString());


        System.out.println("Here we change the value using the  maskAsOwned and maskasMastered methods ");
        //tracker.markAsOwned(24);
        tracker.markAsMastered(26);



        System.out.println(tracker.findSpriteById(26).owned);
        System.out.println(tracker.findSpriteById(26).mastered);



*/

        //System.out.println(tracker.findSpriteByName("Jonesy").toString());
        //System.out.println(tracker.findSpriteById(26).toString());

    }
}