package com.algorithm.chap01;

import java.util.Scanner;

public class Question03 {

    /*
    * 가우스의 덧셈
    * ex) 1~100 덧셈을 구할떄 100부터 거꾸로 가는 값을 더해 나누기 2를 한다.
    * 1+100 2+99 ... ->101*100/2
    * (n+1)×n개÷2
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum= (1+n)*n/2;
        System.out.println(sum);
    }
}
