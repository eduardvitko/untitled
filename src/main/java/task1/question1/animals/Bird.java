package task1.question1.animals;

import java.util.Objects;

public class Bird extends Animals{

    private int weight;
    private int age;
    private String colour;

    public Bird(String name,String type,int weight,int age,String colour) {
        super(name,type);
        this.weight = weight;
        this.age = age;
        this.colour = colour;
    }


    @Override
    public void eat() {
        System.out.println("Bird is eat");
    }

    @Override
    public void drink() {
        System.out.println("Bird is drink");
    }



    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return weight == bird.weight && age == bird.age && Objects.equals(colour, bird.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight, age, colour);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "weight=" + weight +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }
}
