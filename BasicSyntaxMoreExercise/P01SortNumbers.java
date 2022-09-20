package BasicSyntaxMoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(Integer.parseInt(scanner.nextLine()));
        arrayList.add(Integer.parseInt(scanner.nextLine()));
        arrayList.add(Integer.parseInt(scanner.nextLine()));

        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        for (int counter: arrayList){
            System.out.println(counter);
        }


    }

}
