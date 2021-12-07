package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s = s.trim();
        if(s.length()==0){
            System.out.println(0);
        }else {

            String[] ss = s.split("[!,?._'@ ]+");
            System.out.println(ss.length);
            for (String a : ss
            ) {
                System.out.println(a);
            }
        }
    }
}
