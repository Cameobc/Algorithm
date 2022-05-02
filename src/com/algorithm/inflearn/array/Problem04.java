package com.algorithm.inflearn.array;

import java.util.Scanner;

public class Problem04 {

    /**
     *설명
     * 1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
     * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
     *
     * 입력
     * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
     *
     * 출력
     * 첫 줄에 피보나치 수열을 출력합니다.
     *
     * 예시 입력 1
     * 10
     *
     * 예시 출력 1
     * 1 1 2 3 5 8 13 21 34 55
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        //int[] result = new int[count];
        //solution(count, result);
        solution2(count);
    }

    //강의 정답

    private static void solution2(int count){
        int a =1, b=1, c;
        System.out.print( a +" "+ b+" ");
        for(int i = 2; i<count; i++){
            c= a+b;
            System.out.print( c +" ");
            a = b;
            b = c;
        }
    }
    private static int[] solution01(int n) {
        int[] answer = new int[n];
        answer[0] =1;
        answer[1] = 1;
        for(int i =2; i<n; i++){
            answer[i] = answer[i - 2] + answer[i - 1];
        }
        return answer;
    }

    private static void solution(int count, int[] a){
        int sum = 0;
        for(int i = 0; i<count; i++){
            if(i < 2){
                a[i] = 1;
                sum += a[i];
            }else{
                a[i] = sum;
                sum += a[i-1];
            }
            //a[i] = sum;
            System.out.print(a[i]+ " ");
        }
    }
}
