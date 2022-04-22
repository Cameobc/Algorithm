package com.algorithm.chap02;

import java.util.Scanner;

public class CardConvRev {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        do{
            do{
                no= sc.nextInt();
            }while(no<0);

            do{
                cd = sc.nextInt();
            }while (cd<2||cd>36);

            dno=cardConv(no, cd, cno);

            for(int i=dno-1;i>=0;i--){
                System.out.print(cno[i]);
            }
            System.out.println();
            dno=cardConvR(no, cd, cno);

            for(int i=dno-1;i>=0;i--){
                System.out.print(cno[i]);
            }

            System.out.println("\n다시한번 1 종료 2");
            retry = sc.nextInt();
        }while (retry==1);
    }

    static int cardConvR(int x, int r, char[] d){
        int digits =0;
        String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x % r);
            x/=r;
        }while (x!=0);

        return digits;
    }

    static int cardConv(int x, int r, char[] d){
        int digits =0;
        String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x % r);
            x/=r;
        }while (x!=0);

        for(int i=0;i<digits/2;i++){
            char temp = d[i];
            d[i] = d[digits-i-1];
            d[digits-i-1]=temp;
        }

        return digits;
    }
}
