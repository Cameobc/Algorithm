package com.algorithm.inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem06 {

    /**
     * 설명
     * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
     * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
     * 첫 자리부터의 연속된 0은 무시한다.
     *
     * 입력
     * 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
     * 각 자연수의 크기는 100,000를 넘지 않는다.
     *
     * 출력
     * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
     *
     *
     * 예시 입력 1
     * 9
     * 32 55 62 20 250 370 200 30 100
     *
     * 예시 출력 1
     * 23 2 73 2 3
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] a = new int[s];
        for(int i =0; i<s; i++){
            a[i] = sc.nextInt();
        }
        solution(s, a);
    }


    //문제정답
    public static boolean isPrime(int num) {
        if(num == 1){
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static ArrayList<Integer> solution01(int n , int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp >0){
                int t = tmp%10;
                res = res*10 +t;
                tmp = tmp / 10;
            }

            if(isPrime(res)){
                answer.add(res);
            }
        }
        return answer;
    }

    //내가 푼 것
    private static void solution(int a, int[] b){
        int[] reverse = new int[a];
        // 자연수 리버스
        for(int i =0; i<a; i++){
            String aa = String.valueOf(b[i]);
            String re = new StringBuilder(aa).reverse().toString();
            reverse[i] = Integer.parseInt(re);
        }

        for(int i =0; i<a; i++){
            int count = 0;
           // System.out.println(reverse[i]);
            if(reverse[i] == 2 || reverse[i] ==3){
                ++count;
            }else{
                for(int j = reverse[i]-1; j >2; j--){

                    if(reverse[i]%j == 0){
                        count = 0;
                        break;
                    }else{
                        count++;
                    }
                }
            }

            if(count != 0){
                System.out.print(reverse[i] + " ");
            }
        }
    }
}
