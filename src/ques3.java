import java.util.Scanner;

public class ques3 {

    public String checkAlphabet(String s){
        String a="";
        for(int i=0; i<s.length(); i++){
            /** condition to check for vowel*/
            if(i%2!=0)
                a= a+" ";
            if ((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i')
                    || (s.charAt(i) == 'o') || (s.charAt(i) == 'u')) {
                a+="Vowel";
            }
            /** rest are consonants*/
            else {
                a+="Consonant";
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int flag= 1;
        ques3 q = new ques3();
        /** taking input */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");

        /** converting all characters of string to lowercase*/
        String t = sc.next().toLowerCase();
        for (int i = 0; i < t.length(); i++) {
            /** checking if any character is not an alphabet */
            if (!Character.isAlphabetic(t.charAt(i))){
                flag = 0;
                break;
            }
        }
        /** if any character is not an alphabet */
        if(flag==0) {
            System.out.println("Error!");
        }
        else{
            String l= q.checkAlphabet(t);
            System.out.println(l);
        }
    }
}
