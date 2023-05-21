package assignment1;

import java.util.Scanner;

public class Third_EvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if(number%2==0)
            System.out.println("Even");
        else System.out.println("Odd");
    }
}
