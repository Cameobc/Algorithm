package com.algorithm.chap01;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= 0;
        boolean flag = true;
        while (flag){
            b = sc.nextInt();
            if(b>a){
                flag=false;
            }else{
                System.out.println("a보다 큰 값을 입력하세요");
            }
        }
        System.out.println(b-a);

    }
}
