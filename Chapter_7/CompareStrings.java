import java.util.*;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String userInput = name.nextLine();

        if (userInput.equals("Carmen")){
            System.out.print("Carmen equals " + userInput);
        }
        else {
            System.out.print("Carmen does not equal " + userInput);
        }
    }
}
