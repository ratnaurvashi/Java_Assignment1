import java.util.Scanner;

public class ques7 {
    public static void main(String[] args){

        /** taking input */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        int rem, sum=0;
        int temp;

        /** frequency array for counting the frequency of all the numbers */
        int freq[]= new int[10];
        temp=n;

        while(temp!=0){
            /** finding the last digit of the number */
            rem=temp%10;
            /** counting the number of times that digit occurred in the number */
            freq[rem]++;

            /** checking for even number */
            if(rem%2==0)
                sum+=rem;
            temp/=10;
        }
        System.out.print("Sorted number in decreasing order: ");
        for(int i=9; i>=0; i--){
                while(freq[i]!=0) {
                    System.out.print(i);
                    freq[i]--;
                }
        }
        /** for new line */
        System.out.println();
        System.out.println("Sum of even numbers: "+ sum);
        if(sum>15)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
