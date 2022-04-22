package com.algorithm.chap02;

import java.util.Scanner;

public class Question03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int[num];

        int bnum = sc.nextInt();
        int[] b = new int[bnum];

        for(int i=0;i<bnum;i++){
            b[i] = sc.nextInt();
        }
    }

    //b의 모든 요소를 배열 a에 복사
    static void copy(int[] a, int[] b){
        int length = a.length<b.length?b.length:a.length;
        for(int i=0;i<length;i++){
            a[i]=b[i];
        }
    }

    //b의 모든 요소를 a에 역순으로 복사
    static void rcopy(int[] a, int[] b){
        int length = a.length<b.length?b.length:a.length;
        for(int i=0;i<length;i++){
            a[i]=b[b.length-i-1];
        }
    }
}
