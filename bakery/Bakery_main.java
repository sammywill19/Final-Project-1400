package bakery;
/* Strings - lines 50, 71, 80-85, BakeryMenuHandler.java
 * Variables - lines 10-30, Bakery_main.java
 * For loop - lines 120-125, BakeryMenuHandler.java
 * While loop - lines 40-50, Bakery_main.java
 * Conditionals - lines 130-140, BakeryMenuHandler.java
 * User Input - lines 35-45, Bakery_main.java
 * Console Output - lines 50-60, Bakery_main.java
 * File Output - lines 150-160, BakeryMenuHandler.java
 * List/Array - lines 120-125, BakeryMenuHandler.java
 * Additional Class - BakeryMenuHandler.java
 */
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
        Scanner scanner = new Scanner(System.in);
        // Create an instance of BakeryMenuHandler
        BakeryMenuHandler menuHandler = new BakeryMenuHandler(
            choc, pink, orange, green, purpleBlue,
            chocoChiCookie, chocohalicMadness, purpleCookie, flamingMadness, brighterThanSun,
            chocoMadnessCake, pinkCake, purpleCake, flamingRedCake, orangeYellow,
            chocoChipMuffin, chocoMuffin, purpleMuffin, fireRedMuffin, fallMuffin
        );
        int menuChoice;
        do {
            System.out.println("\nWelcome to the Bakery! Please select from the menu:");
            System.out.println("1) Donuts");
            System.out.println("2) Cookies");
            System.out.println("3) Cakes");
            System.out.println("4) Muffins");
            System.out.println("0) Exit");
            menuChoice = scanner.nextInt();
            menuHandler.handleMenuChoice(menuChoice, scanner);
        } while (menuChoice != 0);
        scanner.close();
    }
}