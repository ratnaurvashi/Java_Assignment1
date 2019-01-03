package pe1;

import java.util.Scanner;

public class ques9 {

    public String reverse(String s){
        /** empty string for storing reversed string */
        String rev="";
        for(int i=(s.length()-1);i>=0;i--){
            rev = rev + s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args){
        ques9 q = new ques9();
        /** taking input */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String t= sc.nextLine();

        System.out.println(q.reverse(t));
    }
}
