package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c, temp;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        temp = a;
        if(a < b || a < c){
            if(b < c){
                temp = c;
            }else{
                temp = b;
            }
        }

        System.out.printf("%d eh o maior\n", temp);

    }

}