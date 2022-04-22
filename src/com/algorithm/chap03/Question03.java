package com.algorithm.chap03;

public class Question03 {

    static int searchIdx(int[] a, int n, int key, int[] idx){
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]==key){
                idx[j++]=i;
            }
        }
        return j;
    }
}
