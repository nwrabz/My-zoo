import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " has been added to the zoo!");
    }

    public void removeAnimal(Animal animal) {
        if (animals.isEmpty()){
            System.out.println("No animal yet in the zoo");
        } else {
            animals.remove(animal);
            System.out.println(animal.getName() + " has been removed to the zoo!");
        }
    }

    public void listAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo yet");
            return;
        }

        System.out.println("\n🐾 Animals in the Zoo:");
        System.out.println("--------------------------");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println((i + 1) + ".");
            animals.get(i).displayInfo();
        }
        System.out.println("--------------------------");

    }

    public void interactWithAnimal(int index) {
        if (index < 0 || index >= animals.size()) {
            System.out.println("Invalid choice. Please select a valid animal.");
            return;
        }

        Animal animal = animals.get(index);
        System.out.println("\nInteracting with " + animal.getName() + "...");
        animal.makeSound();
        animal.move();
    }

    public void editAvailableAnimal() {}
}
