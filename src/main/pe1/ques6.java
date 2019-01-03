package pe1;

import java.util.Scanner;

public class ques6 {

    public String checkChar(char s){
        /** ascii value range for capital letters */
        if (s >= 65 && s <= 90)
            return "Capital letter";

        /** ascii value range for small case letters */
        else if(s >= 97 && s <= 122)
            return "Small case letter";

        /** ascii value range for digits */
        else if (s >= 48 && s <= 57)
            return "Digit";
        /** remaining ascii value range for special character */
        else
            return "Special Character";
    }

    public static void main(String[] args) {
        ques6 q = new ques6();
        /** taking input */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char t = sc.next().charAt(0);
        System.out.println(q.checkChar(t));
    }
}
