package assignment1;

import java.util.Scanner;

public class Seventh_Kilometers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = scanner.nextInt();

        double miles = km * (0.62);
        System.out.println("miles : "+miles);
    }
}
