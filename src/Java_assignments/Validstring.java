package Java_assignments;
import java.util.Scanner;

public class Validstring {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter your String ");
        str =in.nextLine();
        str = str.toLowerCase();
        boolean[] alphaList = new boolean[26];
        int index = 0;
        int check = 1;
        for (int i = 0; i < str.length(); i++) {
            if( str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
                //System.out.println(index);
            }
            alphaList[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (alphaList[i] == false)
                check = 0;
        }
        System.out.print("String: " + str);
        if (check == 1)
            System.out.print("\nstring is a pangram.\n ");
        else
            System.out.print("\nstring is not a pangram.\n ");
    }
}
