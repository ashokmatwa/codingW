package assignment1;
import java.util.Scanner;

public class Sixth_Electricity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();

        int sum = 0;

        if(1<=units && units <= 100){
            sum = sum + units*6;
        }
        else if(100<units && units <=200){
            sum += 100*6 + (units-100)*8;
        }
        else if(200<units && units <=300){
            sum += 100*6 + (units-100)*8 + (units-200)*10;
        }

        System.out.println(sum);
    }
}
