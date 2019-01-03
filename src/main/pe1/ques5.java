package pe1;

import java.util.Scanner;

public class ques5 {
    public int summation(int m){
        int sum=0;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt())
            sum+=m;
        /** checking if input is a number */
        while(sc.hasNextInt())
        {
            sum+=sc.nextInt();
        }
        return sum;
    }
    public static void main(String[] args){
        ques5 q= new ques5();
        /** taking input */
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int n=sc.nextInt();
        int k= q.summation(n);
        /** if the input is not a number */
        System.out.println("Error!");
        System.out.println("Sum is: " + k);
    }
}