package com.algorithm.day01;

import java.util.Scanner;

//백준 별찍기 8번 문제
public class BaekjoonStar08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*for(int i=1;i<n*2;i++){
            if(i<=n){
                for(int j=1;j<=n;j++){
                    System.out.print(j<=i?"*":" ");
                }
                for(int j=n;j>0;j--){
                    System.out.print(j>i?" ":"*");
                }
            }else{
                for(int j=n;j>0;j--){
                    System.out.print(j<n?"*":" ");
                }
                *//*for(){

                }*//*
            }
            System.out.println();
        }*/

        for(int i=0;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j<=i?"*":" ");
            }
            for(int j=n;j>0;j--){
                System.out.print(j>i?" ":"*");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=n;j>0;j--){
                System.out.print(j>i?"*":" ");
            }
            for(int j=n;j>0;j--){
                System.out.print(j>i?"*":" ");
            }
            System.out.println();
        }
    }
}
