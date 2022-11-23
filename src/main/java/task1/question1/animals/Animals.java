package task1.question1.animals;

import java.util.Objects;

public class Animals {
    private String name;
    private String type;

    public Animals(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void eat() {
        System.out.println("All animals is eat");
    }
    public void drink(){
        System.out.println("All animals is drink");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(name, animals.name) && Objects.equals(type, animals.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
}
