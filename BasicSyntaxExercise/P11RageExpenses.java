package BasicSyntaxExercise;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headset = 0;
        int mouse = 0;
        int keyboard = 0;
        int dipslay = 0;

        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0) {
                headset++;
            }
            if (i % 3==0) {
                mouse++;
            }
            if (i % 2==0 && i % 3 == 0){
                keyboard++;
                if (keyboard % 2 == 0){
                    dipslay ++ ;
                }
            }

        }

        double headsetSum = headset * headsetPrice;
        double mouseSum = mouse * mousePrice;
        double keyboardSum = keyboard * keyboardPrice;
        double displaySum = dipslay * displayPrice;

        double totalSum = headsetSum + mouseSum + keyboardSum +displaySum;

        System.out.printf("Rage expenses: %.2f lv.", totalSum);




    }
}
