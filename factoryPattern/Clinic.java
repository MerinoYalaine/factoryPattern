package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("[1] Cat");
            System.out.println("[2] Dog");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            int choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet = null;
            boolean isCat = false;
            boolean isDog = false;

            switch (choice) {
                case 1: pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");
                    isDog = true;
                    break;
                case 2: pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    isCat = true;
                    break;
                case 3: System.exit(0);
            }

            System.out.println("Pet id is " + petFile.getPetId());
            System.out.println("Pet name is " + petFile.getPetName());
            System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());

            if (isCat) {
                System.out.println("Number of Lives: " + ((Cat) pet).getNoOfLives());
            } else if (isDog) {
                System.out.println("Pet breed: " + ((Dog) pet).getBreed());
            }

            System.out.println("Communication sound: " + petFile.getPet().makeSound());
            System.out.println("Play mode: " + petFile.getPet().play() + "\n");

        }
    }
}
