package com.algorithm.chap01;

import java.util.Scanner;

public class Question11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        spira(n);
    }

    static void spira(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<i*2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
