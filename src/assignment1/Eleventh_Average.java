package assignment1;

import java.util.Scanner;

public class Eleventh_Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();

        int sum = n1+n2+n3+n4+n5;
        double average = (double) sum/5;

        System.out.println("sum : "+sum+" average : "+average);
    }
}
