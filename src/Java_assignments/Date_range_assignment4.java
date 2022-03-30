package Java_assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Date_range_assignment4 {
        String findRange(String input) {
        //splitting the given signup and current date
        String []dates=input.split(" ");
        //initializing the calendar
        Calendar c=Calendar.getInstance();
        Calendar c2=Calendar.getInstance();
        Calendar c3=Calendar.getInstance();
        Calendar c4=Calendar.getInstance();
        //to convert the date to given format
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String [] time=dates[0].split("-");
        //splitting signup date
        int y=Integer.parseInt(time[2]);
        int m=Integer.parseInt(time[1])-1;
        int d=Integer.parseInt(time[0]);

        c.set(y,m,d);
        //splitting currrent date
        Date date=c.getTime();
        String [] time2=dates[1].split("-");
        int y2=Integer.parseInt(time2[2]);
        int m2=Integer.parseInt(time2[1])-1;
        int d2=Integer.parseInt(time2[0]);

        c2.set(y2,m2,d2);
        c3.set(y2,m,d);
        c4.set(y2,m,d);
        //adding 30days to current Year Anniversary
        c3.add(Calendar.DATE,30);
        //Subracting 30days from current Year Anniversary
        c4.add(Calendar.DATE,-30);

        if(y==y2 && c2.compareTo(c4)>=0){
        //if the given dates are not allowable range
        return "not in given range";
        }
        if(c2.compareTo(c3)>0){
        //If you are past the +-30 day anniversary then it back-date  so that it falls in the +-30-day window
        return sdf.format(c4.getTime())+" "+sdf.format(c3.getTime());
        }
        else{
        return sdf.format(c4.getTime())+" "+sdf.format(c2.getTime());
        }

        }
        public static void main(String[] args)throws IOException{
            Scanner sc=new Scanner(System.in);
            String input= sc.nextLine();
        Date_range_assignment4 ass=new Date_range_assignment4();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(ass.findRange(input));

        }
        }




