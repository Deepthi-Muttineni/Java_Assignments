package Java_assignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class PingMedian {

        public static void median(String command) {

            try {
                Process p = Runtime.getRuntime().exec(command);
                BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));

                String s = "";
                // reading output stream of the command
                while ((s = inputStream.readLine()) != null) {
                    System.out.println(s);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {

            String ip;
            System.out.println("Enter the ip address : ");
            Scanner in = new Scanner(System.in);
            ip =in.next();
            System.out.println("ip"+ip);
            median("ping " + ip);


        }
    }

