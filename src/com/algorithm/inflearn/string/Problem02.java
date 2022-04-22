package com.algorithm.inflearn.string;

import java.util.Scanner;

public class Problem02 {

    /**
     * 설명
     * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
     *
     * 입력
     * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
     * 문자열은 영어 알파벳으로만 구성되어 있습니다.
     *
     * 출력
     * 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String solution = solution(a);
        System.out.println(solution);
    }

    // 강의 코드
    private static String solution1(String a){
        String answer = "";
        for(char x : a.toCharArray()){
            /*if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            }else{
                answer += Character.toLowerCase(x);
            }*/
            //aski
            //대문자 65~96, 소문자 97~122
            if(x >= 65 && x <= 96){
                answer += (char)(x + 32);
            }else{
                answer += (char)(x - 32);
            }
        }
        return answer;
    }

    private static String solution(String a){
        String result= "";
        for(char x : a.toCharArray()){
            if(x == Character.toLowerCase(x)){
                x = Character.toUpperCase(x);
            }else{
                x = Character.toLowerCase(x);
            }
            result += x;
        }

        return result;
    }
}
