import java.util.Scanner;

public class ques9 {
    public static void main(String[] args){
        /** taking input */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s= sc.nextLine();

        /** empty string for storing reversed string */
        String rev="";
        for(int i=(s.length()-1);i>=0;i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}
