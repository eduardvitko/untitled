package task1.question1.animals;

public class Canary extends Bird{


    public Canary(String name, String type, int weight, int age, String colour) {
        super(name, type, weight, age, colour);
    }



    public void ring(){
        System.out.println("Canary is ring");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public void eat() {
        System.out.println("Canary is eat");
    }

    @Override
    public void drink() {
        System.out.println("Canary is drink");;
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

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Canary{" +
                " name =" +getName()+
                ", type = " + getType()+
                ", weight=" + getWeight()+
                ", age=" + getAge() +
                ", colour='" + getColour() + '\'' +
                '}';
    }
}
