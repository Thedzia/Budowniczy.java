public class ProblemDog {

    private String name;
    private String color;
    private int age;
    private String owner;

    public ProblemDog(String name) {
        this.name = name;

    }

    public ProblemDog(String name, String color, int age, String owner) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.owner = owner;

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;

    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", color=" + color + ", age=" + age
                + ", owner=" + owner + "]";
    }
}