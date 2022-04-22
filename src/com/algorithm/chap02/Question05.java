package com.algorithm.chap02;

import java.util.Scanner;

public class Question05 {

    static int[][] mdays ={
            {31,28,31,30,31,30,31,31,30,31,30,31},
            {31,29,31,30,31,30,31,31,30,31,30,31}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int retry;

        do{
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();

            System.out.printf("그 해 %d일 쨰입니다.\n", dayOfYear_q(year, month, day));
            System.out.printf("올해 남은 날짜는 %d일 입니다.\n", leftDayOfYear(year, month, day));
            System.out.println("한 번 더 1, 아니면 0");
            retry=sc.nextInt();
        }while (retry==1);
    }

    //윤녕:1, 평년:0
    static int isLeap(int year){
        return (year%4==0 && year%100 !=0 || year%400==0)? 1:0;
    }

    static int dayOfYear(int y, int m, int d){
        int days = d;

        for(int i=1;i<m;i++){
            days+=mdays[isLeap(y)][i-1];
        }
        return days;
    }

    static int dayOfYear_q(int y, int m, int d){
        while(--m!=0){
            d+=mdays[isLeap(y)][m];
        }
        return d;
    }

    static int leftDayOfYear(int y, int m, int d){
        while(--m!=0){
            d+=mdays[isLeap(y)][m];
        }
        int total=0;
        for(int i=0;i<12;i++){
            if(isLeap(y)==1){
                total+=mdays[1][i];
            }else{
                total+=mdays[0][i];
            }
        }
        return total-d;
    }
}
