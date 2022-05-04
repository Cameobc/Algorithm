package com.algorithm.inflearn.array;

import java.util.Scanner;

public class Problem05 {

    /**
     * 설명
     * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
     * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
     *
     * 입력
     * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
     *
     * 출력
     * 첫 줄에 소수의 개수를 출력합니다.
     *
     * 예시 입력 1
     * 20
     *
     * 예시 출력 1
     * 8
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(solution(a));
    }

    private static int solution(int a ){
        int count = 0;
        int[] result = new int[a + 1];

        for(int i = 2; i<a; i++){
            if(result[i] == 0){
                count ++;
                for(int j = i; j<a; j= j+i){
                    result[j] = 1;
                }
            }

        }
        return count;
    }



}
