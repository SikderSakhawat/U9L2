public class Animal {
    private String name;
    private int age;
    private boolean isVaccinated;

    protected boolean dirty;

    public Animal(String n, int a, boolean v, boolean d){
        name = n;
        age = a;
        isVaccinated = v;
        dirty = d;
    }

    public void adopt(){
        System.out.println("I have been adopted!");
    }

    public void feed(){
        System.out.println("That was some scrumptious food!");
    }

    public void clean(){
        System.out.println("Now I'm all nice and tidy!");
        dirty = false;
    }
}
