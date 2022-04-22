package com.algorithm.inflearn;

import java.util.Locale;
import java.util.Scanner;

public class Problem01 {

    /**
     * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
     * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
     *
     * 입력
     * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
     * 문자열은 영어 알파벳으로만 구성되어 있습니다.
     *
     *  출력
     * 첫 줄에 해당 문자의 개수를 출력한다.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int result = solution01(a, b);
        System.out.println(result);
    }

    //강의 해설
    private static int solution02(){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char b = sc.next().charAt(0);
        int result = 0;

        a = a.toUpperCase();
        b = Character.toUpperCase(b);
       /* for (int i = 0; i<a.length(); i++){
            if(a.charAt(i) == b){
                result++;
            }
        }*/

        for(char x : a.toCharArray()){
            if(x == b){
                result++;
            }
        }

        return result;
    }

    // 내가 푼 것
    private static int solution01(String a, String b ){
        int result = 0;
        for(int i = 0; i< a.length(); i++){
            String substring = a.substring(i, i+1).toLowerCase();
            if(substring.equals(b.toLowerCase())){
                result++;
            }
        }
        return result;
    }

}
