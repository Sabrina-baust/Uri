package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int N;
        Scanner sc =new Scanner(System.in);

        N = sc.nextInt();
        for (int i = 0; ((N*i) + 2) < 10000; i++) {
            System.out.print((N*i) + 2+"\n");
        }
    }
}