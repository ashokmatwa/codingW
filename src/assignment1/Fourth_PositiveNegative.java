package assignment1;

import java.util.Scanner;

public class Fourth_PositiveNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if(number>0)
            System.out.println("Positive");
        else System.out.println("Negative");
    }
}
