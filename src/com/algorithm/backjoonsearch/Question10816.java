package com.algorithm.backjoonsearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Question10816 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            int[] num1 = new int[n];

            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            for (int i = 0; i < n; i++) {
                num1[i] = Integer.parseInt(st.nextToken());
            }

            int m = Integer.parseInt(br.readLine());
            int[] num2 = new int[m];

            s = br.readLine();
            st = new StringTokenizer(s, " ");

            for (int i = 0; i < m; i++) {
                num2[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(num1);

            for(int i=0;i<m;i++){
                int temp =0;
                for(int j=0;j<n;j++){
                    if(num1[j]==num2[i]){
                        temp++;
                    }
                }
                System.out.print(temp +" ");
            }

        }catch (Exception e ){
            e.printStackTrace();
        }


    }


}
