package BasicSyntaxMoreExercise;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        double price = 0;
        double moneySpent = 0;
        boolean isValid = false;

        String input = scanner.nextLine();
        while (!input.equals("Game Time")) {
            String game = input;
            switch (game) {
                case "OutFall 4":
                    if (budget >= 39.99) {
                        budget -= 39.99;
                        moneySpent += 39.99;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.printf("Too Expensive%n");
                    }
                    break;
                case "CS: OG":
                    if (budget >= 15.99) {
                        budget -= 15.99;
                        moneySpent += 15.99;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.printf("Too Expensive%n");
                    }
                    break;
                case "Zplinter Zell":
                    if (budget >= 19.99) {
                        budget -= 19.99;
                        moneySpent += 19.99;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.printf("Too Expensive%n");
                    }
                    break;
                case "Honored 2":
                    if (budget >= 59.99) {
                        budget -= 59.99;
                        moneySpent += 59.99;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.printf("Too Expensive%n");
                    }
                    break;
                case "RoverWatch":
                    if (budget >= 29.99) {
                        budget -= 29.99;
                        moneySpent += 29.99;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.printf("Too Expensive%n");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (budget >= 39.99) {
                        budget -= 39.99;
                        moneySpent += 39.99;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.printf("Too Expensive%n");
                    }
                    break;
                default: {
                    System.out.printf("Not Found%n");
                }

            }
            if (budget <= 0) {
                System.out.println("Out of money!");
                isValid = true;
                break;
            }

            input = scanner.nextLine();
        }
        if (isValid) {
            System.out.println();
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", moneySpent, budget);
        }
    }
}
