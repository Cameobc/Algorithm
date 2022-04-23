package com.algorithm.inflearn.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem04 {

    /**
     * 설명
     * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
     *
     * 입력
     * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
     * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
     *
     * 출력
     * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        String[] str = new String[a];
        for(int i = 0; i<a; i++){
            str[i] = sc.nextLine();
        }

        //for(int i = 0; i<a; i++){
        //    String solution = solution(str[i]);
        //    System.out.println(solution);
        //}

        for(String x : solution2(a, str)){
            System.out.println(x);
        }

    }

    //강의
    private static ArrayList<String> solution2(int n, String[] b){
        ArrayList<String> answer = new ArrayList<>();
        for(String x: b){
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = s.length -1;
            while(rt > lt){
                char tmp = s[rt];
                s[rt] = s[lt];
                s[lt] = tmp;
                rt--;
                lt++;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    //강의
    private static ArrayList<String> solution1(int n, String[] b){
        ArrayList<String> answer = new ArrayList<>();
        for(String x: b){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    //mine
    private static String solution(String b){
        String answer = "";
        for(int i = b.length(); i> 0; i--){
            answer += b.substring(i-1, i);
        }
        return answer;
    }
}
