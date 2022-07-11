package Level2.Task1;

public class Task1 {
    public static void main(String[] args) {
        String str = "{}()";
        String result = str.replaceAll("[^(){}\\]\\[]+", "");
        if (str.equals(result)) {
            String s1 = "Действительна";
            System.out.println(s1);
        } else if (str == null) {
            String s1 = "Действительна";
            System.out.println(s1);
    } else {
            String s2 = "Недействительна";
            System.out.println(s2);
        }
    }
}
