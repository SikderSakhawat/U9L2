public class Cat extends Animal{

    private boolean played;
    private int jumpHeight;
    public Cat(String n, int a, boolean v, boolean d, boolean p, int j) {
        super(n, a, v, d);
        played = p;
        jumpHeight = j;
    }
    public void play(){
        System.out.println("Meow! Is that a rat? Let's catch it!");
        played = true;
    }
    public boolean hasPlayedWith(){
        return played;
    }

    public void jump(){
        System.out.println("Wow, I jumped " + jumpHeight + " inches high!");
    }
}
