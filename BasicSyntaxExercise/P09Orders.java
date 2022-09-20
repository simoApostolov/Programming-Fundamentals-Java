package BasicSyntaxExercise;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	On the first line, you will receive integer N – the count of orders the shop will receive.
        //•	For each order, you will receive the following information:
        //o	Price per capsule - floating-point number in the range [0.00…1000.00].
        //o	Days – integer in the range [1…31].
        //o	Capsules count - integer in the range [0…2000].
        int ordersCount = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        double totalSum = 0;
        for (int i = 1; i <= ordersCount ; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            sum =  price * (days * capsulesCount);
            totalSum += sum;
            System.out.printf("The price for the coffee is: $%.2f%n",sum);
        }
        System.out.printf("Total: $%.2f", totalSum);
    }
}
