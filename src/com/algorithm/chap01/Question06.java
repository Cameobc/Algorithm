package com.algorithm.chap01;

import java.util.Scanner;

public class Question06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean flag = true;
        while(flag){
            if(a<=0){
                System.out.println("a는 양의 정수여야 합니다.");
                a=sc.nextInt();

            }else{
                flag=false;
            }
        }

        System.out.println(String.valueOf(a).length());
    }
}
