package com.timbuchalka;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        int password = 2002, givenPassword;
        Scanner sc = new Scanner(System.in);

        while ((givenPassword = sc.nextInt()) != password) {
            System.out.print("Senha Invalida\n");
        }
        System.out.print("Acesso Permitido\n");
    }
}