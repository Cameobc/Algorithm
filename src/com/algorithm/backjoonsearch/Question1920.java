package com.algorithm.backjoonsearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Question1920 {

    public static void main(String[] args) {

        try {
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(sc.readLine());
            int[] ques = new int [n];

            String s = sc.readLine();
            StringTokenizer st = new StringTokenizer(s);

            for(int i=0;i<n;i++){
                ques[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(ques);

            int m = Integer.parseInt(sc.readLine());
            int[] ma = new int[m];
            s = sc.readLine();
            st = new StringTokenizer(s);

            for(int i=0;i<m;i++){
                ma[i]=Integer.parseInt(st.nextToken());
            }

            Arrays.sort(ma);

           for(int i=0;i<m;i++){
               int flag =0;
               int start =0;
               int last = m-1;

               do {
                   int middle = (start + last) / 2;

                   if(ma[i]==ques[middle]){
                       flag++;
                       break;
                   }else if(ques[middle]<ma[i]){
                        start = middle+1;
                   }else{
                        last = middle-1;
                   }
               } while (start<=last);

               System.out.println(flag!=0?"1":"0");
           }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
