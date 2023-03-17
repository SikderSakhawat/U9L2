public class Main {
    public static void main(String[] args) {
        Animal goofy = new Animal("Goofy", 10, true, false);
        goofy.adopt();
        goofy.feed();
        goofy.clean();

        Dog doug = new Dog("Doug", 12, true, false, true, true);
        doug.feed();
        doug.adopt();
        doug.hasBeenWalked();
        doug.walk();
        doug.hasBeenWalked();
        doug.scoop();
        doug.clean();

        Cat kathy = new Cat("Cathy", 5, false, false, false, 55);
        kathy.adopt();
        kathy.feed();
        kathy.hasPlayedWith();
        kathy.play();
        kathy.hasPlayedWith();
        kathy.jump();
    }
}
