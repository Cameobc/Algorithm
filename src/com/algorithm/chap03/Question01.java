package com.algorithm.chap03;

import java.util.Scanner;

public class Question01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] x = new int[num+1];

        for(int i=0;i<num;i++){
            System.out.print("x["+i+"] : ");
            x[i]=sc.nextInt();
        }

        int key = sc.nextInt();
        int idx = seqSearchSen(x,num,key);

        if (idx == -1) {
            System.out.println("그런 거 없음");
        }else{
            System.out.println("x["+idx+"]");
        }
    }

    static int seqSearchSen(int[] x, int n, int key){
      /*  int i=0;
        x[n] = key;
        while(true){
            if(x[i]==key){
                break;
            }
            i++;
        }
        return i==n? -1:i;*/
        x[n] = key;
        int i;
        for(i=0;x[i]!=key;i++);
          /*  if(x[i]==key){
                break;
            }*/

        return i==n? -1:i;
    }
}
