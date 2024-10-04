import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercise 1");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        new ExercisesOne().firstExercise(a, b);

        ExeTwo exe = new ExeTwo();

        System.out.println("Exercise 2");
        String str1 = scanner.next();
        String str2 = scanner.next();
        exe.str(str1, str2);

        System.out.println("Exercise 3");
        exe.array();
    }

}
