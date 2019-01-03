package pe1;

import java.util.Scanner;

public class ques10 {

    public String repeat(String s, int n){

        /** length of string */
        int len = s.length();
        int j;

        /** the index from where the substring to be repeated starts */
        int index = s.length() - n;

        /** adding the substring to the original string, n number of times */
        while(n!=0) {
            for (j = index; j < len; j++) {
                s = s + s.charAt(j);
            }
            j= index;
            n--;
        }
        return s;
    }
    public static void main(String[] args){

        ques10 q = new ques10();
        /** taking input */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String t = sc.nextLine();
        System.out.println("Enter an integer: ");
        int m = sc.nextInt();

        System.out.println(q.repeat(t,m));
    }
}
