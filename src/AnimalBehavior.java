interface AnimalBehavior {
    void makeSound();
    void move();
}

abstract class Animal  implements AnimalBehavior{
    private final String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}
    public int getAge() {return age;}

    public abstract void displayInfo();

}
