public class Elephant extends Animal{
    public Elephant(String name, int age){super(name, age);}

    @Override
    public void displayInfo() {
        System.out.println("🐘 Elephant: " + getName() + ", Age: " + getAge());
    }


    @Override
    public void makeSound() {
        System.out.println(getName() + " trumpets with its trunk! 🐘");
    }

    @Override
    public void move() {
        System.out.println(getName() + " walks heavily but gracefully.");
    }
}
