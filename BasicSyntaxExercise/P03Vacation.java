package BasicSyntaxExercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        if (typeGroup.equals("Students")){
            if (day.equals("Friday")){
                price = 8.45;
            } else if (day.equals("Saturday")) {
                price = 9.80;
            } else if (day.equals("Sunday")) {
                price = 10.46;
            }
        } else if (typeGroup.equals("Business")) {
            if (day.equals("Friday")){
                price = 10.90;
            } else if (day.equals("Saturday")) {
                price = 15.60;
            } else if (day.equals("Sunday")) {
                price = 16.00;
            }
        } else if (typeGroup.equals("Regular")) {
            if (day.equals("Friday")){
                price = 15;
            } else if (day.equals("Saturday")) {
                price = 20;
            } else if (day.equals("Sunday")) {
                price = 22.50;
            }
        }
        double totalPrice = peopleCount * price;

        if (typeGroup.equals("Students")){
            if (peopleCount >= 30){
                totalPrice = totalPrice * 0.85;
            }
        }
        if (typeGroup.equals("Business")){
            if (peopleCount >= 100){
                totalPrice = totalPrice -(10 * price);
            }
        }
        if (typeGroup.equals("Regular")){
            if (peopleCount >= 10 && peopleCount <= 20){
                totalPrice = totalPrice * 0.95;
            }
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
