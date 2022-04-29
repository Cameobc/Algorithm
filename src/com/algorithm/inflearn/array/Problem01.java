package com.algorithm.inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem01 {

    /**
     * 설명
     * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
     * (첫 번째 수는 무조건 출력한다)
     *
     * 입력
     * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
     *
     * 출력
     * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
     *
     * 예시 입력 1
     * 6
     * 7 3 9 5 6 12
     *
     *  예시 출력 1
     * 7 9 6 12
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for(int i =0; i<a; i++){
            b[i] = sc.nextInt();
        }
        for(int x : solution1(a, b)){
            System.out.print(x+" ");
        }
    }

    // 강의
    private static ArrayList<Integer> solution1(int a, int[]b){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(b[0]);
        for(int i =1; i<a; i++){
            if(b[i-1]<b[i]){
                answer.add(b[i]);

            }
        }
        return answer;
    }


    // 내가 푼 것
    private static void solution(int[]b){
        int tmp = 0;
        for(int i = 1; i<b.length; i++){
            if(i ==1){
                tmp = b[0];
                System.out.print(tmp+ " ");
            }else{
                if(b[i-1] < b[i]){
                    tmp = b[i];
                    System.out.print(tmp+" ");
                }
            }
        }
    }
}
