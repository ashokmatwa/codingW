package assignment1;

import java.util.Scanner;

public class Fourteen_LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if(year%100==0){
            if(year%400==0){
                System.out.println("Leap year");
            }
            else System.out.println("Not a Leap year");
        } else if(year % 4 == 0) {
            System.out.println("Leap year");
        }
        else System.out.println("Not a leap year");
    }
}
