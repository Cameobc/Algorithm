package com.algorithm.chap02;

import java.util.Random;
import java.util.Scanner;

public class Question01 {

    public static void main(String[] args) {
        Random  random = new Random();
        Scanner sc = new Scanner(System.in);

        int num = random.nextInt(10);
        int[] height = new int[num];
        for(int i=0;i<num;i++){
            height[i]=100+random.nextInt(90);
        }
    }

    static int maxOf(int[] a){
        int max = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }


}
