package Level1.Task2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите X");
        int x = in.nextInt();
        System.out.print("Введите Y");
        int y = in.nextInt();
        System.out.print("Введите Futurex");
        int Futurex = in.nextInt();
        System.out.print("Введите Futurey");
        int Futurey = in.nextInt();
        int sx1 = x + 1;
        int sy1 = y + 2;
        int sx2 = x + 2;
        int sy2 = y + 1;
        int sx3 = x + 2;
        int sy3 = y - 1;
        int sx4 = x + 1;
        int sy4 = y - 2;
        int sx5 = x - 1;
        int sy5 = y - 2;
        int sx6 = x - 2;
        int sy6 = y - 1;
        int sx7 = x - 2;
        int sy7 = y + 1;
        int sx8 = x - 1;
        int sy8 = y + 2;

//        switch (Futurex){
//            case 1 sx1 ==
//        }

        if (sx1 == Futurex &&
                sy1 == Futurey &&
                sx1 >= 1 &&
                sy1 >= 1 &&
                sx1 <= 8 &&
                sy1 <= 8) {
            System.out.print("Ход Возможен" + Futurex + Futurey);
        } else if (sx2 == Futurex &&
                Futurey == sy2 &&
                sx2 >= 1 &&
                sy2 >= 1 &&
                sx2 <= 8 &&
                sy2 <= 8) {
            System.out.print("Ход Возможен" + Futurex + Futurey);
        } else if (Futurex == sx3 &&
                Futurey == sy3 &&
                sx3 >= 1 &&
                sy3 >= 1 &&
                sx3 <= 8 &&
                sy3 <= 8) {
            System.out.print("Ход Возможен" + Futurex + Futurey);
        } else if (Futurex == sx4 &&
                Futurey == sy4 &&
                sx4 >= 1 &&
                sy4 >= 1 &&
                sx4 <= 8 &&
                sy4 <= 8) {
            System.out.print("Ход Возможен" + Futurex + Futurey);
        } else if (Futurex == sx5 &&
                Futurey == sy5 &&
                sx5 >= 1 &&
                sy5 >= 1 &&
                sx5 <= 8 &&
                sy5 <= 8) {
            System.out.print("Ход Возможен" + Futurex + Futurey);
        } else if (Futurex == sx6 &&
                Futurey == sy6 &&
                sx6 >= 1 &&
                sy6 >= 1 &&
                sx6 <= 8 &&
                sy6 <= 8) {
            System.out.print("Ход Возможен" + Futurex + Futurey);
        } else if (Futurex == sx7 &&
                Futurey == sy7 &&
                sx7 >= 1 &&
                sy7 >= 1 &&
                sx7 <= 8 &&
                sy7 <= 8) {
            System.out.print("Ход Возможен" + Futurex + Futurey);
        }
        else if (Futurex == sx8 &&
                Futurey == sy8 &&
                sx8 >= 1 &&
                sy8 >= 1 &&
                sx8 <= 8 &&
                sy8 <= 8) {
            System.out.print("Ход Возможен" + Futurex + Futurey);
        } else {
            System.out.print("Ход не возможен");
        }
    }
}
