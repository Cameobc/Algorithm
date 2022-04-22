package com.algorithm.chap01;

import java.util.Scanner;

public class Question04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(sumof(a, b));
    }

    static int sumof(int a, int b){
        int sum = a;
        if(b<a){
            a=b;
            b=sum;
        }
        sum=0;
        for(int i=a;i<=b;i++){
            sum +=i;
        }
        return sum;
    }

}
