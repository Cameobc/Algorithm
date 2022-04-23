package com.algorithm.inflearn.string;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Problem05 {

    /**
     * 설명
     * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
     * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
     *
     *
     * 입력
     * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
     *
     *
     * 출력
     * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String solution = solution(s);
        System.out.println(solution);
    }

    private static String solution1(String x){
        String answer = "";
        char[] s = x.toCharArray();
        int lt = 0;
        int rt = x.length()-1;
        while(lt < rt){
            if (!Character.isAlphabetic(s[lt])){
                lt++;
            }else if(!Character.isAlphabetic(s[rt])){
                rt--;
            }else{
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    private static String solution(String x){
        //String eng = /^[a-zA-Z]*$/;
        String answer = "";
        char[] chars = x.toCharArray();
        int lt = 0;
        int rt = x.length()-1;
        while(lt < rt){
            char temp = chars[lt];
            char temp2 = chars[rt];
            boolean chk = Pattern.matches("^[a-zA-z]*$]", String.valueOf(temp));
            boolean chk2 = Pattern.matches("^[a-zA-z]*$]", String.valueOf(temp2));
            if(!chk && !chk2){
                chars[lt] = chars[rt];
                chars[rt] = temp;
            }
            lt++;
            rt--;
        }
        answer = String.valueOf(chars);

        return answer;
    }

}
