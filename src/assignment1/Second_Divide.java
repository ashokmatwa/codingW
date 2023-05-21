package assignment1;

import java.util.Scanner;

public class Second_Divide {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if(n1 > n2 && n2!= 0){
            System.out.println(n1/n2);
        }
    }
}
