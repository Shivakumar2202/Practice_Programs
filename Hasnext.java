package com.kodnest.project;

import java.util.Scanner;

public class Hasnext {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int n=1;
       while(scan.hasNext()){
           String s=scan.nextLine();
           System.out.println(n+" "+s);
           n++;
       }
       scan.close();
    }
       
}
