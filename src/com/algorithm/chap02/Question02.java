package com.algorithm.chap02;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        reverse(a);
        System.out.println("역순정렬을 마쳤습니다.");

    }

    static void swap(int[] a, int idx1, int idx2){
        int t= a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a){
        for(int i=0;i<a.length/2;i++){
            System.out.println("a["+i+"]와 a["+(a.length-i-1)+"]을 교환합니다.");
            swap(a, i, a.length-i-1);
            for(int j=0;j<a.length;j++){
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }

    }

    static int sumOf(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }

    //b의 모든 요소를 배열 a에 복사
    static void copy(int[] a, int[] b){
        for(int i=0;i<b.length;i++){
            a[i]=b[i];
        }
    }
}
