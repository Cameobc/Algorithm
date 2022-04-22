package com.algorithm.chap03;

import java.util.Scanner;


/*2020-10-18
* 선형검색*/
public class SeqSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] x = new int[num];

        for(int i=0;i<num;i++){
            System.out.print("x["+i+"] : ");
            x[i]=sc.nextInt();
        }

        int key = sc.nextInt();
        int idx = seqSearch(x, num, key);

        if(idx==1){
            System.out.println("그런 요소가 없습니다.");
        }else{
            System.out.println("x["+idx+"]번 째 입니다.");
        }
    }


    static int seqSearch(int[] a, int n, int key){
        int i=0;

        while(true){
            if(i==n){
                return -1;
            }
            if(a[i]==key){
                return i;
            }
            i++;
        }
    }

    static int seqSearch_For(int[] a, int n, int key){

        for(int i=0;i<n;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
}

