package assignment1;

import java.util.Scanner;

public class Fifth_CGPA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        float n1 = sc.nextInt();

        System.out.println("Enter second number: ");
        float n2 = sc.nextInt();

        System.out.println("Enter third number: ");
        float n3 = sc.nextInt();

        float sum = (n1+n2+n3)/30;

        System.out.println("CGPA : "+sum);
    }
}
