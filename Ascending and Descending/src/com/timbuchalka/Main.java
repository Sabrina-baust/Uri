package com.timbuchalka;

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        int X, Y;
        Scanner sc = new Scanner(System.in);
        do {
            X = sc.nextInt();
            Y = sc.nextInt();
            if (X > Y) {
                System.out.print("Decrescente\n");
            } else if (X < Y) {
                System.out.print("Crescente\n");
            }
        } while (X != Y);
    }
}
