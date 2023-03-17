public class Dog extends Animal{
    private boolean walked;
    private boolean pooped;

    public Dog(String n, int a, boolean v, boolean d, boolean w, boolean p) {
        super(n, a, v, d);
        walked = w;
        pooped = p;
    }

    public void walk(){
        System.out.println("Woof! Let's go run around the trees!");
        walked = true;
    }

    public boolean hasBeenWalked(){
        return walked;
    }

    public void scoop(){
        System.out.println("Whoops...it just slipped out");
        this.dirty = false;
        pooped = false;
    }


}
