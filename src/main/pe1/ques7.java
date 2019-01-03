package pe1;

import java.util.Scanner;

public class ques7 {

    public int[] sort(int n) {
        int rem;
        int temp=n;
        int cnt=0;
        while (temp != 0) {
            temp /= 10;
            cnt++;
        }
        int arr[]=new int[cnt];
        int j=0;

        while (temp != 0) {
            /** finding the last digit of the number */
            rem = temp % 10;
            /**putting in array */
            arr[j]=rem;
            j=j+1;
            temp /= 10;
        }

        for (int i = 0; i < cnt; i++) {
            for (int k = i + 1; k < cnt; k++) {
                if (arr[i] < arr[k]) {
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        return arr;
    }

    public int findSum(int n){
        int rem, sum = 0;
        int temp=n;
        while (temp != 0) {
            /** finding the last digit of the number */
            rem = temp % 10;
            /** checking for even number */
            if (rem % 2 == 0)
                sum += rem;
            temp /= 10;
        }
        /** for new line */
        System.out.println();
        return sum;
    }

    public static void main(String[] args){
        ques7 q = new ques7();
        /** taking input */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int m= sc.nextInt();
        System.out.print("Sorted number in decreasing order: ");
        System.out.println(q.sort(m));
        int s= q.findSum(m);
        System.out.println("Sum is: "+s);
        if(s>15)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
