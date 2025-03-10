public class Lion extends Animal{
    public Lion(String name, int age){super(name, age);}

    @Override
    public void displayInfo() {
        System.out.println("🦁 Lion: " + getName() + ", Age: " + getAge());
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "roars loudly! 🦁");

    }

    @Override
    public void move() {
        System.out.println(getName() + "runs swiftly through the jungle.");

    }
}
