import java.util.Scanner;

public class CharacterTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any caracter : ");
        char ch = sc.next().charAt(0);

        if (Character.isAlphabetic(ch)) {
            if(Character.isUpperCase(ch)){
                System.out.println(Character.toLowerCase(ch)+ " is a Alphahbet.");
            }
            else{
                System.out.println(ch + " is a Alphahbet.");
            }

        } else if (Character.isDigit(ch)) {

            System.out.println(ch + " is a Digit.");

        } else {

            System.out.println(ch + " is Special Character.");

        }

    }
}