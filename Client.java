public class Client {
    public static void main(String[] args) {

        Dog dog = new Dog.Builder("Edek")
                .age(9)
                .color("White")
                .owner("Bartek")
                .build();
        System.out.println(dog);

        ProblemDog problemDog = new ProblemDog("Edek", "White", 9, "Bartek");
        System.out.println(problemDog);

        ProblemDog problemDog2 = new ProblemDog("Edek");
        problemDog2.setColor("White");
        problemDog2.setAge(9);
        problemDog2.setOwner("Bartek");
        System.out.println(problemDog2);
    }
}
