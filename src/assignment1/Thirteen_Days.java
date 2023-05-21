package assignment1;

import java.util.Scanner;

public class Thirteen_Days {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  month = scanner.nextInt();

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("DAYS : " + 31);
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("Days : " + 30);
        }
        else System.out.println("Days : " + 29);
    }
}
