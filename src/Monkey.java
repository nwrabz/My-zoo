public class Monkey extends Animal{
    public Monkey(String name, int age){super(name, age);}

    @Override
    public void makeSound() {
        System.out.println(getName() + " chatters and scream! 🐵");
    }

    @Override
    public void displayInfo() {
        System.out.println("🐵 Monkey: " + getName() + ", Age: " + getAge());
    }

    @Override
    public void move() {
        System.out.println(getName() + " sings from tree to tree");
    }
}
