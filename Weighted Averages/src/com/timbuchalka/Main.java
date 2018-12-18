package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int N;
        float value1, value2, value3;
        float average;
        Scanner sc =new Scanner(System.in);
        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            value1 = sc.nextFloat();
            value2 = sc.nextFloat();
            value3 = sc.nextFloat();
            average = ( value1*2 + value2*3 + value3*5 ) / 10;
            System.out.printf("%.1f\n", average);
        }
    }

}