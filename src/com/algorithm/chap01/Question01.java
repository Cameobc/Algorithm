package com.algorithm.chap01;

import java.util.Scanner;

public class Question01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int max = max4(a, b, c, d);
        System.out.println("최댓값은 : " + max);
    }

    static int max4(int a, int b, int c, int d){
        int max = a;
        if(a<b) max = b;
        if(a<c) max = c;
        if(a<d) max = d;
        return max;
    }

    static int min3(int a, int b, int c, int d){
        int min = a;
        if(b<a) min=b;
        if(c<a) min=c;
        return min;
    }

    static int min4(int a, int b, int c, int d){
        int min = a;
        if(b<a) min=b;
        if(c<a) min=c;
        if(d<a) min=d;

        return min;
    }
}
