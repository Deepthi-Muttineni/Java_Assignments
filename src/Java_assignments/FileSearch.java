package Java_assignments;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileSearch {
    public static void main(String[] args) {
        File path = new File("F:\\Zemoso");
        File[] files = path.listFiles();
        Scanner sc = new Scanner(System.in);
        String str;
        //str = sc.next();

        do{
        str = sc.nextLine();
        for (File getfile : files) {
            if (Pattern.compile(str).matcher(getfile.getName()).matches())
            {
                System.out.println("Found");
                System.out.println(getfile.getAbsolutePath());
            }

        }
    }while(!str.equals("end"));
 }
}
