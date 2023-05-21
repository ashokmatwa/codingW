package assignment1;

import java.util.*;

public class First_Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.println("Enter third number: ");
        int n3 = sc.nextInt();

        int sum = n1+n2+n3;
        System.out.println("Sum : "+sum);
    }

}
