package BasicSyntaxExercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }

            input = scanner.nextLine();
        }
        double price = 0;
        String inputTwo = scanner.nextLine();
        while (!inputTwo.equals("End")) {
            String product = inputTwo;

            switch (product){
                case "Nuts":
                    if (sum >= 2){
                        sum -= 2;
                        System.out.printf("Purchased %s%n",product);
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Water":
                    if (sum >= 0.7){
                        sum -= 0.7;
                        System.out.printf("Purchased %s%n",product);
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5){
                        sum -= 1.5;
                        System.out.printf("Purchased %s%n",product);
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Soda":
                    if (sum >= 0.8){
                        sum -= 0.8;
                        System.out.printf("Purchased %s%n",product);
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Coke":
                    if (sum >= 1){
                        sum -= 1;
                        System.out.printf("Purchased %s%n",product);
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                default: {
                    System.out.printf("Invalid product%n");
                }
            }



            inputTwo = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",sum);
    }
}
