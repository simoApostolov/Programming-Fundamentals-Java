package BasicSyntaxExercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	The amount of money George Lucas has – the floating-point number in the range [0.00…1,000.00].
        //•	The count of students – integer in the range [0…100].
        //•	The price of lightsabers for a single saber – the floating-point number in the range [0.00…100.00].
        //•	The price of robes for a single robe – the floating-point number in the range [0.00…100.00].
        //•	The price of belts for a single belt – the floating-point number in the range [0.00…100.00].
        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double robeSum = studentsCount * robePrice;
        double lightsaberSum = lightsaberPrice * Math.ceil(studentsCount * 1.1);
        double beltSum = 0;
        if (studentsCount >= 6) {
            studentsCount = studentsCount - (studentsCount / 6);
            beltSum = studentsCount * beltPrice;
        } else {
            beltSum = studentsCount * beltPrice;
        }
        double totalSum = lightsaberSum + robeSum + beltSum;

        if (totalSum <= budget){
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else  {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(budget - totalSum));
        }


    }
}
