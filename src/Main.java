public class Main {
    public static void main(String[] args){
        SpriteTracker tracker = new SpriteTracker();
        SpriteApiClient ApiTracker = new SpriteApiClient();

        Sprite sprite = new Sprite(24, "JonesySprite", "CH7S3", "https://example.com/jonesy.png", "https://example.com/jonesy-large.png", "Jonesy", false, false);
        Sprite sprite1 = new Sprite(26, "AdventureSprite", "CH7S3", "https://example.com/adventure.png", "https://example.com/adventure-large.png", "Adventure", false, false);
        Sprite sprite2 = new Sprite(27, "TailsSprite", "CH7S3", "https://example.com/tails.png", "https://example.com/tails-large.png", "Tails", true, false);
        Sprite sprite3 = new Sprite(28, "SonicSprite", "CH7S3", "https://example.com/sonic.png", "https://example.com/sonic-large.png", "Sonic", true, true);

        tracker.addSprite(sprite);// and this calls the addSprite we created and adds it to the arraylist of sprites
        tracker.addSprite(sprite1);// and this calls the addSprite we created and adds it to the arraylist of sprites
        tracker.addSprite(sprite2);// and this calls the addSprite we created and adds it to the arraylist of sprites
        tracker.addSprite(sprite3);// and this calls the addSprite we created and adds it to the arraylist of sprites

       // ApiTracker.fetchSprites();


     
        System.out.println(tracker.findMissingSprites());
        System.out.println(tracker.countOwnedSprites());
        System.out.println(tracker.countMasteredSprites());
        System.out.println(tracker.countMissingSprites());



    }
}