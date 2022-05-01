package com.algorithm.inflearn.array;

import java.util.Scanner;

public class Problem03 {

    /**
     * 설명
     * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
     * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
     *
     *입력
     * 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
     * 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
     * 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
     *
     * 출력
     * 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] a = new int[cnt];
        int[] b = new int[cnt];
        for(int i = 0; i<cnt; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<cnt; i++){
            b[i] = sc.nextInt();
        }
        solution(cnt ,a , b);
    }

    private static void solution(int cnt, int[]a, int[]b){
        String[] result = new String[cnt];

        for(int i = 0; i <cnt; i++){
            if(a[i]==b[i]){
                result[i] = "D";
            }else if(a[i] == 1){
                if(b[i] == 2){
                    result[i] = "B";
                }else{
                    result[i] = "A";
                }

            }else if(a[i] == 2){
                if(b[i] == 1){
                    result[i] = "A";
                }else{
                    result[i] = "B";
                }
            }else{
                if(b[i] == 1){
                    result[i] = "B";
                }else{
                    result[i] = "A";
                }
            }
            System.out.println(result[i]);
        }
    }


}
