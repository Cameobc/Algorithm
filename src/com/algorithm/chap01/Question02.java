package com.algorithm.chap01;

import java.util.Scanner;

public class Question02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i=1;i<=n;i++){
            sum +=i;

            if(i==n){
                System.out.print(i+"="+sum);
            }else{
                System.out.print(i+"+");
            }
        }
    }
}
