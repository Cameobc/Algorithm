package com.algorithm.chap01;

import java.util.Scanner;

public class SumWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int i =0;

        while(i<a){
            sum += i;
            i++;
        }

        System.out.println(sum );
        System.out.println(i);
    }
}
