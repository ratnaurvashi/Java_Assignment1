import java.util.Scanner;

public class ques6 {
    public static void main(String[] args){
        /** taking input */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a character: ");
        char s= sc.next().charAt(0);

        /** ascii value range for capital letters */
        if (s >= 65 && s <= 90)
            System.out.println("Capital letter");

        /** ascii value range for small case letters */
        else if(s >= 97 && s <= 122)
            System.out.println("Small case letter");

        /** ascii value range for digits */
        else if (s >= 48 && s <= 57)
            System.out.println("Digit");
        /** remaining ascii value range for special character */
        else
            System.out.println ("Special Character");
    }
}
