package com.algorithm.inflearn.string;

import java.util.Locale;
import java.util.Scanner;

public class Problem07 {

    /**
     * 설명
     * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
     * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
     * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
     *
     * 입력
     * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
     *
     * 출력
     * 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }

    //강의코드
    private static String solution02(String str){
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString();
        // 대소문자는 무시함
        if(!str.equalsIgnoreCase(tmp)){
            answer = "NO";
        }
        return answer;
    }

    //강의코드
    private static String solution01(String str){
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for(int i =0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                answer = "NO";
                break;
            }
        }
        return answer;
    }

    //mine
    private static String solution(String str){
        String answer = "";
        char[] c = str.toUpperCase().toCharArray();
        int lt = 0;
        int rt = c.length-1;

        while(lt < rt){
            if(c[lt] != c[rt]){
                answer = "NO";
                break;
            }else{
                answer = "YES";
                lt++;
                rt--;
            }
        }
        return answer;
    }
}
