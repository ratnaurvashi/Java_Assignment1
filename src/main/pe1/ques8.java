package pe1;

import java.util.Scanner;

public class ques8 {
    int target=50;
    public String guessNum(int guess){
        /** if guessed number equals target number */
        if(guess==target){
            return "Number guessed matches the original number";
        }
        else{
            /** if guessed number is less than target number */
            if(guess<target){
                System.out.println("Number guessed is less than the original number");
                Scanner sc= new Scanner(System.in);
                /** keep checking till the user inputs a guess */
                while((guess= sc.nextInt())!=0){
                    if(guess==target){
                        break;
                    }
                    else if(guess<target){
                        System.out.println("Number guessed is less than the original number");
                    }
                    else{
                        System.out.println("Number guessed is greater than the original number");
                    }
                }
                return "Number guessed matches the original number";
            }
            /** if guessed number is greater than target number */
            else {
                System.out.println("Number guessed is greater than the original number");
                Scanner sc= new Scanner(System.in);
                while((guess= sc.nextInt())!=0){
                    if(guess==target){
                        break;
                    }
                    else if(guess<target){
                        System.out.println("Number guessed is less than the original number");
                    }
                    else{
                        System.out.println("Number guessed is greater than the original number");
                    }
                }
                return "Number guessed matches the original number";
            }
        }
    }

    public static void main(String[] args){
        ques8 q = new ques8();
        /** initial target, set by developer, that user needs to guess */

        /** taking input */
        Scanner sc= new Scanner(System.in);
        System.out.print("Guess the number: ");
        int g= sc.nextInt();
        String s= q.guessNum(g);
        System.out.println(s);
    }
}
