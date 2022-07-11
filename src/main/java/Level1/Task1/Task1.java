package Level1.Task1;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Task1FindingUniqValues task1FindingUniqValues = new Task1FindingUniqValues();
        new Scanner(System.in);
        int[] Array = new int[]{1, 5, 9, 9, 5, 7, 10, 8, 9, 9, 9};
        System.out.println(task1FindingUniqValues.MethodFindUnikValus(Array));
    }
}
