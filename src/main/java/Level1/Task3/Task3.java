package Level1.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Task3FindingSquare task3FindingSquare = new Task3FindingSquare();
        final Scanner sc = new Scanner(System.in);
        System.out.println("input x1");
        double x1 = sc.nextDouble();
        System.out.println("input x2");
        double x2 = sc.nextDouble();
        System.out.println("input x3");
        double x3 = sc.nextDouble();
        System.out.println("input y1");
        double y1 = sc.nextDouble();
        System.out.println("input y2");
        double y2 = sc.nextDouble();
        System.out.println("input y3");
        double y3 = sc.nextDouble();
        System.out.println("Your result is: ");
        System.out.println( task3FindingSquare.FindingSquare(x1, x2, x3, y1, y2,y3));
    }
}
