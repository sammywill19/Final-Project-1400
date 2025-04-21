package bakery;

import java.util.Scanner;

public class Bakery_main {

    public static void main(String[] args) {
        // Declare and define bakery objects
        Donut choc = new Donut("chocolate", 45, 22, 17);
        Donut pink = new Donut("Pink", 41, 25, 15);
        Donut orange = new Donut("Orange Frosting", 28, 22, 18);
        Donut green = new Donut("Green Frosting", 86, 41, 34);
        Donut purpleBlue = new Donut("Purple and blue donut", 45, 12, 46);

        Cookie chocoChiCookie = new Cookie("Chocolate Chip cookie", 45, 22, 17);
        Cookie chocohalicMadness = new Cookie("Chocohalic Madness", 250, 25, 70);
        Cookie purpleCookie = new Cookie("Thanos Cookie", 19, 4, 3);
        Cookie flamingMadness = new Cookie("Flaming Madness", 89, 31, 34);
        Cookie brighterThanSun = new Cookie("Brighter than the sun", 48, 16, 49);

        Cake chocoMadnessCake = new Cake("Chocoholic Madness Cake", 95, 18, 45);
        Cake pinkCake = new Cake("Pink Cake", 40, 12, 5);
        Cake purpleCake = new Cake("Thanos Cake", 55, 14, 6);
        Cake flamingRedCake = new Cake("Flaming Fire Light Red Cake", 108, 24, 32);
        Cake orangeYellow = new Cake("Orangey Yellow", 108, 24, 32);

        Muffin chocoChipMuffin = new Muffin("Chocolate Chip Muffin", 80, 12, 5);
        Muffin chocoMuffin = new Muffin("Chocolate Muffin", 120, 12, 89);
        Muffin purpleMuffin = new Muffin("Thanos Muffin", 43, 7, 5);
        Muffin fireRedMuffin = new Muffin("Fire Red Muffin Colored", 99, 8, 6);
        Muffin fallMuffin = new Muffin("Fall Colored Muffin", 121, 87, 51);

        int flavorChoice;
        int menuChoice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nWelcome to the Bakery! Please select from the menu:");
            System.out.println("1) Donuts");
            System.out.println("2) Cookies");
            System.out.println("3) Cakes");
            System.out.println("4) Muffins");
            System.out.println("0) Exit");

            // Read user input
            menuChoice = scanner.nextInt();

            // Evaluate user choice
            switch (menuChoice) {
                case 1:
                    System.out.println("\nWhat type of donut do you want?");
                    System.out.println("1) Chocolate");
                    System.out.println("2) Pink Frosting");
                    System.out.println("3) Orange Frosting");
                    System.out.println("4) Green Frosting");
                    System.out.println("5) Blue and Purple Donut");

                    flavorChoice = scanner.nextInt();
                    switch (flavorChoice) {
                        case 1 -> {
                            choc.printstats();
                            choc.Drawdonut(1);
                        }
                        case 2 -> {
                            pink.printstats();
                            pink.Drawdonut(2);
                        }
                        case 3 -> {
                            orange.printstats();
                            orange.Drawdonut(3);
                        }
                        case 4 -> {
                            green.printstats();
                            green.Drawdonut(4);
                        }
                        case 5 -> {
                            purpleBlue.printstats();
                            purpleBlue.Drawdonut(5);
                        }
                        default -> System.out.println("Invalid choice!");
                    }
                    break;

                case 2:
                    System.out.println("\nWhat type of cookie do you want?");
                    System.out.println("1) Chocolate Chip Cookie");
                    System.out.println("2) Chocoholic Madness");
                    System.out.println("3) Thanos Cookie");
                    System.out.println("4) Flaming Madness");
                    System.out.println("5) Brighter than the Sun");

                    flavorChoice = scanner.nextInt();
                    switch (flavorChoice) {
                        case 1 -> {
                            chocoChiCookie.printstats();
                            chocoChiCookie.DrawCookie(1);
                        }
                        case 2 -> {
                            chocohalicMadness.printstats();
                            chocohalicMadness.DrawCookie(2);
                        }
                        case 3 -> {
                            purpleCookie.printstats();
                            purpleCookie.DrawCookie(3);
                        }
                        case 4 -> {
                            flamingMadness.printstats();
                            flamingMadness.DrawCookie(4);
                        }
                        case 5 -> {
                            brighterThanSun.printstats();
                            brighterThanSun.DrawCookie(5);
                        }
                        default -> System.out.println("Invalid choice!");
                    }
                    break;

                case 3:
                    System.out.println("\nWhat type of cake do you want?");
                    System.out.println("1) Chocoholic Madness Cake");
                    System.out.println("2) Pink Cake");
                    System.out.println("3) Thanos Cake");
                    System.out.println("4) Flaming Fire Light Red Cake");
                    System.out.println("5) Orangey Yellow Cake");

                    flavorChoice = scanner.nextInt();
                    switch (flavorChoice) {
                        case 1 -> {
                            chocoMadnessCake.printstats();
                            chocoMadnessCake.DrawCake(1);
                        }
                        case 2 -> {
                            pinkCake.printstats();
                            pinkCake.DrawCake(2);
                        }
                        case 3 -> {
                            purpleCake.printstats();
                            purpleCake.DrawCake(3);
                        }
                        case 4 -> {
                            flamingRedCake.printstats();
                            flamingRedCake.DrawCake(4);
                        }
                        case 5 -> {
                            orangeYellow.printstats();
                            orangeYellow.DrawCake(5);
                        }
                        default -> System.out.println("Invalid choice!");
                    }
                    break;

                case 4:
                    System.out.println("\nWhat type of muffin do you want?");
                    System.out.println("1) Chocolate Chip Muffin");
                    System.out.println("2) Chocolate Muffin");
                    System.out.println("3) Thanos Muffin");
                    System.out.println("4) Fire Red Muffin Colored");
                    System.out.println("5) Fall Colored Muffin");

                    flavorChoice = scanner.nextInt();
                    switch (flavorChoice) {
                        case 1 -> {
                            chocoChipMuffin.printstats();
                            chocoChipMuffin.DrawMuffin(1);
                        }
                        case 2 -> {
                            chocoMuffin.printstats();
                            chocoMuffin.DrawMuffin(2);
                        }
                        case 3 -> {
                            purpleMuffin.printstats();
                            purpleMuffin.DrawMuffin(3);
                        }
                        case 4 -> {
                            fireRedMuffin.printstats();
                            fireRedMuffin.DrawMuffin(4);
                        }
                        case 5 -> {
                            fallMuffin.printstats();
                            fallMuffin.DrawMuffin(5);
                        }
                        default -> System.out.println("Invalid choice!");
                    }
                    break;

                case 0:
                    System.out.println("Thank you for visiting the Bakery! Goodbye!");
                    break;

                default:
                    System.out.println("Invalid menu choice! Please try again.");
            }
        } while (menuChoice != 0);

        scanner.close();
    }
}