package com.kodnest.project;

import java.util.Scanner;
public class Year_month_days 
{
    public static void main(String args[])
    {
        int m, year, week, day,hours;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of years:");
        year = s.nextInt();
        m = year *12;
        System.out.println("No. of month:"+m);
        week = m * 4;
        System.out.println("No. of weeks:"+week);
        day = week*7;
        System.out.println("No. of days:"+day);
        hours=day*24;
        System.out.println("No. of hours:"+hours);
        s.close();
        
    }
}
