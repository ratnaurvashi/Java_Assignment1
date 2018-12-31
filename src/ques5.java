import java.util.Scanner;

public class ques5 {
    public static void main(String[] args){
        /** taking input */
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Input: ");

        /** checking if input is a number */
        while(sc.hasNextInt())
        {
            sum+=sc.nextInt();
        }

        /** if the input is not a number */
        System.out.println("Error!");
        System.out.println("Sum is: " + sum);
    }
}