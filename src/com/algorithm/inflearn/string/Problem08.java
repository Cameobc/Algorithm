package com.algorithm.inflearn.string;

import java.util.Scanner;

public class Problem08 {

    /**
     * 설명
     * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
     * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
     * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
     * 알파벳 이외의 문자들의 무시합니다.
     *
     * 입력
     * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
     *
     * 출력
     * 첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution1(str));
    }

    //강의 풀이
    public static String solution1(String s){
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)){
            answer = "YES";
        }
        return answer;
    }


    // 내 풀이
    public static String solution(String s){
        String answer = "Yes";
        s = s.replaceAll("[^a-zA-Z]", "").toUpperCase();
        char[] temp = s.toUpperCase().toCharArray();
        int lt = 0;
        int rt = temp.length -1;
        while(lt < rt){
            if(temp[lt] != temp[rt]){
                answer = "NO";
                break;
            }
            lt++;
            rt--;

        }
        return answer;
    }
}
