package com.algorithm.chap01;

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("오른쪽 위");
        triangleRT(n);
        System.out.println("왼쪽 위");
        triangleLT(n);
        System.out.println("오른쪽 아래");
        triangleRB(n);
        System.out.println("왼쪽 아래");
        triangleLB(n);
    }

    static void triangleRT(int n){
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }*/

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i<=j?"*":" ");
            }
            System.out.println();
        }
    }

    static void triangleLT(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n){
        for(int i=1;i<=n;i++){
            /*for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();*/
            for(int j=n;j>0;j--){
                System.out.print(j>i?" ":"*");
            }
            System.out.println();
        }
    }

    static void triangleLB(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
