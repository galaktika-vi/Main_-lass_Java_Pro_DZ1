import java.util.Random;

public class Person {
    private String fullName;
    private int age;
    private int steps;

    public Person() {
        this.fullName = "Unknown";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public int move() {
        Random random = new Random();
        steps = random.nextInt(101);
        return steps;
    }

    public void talk() {
        System.out.println(fullName + " пошел " + steps + " шагов.");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Андрей", 0);
        Person person2 = new Person("Никита", 30);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}
