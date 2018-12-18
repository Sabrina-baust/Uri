package com.timbuchalka;

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        int X, Y;
        Scanner input = new Scanner(System.in);
        while (((X = input.nextInt()) != 0)
                && ((Y = input.nextInt()) != 0)) {
            if (X> 0 && Y > 0) {
                System.out.print("primeiro\n");
            } else if (X > 0 && Y < 0) {
                System.out.print("quarto\n");
            } else if (X < 0 && Y < 0) {
                System.out.print("terceiro\n");
            } else if (X < 0 && Y > 0) {
                System.out.print("segundo\n");
            }
        }
    }
}