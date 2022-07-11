package Level1.Task1;

public class Task1FindingUniqValues {
    public int MethodFindUnikValus(int[] Arr) {
        int result = 0;
        int counter = 0;
        int MainNumbers = 0;

        for(int i = 0; i < Arr.length; ++i) {
            MainNumbers++;

            for(int j = i + 1; j < Arr.length; ++j) {
                if (Arr[j] == Arr[i]) {
                    counter++;
                    break;
                }
            }
        }

         result = MainNumbers - counter;
        return result;
    }
}
