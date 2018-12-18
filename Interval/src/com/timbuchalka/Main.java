package com.timbuchalka;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        float N;
        Scanner sc =new Scanner(System.in);
        N = sc.nextFloat();
        if (N >=0 && N <= 25) {
            System.out.printf("Intervalo [0,25]\n");
        }else if (N >= 25 && N <= 50) {
            System.out.printf("Intervalo (25,50]\n");
        }else if (N >= 50 && N <= 75) {
            System.out.printf("Intervalo (50,75]\n");
        }else if (N >= 75 && N<=100) {
            System.out.printf("Intervalo (75,100]\n");
        }else {
            System.out.print("Fora de intervalo\n");
        }
    }
}

