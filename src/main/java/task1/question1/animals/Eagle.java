package task1.question1.animals;

public class Eagle extends Bird{


    public Eagle(String name, String type, int weight, int age, String colour) {
        super(name, type, weight, age, colour);
    }
    public void fly() {
        System.out.println("Egle is fly");
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eat");
    }

    @Override
    public void drink() {
        System.out.println("Eagle is drink");
    }


    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getColour() {
        return super.getColour();
    }

    @Override
    public void setColour(String colour) {
        super.setColour(colour);
    }

}
