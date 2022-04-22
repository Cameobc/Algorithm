package com.algorithm.chap03;

public class Question04 {

    static int binSearchX(int[] x, int n, int key) {
        int pl = 0;
        int pr = n-1;
        do {
            int pc = (pl + pr) / 2;
            if(x[pc]==key){
                /*int i;
                for(i=pl;x[i]!=key;i++);
                return i==pc?pc:i;*/
                int temp = pc;
                for(;pl<=pc;pc--){
                    if(x[pc]==key){
                        temp=pc;
                    }
                }
                return temp;
            }else if(x[pc]<key){
                pl = pc+1;
            }else{
                pr = pc -1;
            }
        } while (pl<=pr);
        return -1;
    }

    public static void main(String[] args) {
        int[] x = {7, 3, 5, 7, 7, 7, 7, 8, 8, 9, 9,};
        int n = x.length;
        System.out.println(binSearchX(x, n, 7));
    }
}
