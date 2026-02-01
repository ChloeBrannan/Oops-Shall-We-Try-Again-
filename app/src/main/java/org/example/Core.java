import java.util.Scanner;

public class Core {
    public static int getValidInt(int low, int high, String prompt, String error) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            int value = input.nextInt();
            if (value >= low && value <= high) {
                return value;
            }
            System.out.println(error);
        }
    }
}