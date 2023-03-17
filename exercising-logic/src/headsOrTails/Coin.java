package headsOrTails;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Coin {

    private static final String STRONG = "strong";
    private static final String MEDIUM = "medium";
    private static final String WEAK = "weak";

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int option = 2;

        do {
            System.out.println("------HEADS OR TAILS------");
            System.out.println("Options");
            System.out.println("1 -- Flip the coin \n2 -- Finish the program");
            System.out.print("Type: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    int coin;
                    int min;
                    int max;
                    System.out.println("\nTypes of throwing strength:\n- Weak\n- Medium\n- Strong");
                    System.out.print("How hard will the coin be flipped? ");
                    scanner.nextLine();
                    String strength = scanner.nextLine();
                    if (strength.equalsIgnoreCase(WEAK)) {
                        min = 10;
                        max = 30;
                        coin = coinFlipResult(min, max);
                        tossResult(coin);
                    } else if (strength.equalsIgnoreCase(MEDIUM)) {
                        min = 30;
                        max = 60;
                        coin = coinFlipResult(min, max);
                        tossResult(coin);
                    } else if (strength.equalsIgnoreCase(STRONG)) {
                        min = 60;
                        max = 100;
                        coin = coinFlipResult(min, max);
                        tossResult(coin);
                    } else {
                        System.out.println("\nThe passed strength is invalid.\n");
                    }
                    break;
                case 2:
                    System.out.println("Heads or tails program finished.");
                    break;
                default:
                    System.out.println("Invalid option.\n");
            }
        } while (option != 2);
        scanner.close();
    }

    public static int coinFlipResult(int min, int max) {
        Random random = new Random();
        return random.nextInt(max) + min;
    }


    public static void tossResult(int coin) {
        if (coin % 2 == 0) {
            System.out.println("\nIt's tails!\n");
        } else {
            System.out.println("\nIt's heads!\n");
        }
    }
}
