package task1.question1.animals;

public class Ping extends Bird{
    public Ping(String name, String type, int weight, int age, String colour) {
        super(name, type, weight, age, colour);
    }

    @Override
    public void eat() {
        System.out.println("Ping is eat");
    }

    @Override
    public void drink() {
        System.out.println("Ping is drink");;
    }

    public  void swim(){
        System.out.println("Ping is swim");
    }

}
