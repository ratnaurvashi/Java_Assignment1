import java.util.Scanner;

public class ques2 {
    public static void main(String[] args){

        /** taking input */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int x=sc.nextInt();

        /** checking condition */
        if(x%2!=0 && x>=20 && x<=30){
            System.out.println("Tom");
        }
        else{
            if(x%2==0 && x>=20 && x<=30){
                System.out.println("Jerry");
            }
        }
    }
}

