package com.algorithm.inflearn.string.review;

import java.util.Scanner;

public class Problem10 {

    /**
     * 설명
     * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
     *
     * 입력
     * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
     * 문자열의 길이는 100을 넘지 않는다.
     *
     * 출력
     * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
     *
     * 예시 입력 1
     * teachermode e
     *
     * 예시 출력 1
     * 1 0 1 2 1 0 1 2 2 1 0
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        char c = sc.next().charAt(0);

        for(int x : solution(next, c)){
            System.out.print(x + " ");
        }
    }

    public static int[] solution(String s, char c){
        int[] answer = new int[s.length()];
        //오른쪽으로 돌 거
        int [] right = new int[s.length()];
        //왼쪽으로 돌 거
        int[] left = new int[s.length()];
        int count = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) != c){
                count++;
            }else{
                count = 0;
            }
            answer[i] = count;
        }

        count = 0;
        for(int i = s.length()-1; i >=0; i--){
            if(s.charAt(i) != c){
                count++;
            }else{
                count = 0;
            }
            if(count < answer[i]){
                answer[i] = count;
            }
        }

        return answer;
    }
}
