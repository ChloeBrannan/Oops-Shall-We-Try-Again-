public class App {
  public static void main(String[] args) {
    int Choice = Core.getValidInt(1, 3, "Please select a number 1 through 3: ", "Invalid selection! Please enter a valid number");
    System.out.println("You picked: " + Choice);
//age for simple question
    int age = Core.getValidInt(0, 120, "Enter Your age: ", "Age must be 0-120.");
    System.out.println("Age set to: " + age);
  }
}
