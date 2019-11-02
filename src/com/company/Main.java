package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        String str1 = a.nextLine();
        Character k;
        String m ;
        String str0 = "";
        for (int i =0 ; i<str1.length(); i++){
            k = (str1.charAt(i));
            m = k.toString();
            if (m.equals("и")){
                str0 = str0+m;
            }
        }
        System.out.println(str0);
    }
}