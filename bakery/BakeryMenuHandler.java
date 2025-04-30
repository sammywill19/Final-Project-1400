package bakery;

import java.util.Scanner;

public class BakeryMenuHandler {
    private Donut choc, pink, orange, green, purpleBlue;
    private Cookie chocoChiCookie, chocohalicMadness, purpleCookie, flamingMadness, brighterThanSun;
    private Cake chocoMadnessCake, pinkCake, purpleCake, flamingRedCake, orangeYellow;
    private Muffin chocoChipMuffin, chocoMuffin, purpleMuffin, fireRedMuffin, fallMuffin;

    public BakeryMenuHandler(
        Donut choc, Donut pink, Donut orange, Donut green, Donut purpleBlue,
        Cookie chocoChiCookie, Cookie chocohalicMadness, Cookie purpleCookie, Cookie flamingMadness, Cookie brighterThanSun,
        Cake chocoMadnessCake, Cake pinkCake, Cake purpleCake, Cake flamingRedCake, Cake orangeYellow,
        Muffin chocoChipMuffin, Muffin chocoMuffin, Muffin purpleMuffin, Muffin fireRedMuffin, Muffin fallMuffin
    ) {
        this.choc = choc;
        this.pink = pink;
        this.orange = orange;
        this.green = green;
        this.purpleBlue = purpleBlue;
        this.chocoChiCookie = chocoChiCookie;
        this.chocohalicMadness = chocohalicMadness;
        this.purpleCookie = purpleCookie;
        this.flamingMadness = flamingMadness;
        this.brighterThanSun = brighterThanSun;
        this.chocoMadnessCake = chocoMadnessCake;
        this.pinkCake = pinkCake;
        this.purpleCake = purpleCake;
        this.flamingRedCake = flamingRedCake;
        this.orangeYellow = orangeYellow;
        this.chocoChipMuffin = chocoChipMuffin;
        this.chocoMuffin = chocoMuffin;
        this.purpleMuffin = purpleMuffin;
        this.fireRedMuffin = fireRedMuffin;
        this.fallMuffin = fallMuffin;
    }

    public void handleMenuChoice(int menuChoice, Scanner scanner) {
        switch (menuChoice) {
            case 1 -> handleDonuts(scanner);
            case 2 -> handleCookies(scanner);
            case 3 -> handleCakes(scanner);
            case 4 -> handleMuffins(scanner);
            case 0 -> System.out.println("Thank you for visiting the Bakery! Goodbye!");
            default -> System.out.println("Invalid menu choice! Please try again.");
        }
    }

    private void handleDonuts(Scanner scanner) {
        System.out.println("\nWhat type of donut do you want?");
        System.out.println("1) Chocolate");
        System.out.println("2) Pink Frosting");
        System.out.println("3) Orange Frosting");
        System.out.println("4) Green Frosting");
        System.out.println("5) Blue and Purple Donut");

        int flavorChoice = scanner.nextInt();
        switch (flavorChoice) {
            case 1 -> { choc.printstats(); choc.Drawdonut(1); }
            case 2 -> { pink.printstats(); pink.Drawdonut(2); }
            case 3 -> { orange.printstats(); orange.Drawdonut(3); }
            case 4 -> { green.printstats(); green.Drawdonut(4); }
            case 5 -> { purpleBlue.printstats(); purpleBlue.Drawdonut(5); }
            default -> System.out.println("Invalid choice!");
        }
    }

    private void handleCookies(Scanner scanner) {
        System.out.println("\nWhat type of cookie do you want?");
        System.out.println("1) Chocolate Chip Cookie");
        System.out.println("2) Chocoholic Madness");
        System.out.println("3) Thanos Cookie");
        System.out.println("4) Flaming Madness");
        System.out.println("5) Brighter than the Sun");

        int flavorChoice = scanner.nextInt();
        switch (flavorChoice) {
            case 1 -> { chocoChiCookie.printstats(); chocoChiCookie.DrawCookie(1); }
            case 2 -> { chocohalicMadness.printstats(); chocohalicMadness.DrawCookie(2); }
            case 3 -> { purpleCookie.printstats(); purpleCookie.DrawCookie(3); }
            case 4 -> { flamingMadness.printstats(); flamingMadness.DrawCookie(4); }
            case 5 -> { brighterThanSun.printstats(); brighterThanSun.DrawCookie(5); }
            default -> System.out.println("Invalid choice!");
        }
    }

    private void handleCakes(Scanner scanner) {
        System.out.println("\nWhat type of cake do you want?");
        System.out.println("1) Chocoholic Madness Cake");
        System.out.println("2) Pink Cake");
        System.out.println("3) Thanos Cake");
        System.out.println("4) Flaming Fire Light Red Cake");
        System.out.println("5) Orangey Yellow Cake");

        int flavorChoice = scanner.nextInt();
        switch (flavorChoice) {
            case 1 -> { chocoMadnessCake.printstats(); chocoMadnessCake.DrawCake(1); }
            case 2 -> { pinkCake.printstats(); pinkCake.DrawCake(2); }
            case 3 -> { purpleCake.printstats(); purpleCake.DrawCake(3); }
            case 4 -> { flamingRedCake.printstats(); flamingRedCake.DrawCake(4); }
            case 5 -> { orangeYellow.printstats(); orangeYellow.DrawCake(5); }
            default -> System.out.println("Invalid choice!");
        }
    }

    private void handleMuffins(Scanner scanner) {
        System.out.println("\nWhat type of muffin do you want?");
        System.out.println("1) Chocolate Chip Muffin");
        System.out.println("2) Chocolate Muffin");
        System.out.println("3) Thanos Muffin");
        System.out.println("4) Fire Red Muffin Colored");
        System.out.println("5) Fall Colored Muffin");

        int flavorChoice = scanner.nextInt();
        switch (flavorChoice) {
            case 1 -> { chocoChipMuffin.printstats(); chocoChipMuffin.DrawMuffin(1); }
            case 2 -> { chocoMuffin.printstats(); chocoMuffin.DrawMuffin(2); }
            case 3 -> { purpleMuffin.printstats(); purpleMuffin.DrawMuffin(3); }
            case 4 -> { fireRedMuffin.printstats(); fireRedMuffin.DrawMuffin(4); }
            case 5 -> { fallMuffin.printstats(); fallMuffin.DrawMuffin(5); }
            default -> System.out.println("Invalid choice!");
        }
    }
}