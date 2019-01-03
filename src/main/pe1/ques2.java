package pe1;

import java.util.Scanner;

public class ques2 {

    public String checkCond(int x){
        /** checking condition */
        if(x%2!=0 && x>=20 && x<=30){
            return "Tom";
        }
        else{
            return "Jerry";
        }
    }

    public static void main(String[] args){
        ques2 q = new ques2();
        /** taking input */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int k=sc.nextInt();
        String s = q.checkCond(k);
        System.out.println(s);
    }
}

