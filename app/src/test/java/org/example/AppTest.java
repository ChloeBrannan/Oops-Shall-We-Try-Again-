public class AppTest {
    public static void main(String[] args) {
        System.out.println("Test 1: enter 0 to 100 ");
        int score = Core.getValidInt(0, 100, "Enter score: ", "Error: Must be 0-100");
        System.out.println("Test 1 Result: " + score);

        System.out.println("\nTest 2: enter -10 to -1 ");
        int neg = Core.getValidInt(-10, -1, "Enter negative: ", "Error: Must be between -10 and -1");
        System.out.println("Test 2 Result: " + neg);

        System.out.println("\nTest 3: enter 5");
        int single = Core.getValidInt(5, 5, "Enter 5: ", "Error: You must enter 5");
        System.out.println("Test 3 Result: " + single);
    }
}
//tests that run through all options that can cause problems to make sure everything works out