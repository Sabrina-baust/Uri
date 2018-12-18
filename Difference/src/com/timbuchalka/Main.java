package com.timbuchalka;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        int A , B , C , D, difference;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        difference=((A * B) - (C * D));

        System.out.printf("DIFERENCA = %d\n", difference);

    }
}