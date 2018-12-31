import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        int flag= 1;

        /** taking input */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");

        /** converting all characters of string to lowercase*/
        String s = sc.next().toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            /** checking if any character is not an alphabet */
            if (!Character.isAlphabetic(s.charAt(i))){
                flag = 0;
                break;
            }
        }
        /** if any character is not an alphabet */
        if(flag==0) {
            System.out.println("Error!");
        }
        else{
            for(int i=0; i<s.length(); i++){
                /** condition to check for vowel*/
                if ((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i')
                        || (s.charAt(i) == 'o') || (s.charAt(i) == 'u')) {
                    System.out.print("Vowel ");
                }
                /** rest are consonants*/
                else {
                    System.out.println("Consonant ");
                }
            }
        }
    }
}
