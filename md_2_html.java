import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter input: ");

        String userInput = inputObj.nextLine();
        System.out.println("Entered: " + userInput);

        inputObj.close();
    }
}