package pe1;

import java.util.Scanner;

public class ques4 {

    public String loop(int n){
        /** looping */
        String s="";
        for(int i=1; i<=(n+1); i++){
            int temp= i;
            while(temp!=0){
                s+= i+ " ";
                temp--;
            }
        }
        return s;
    }

    public static void main(String[] args){
        ques4 q = new ques4();
        /** taking input */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int k= sc.nextInt();
        System.out.println(q.loop(k));
    }
}
