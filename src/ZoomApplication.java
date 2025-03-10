import java.util.Scanner;

public class ZoomApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Zoo zoo = new Zoo();

        while (true) {
            System.out.println("\n========= 🏞 ZOO MANAGEMENT SYSTEM 🏞 =========");
            System.out.println("1. Add Animal");
            System.out.println("2. View All Animals");
            System.out.println("3. Remove Animal");
            System.out.println("4. Interact with an Animal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter animal type (Lion, Elephant, Monkey): ");
                    String type = input.nextLine().toLowerCase();

                    System.out.println("Enter name: ");
                    String name = input.nextLine();

                    System.out.println("Enter age: ");
                    int age = input.nextInt();

                    switch (type) {
                        case "lion" -> zoo.addAnimal(new Lion(name, age));
                        case "elephant" -> zoo.addAnimal(new Elephant(name, age));
                        case "monkey" -> zoo.addAnimal(new Monkey(name, age));
                        default -> System.out.println("Invalid animal type! Please enter Lion, Elephant, or Monkey.");
                    }
                    break;

                case 2:
                    zoo.listAnimals();
                    break;

                case 3:
                    zoo.listAnimals();
                    if (!zoo.animals.isEmpty()){
                        System.out.println("Select an animal by number: ");
                        int index = input.nextInt();
                        zoo.interactWithAnimal(index -1);
                    }
                    break;

                case 4:
                    System.out.println("Exiting Zoo Management System. Goodbye! 🏞");
                   input.close();
                   return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");

            }
        }
    }
}
