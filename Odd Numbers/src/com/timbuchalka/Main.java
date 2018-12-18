package com.timbuchalka;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        int X;
        Scanner sc =new Scanner(System.in);
        X = sc.nextInt();
        System.out.print(1+"\n");
        for (int i = 1; i < X-1; i+=2) {
            int oddNumber = i + 2;
            System.out.print(oddNumber+"\n");
        }
    }

}