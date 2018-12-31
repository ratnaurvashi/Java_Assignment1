import java.util.Scanner;

public class ques4 {
    public static void main(String[] args){
        /** taking input */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        /** looping */
        for(int i=1; i<=(n+1); i++){
            int temp= i;
            while(temp!=0){
                System.out.print(i + " ");
                temp--;
            }
        }
    }
}
