import java.util.*;

class CharacterInfo {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        char character;
        
        System.out.print("The character is ");
        character = input.nextLine().charAt(0);

        if (Character.isUpperCase(character)){
            System.out.println(character + " is uppercase");
        } else {
            System.out.println(character + " is not uppercase");
        }

        if (Character.isLowerCase(character)){
            System.out.println(character + " is lowercase");
        } else {
            System.out.println(character + " is not lowercase");
        }

        System.out.println("After toLowerCase(), aChar is " + Character.toLowerCase(character));

        System.out.println("After toUpperCase(), aChar is " + Character.toUpperCase(character));

        if (Character.isLetterOrDigit(character)){
            System.out.println(character + " is a letter or digit");
        } else{
            System.out.println(character + " is neither a letter nor a digit");
        }
        
        if (Character.isWhitespace(character)){
            System.out.println(character + " is whitespace");
        } else{
            System.out.println(character + " is not whitespace");
        }
    }
}
