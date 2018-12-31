import java.util.Scanner;

public class ques8 {
    public static void main(String[] args){

        /** initial target, set by developer, that user needs to guess */
        int target=50;

        /** taking input */
        Scanner sc= new Scanner(System.in);
        System.out.print("Guess the number: ");
        int guess= sc.nextInt();

        /** if guessed number equals target number */
        if(guess==target){
            System.out.println("Number guessed matches the original number");
        }
        else{
            /** if guessed number is less than target number */
            if(guess<target){
                System.out.println("Number guessed is less than the original number");

                /** keep checking till the user inputs a guess */
                while((guess= sc.nextInt())!=0){
                    if(guess==target){
                        System.out.println("Number guessed matches the original number");
                        break;
                    }
                    else if(guess<target){
                        System.out.println("Number guessed is less than the original number");
                    }
                    else{
                        System.out.println("Number guessed is greater than the original number");
                    }
                }
            }
            /** if guessed number is greater than target number */
            else {
                System.out.println("Number guessed is greater than the original number");
                while((guess= sc.nextInt())!=0){
                    if(guess==target){
                        System.out.println("Number guessed matches the original number");
                        break;
                    }
                    else if(guess<target){
                        System.out.println("Number guessed is less than the original number");
                    }
                    else{
                        System.out.println("Number guessed is greater than the original number");
                    }
                }

            }
        }

    }
}
