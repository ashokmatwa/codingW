package assignment1;

import java.util.Scanner;

public class Eight_Area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int width = scanner.nextInt();
        areaTriangle(height, width);

        int radius = scanner.nextInt();
        areaCircle(radius);
        perimeterCircle(radius);

    }

    public static void areaTriangle(int height, int width){
        System.out.println((((double) 1/2)*height*width));
    }
    public static void areaCircle(int radius){
        System.out.println(2*3.14*radius*radius);
    }
    public static void perimeterCircle(int radius){
        System.out.println(2*3.14*radius);
    }
}
