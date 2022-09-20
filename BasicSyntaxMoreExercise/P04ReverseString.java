package BasicSyntaxMoreExercise;

import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        
        String output = "";
        for (int position = string.length() - 1; position >= 0; position--) {
            char currentPosition = string.charAt(position);
            output += currentPosition;
        }
        System.out.println(output);
    }
}
