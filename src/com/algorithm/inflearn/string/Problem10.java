package com.algorithm.inflearn.string;

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
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //solution(str);
        char c = sc.next().charAt(0);
        for(int x : solution1(str, c)){
            System.out.print(x + " ");
        }

    }

    public static int[] solution1(String str, char t){
        int[] answer = new int[str.length()];
        int p = 1000;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)==t){
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for(int i =str.length()-1; i>=0; i--){
            if(str.charAt(i)==t){
                p = 0;
            }else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    // 왜 틀렸지?
    public static void solution(String str){
        // 마지막 문자
        char s = str.charAt(str.indexOf(' ') + 1);
        // 입력문자열
        char[] s2 = str.substring(0, str.indexOf(' ') ).toCharArray();
        int[] left = new int[s2.length];
        int[] right = new int[s2.length];
        int count = 0;
        // 왼쪽으로 가는 거
        for(int i = 0; i<s2.length-1; i++){
            if(s2[i] == s){
                count = 0;
                left[i] = count;
            }else{
                ++count ;
                left[i] = count;
            }
        }

        // 오른쪽으로 가는거
        for(int i = s2.length-1; i>= 0; i--){
            if(s2[i] == s){
                count = 0;
                right[i] = count;
            }else{
                ++count;
                right[i] = count;
            }
            //System.out.println(right[i]);
        }

        for(int i = 0; i< left.length; i++){
            if(left[i] > right[i]){
                System.out.print(right[i] +" ");
            }else{
                System.out.print(left[i] +" ");
            }
        }

    }
}
