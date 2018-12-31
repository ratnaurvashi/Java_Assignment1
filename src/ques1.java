import java.util.Scanner;

public class ques1 {
    public static void main(String[] args){
        long revn=0, rem, temp, sum=0;

        /** taking input */
        Scanner sc= new Scanner(System.in);
        System.out.println("Input number: ");

        /** number might be long and not fit in int*/
        long n= sc.nextLong();
        temp=n;

        while(temp!=0){
            /** finding the remainder, last digit of the number */
            rem= temp%10;

            /** checking if last digit is even*/
            if(rem%2==0)
                sum+=rem;

            /** reversing the number by putting last digit first*/
            revn= revn*10 + rem;
            temp= temp/10;
        }

        /** checking if the number and its reverse are same */
        if(n!=revn){
            System.out.println(n + " is not a palindrome");
        }
        else{
            if(sum>25){
                System.out.println(n + " is a palindrome and the sum of even numbers is greater than 25");
            }
            else{
                System.out.println(n + " is a palindrome and the sum of even numbers is less than 25");
            }
        }
    }
}
