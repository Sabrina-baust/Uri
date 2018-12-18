package com.timbuchalka;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int X, oddNum = 6;
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        for( int i = X; i < (X+(oddNum*2)) ; i+=2){
            int odd;
            if(i % 2 == 0){
                odd = i + 1;
                System.out.printf("%d\n", odd);
            }else{
                odd = i;
                System.out.printf("%d\n", odd);
            }
        }
    }
}