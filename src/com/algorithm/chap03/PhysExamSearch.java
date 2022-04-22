package com.algorithm.chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {

    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString(){
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhyscData> HIGHT_ORDER= new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1:
                        (d1.height < d2.height)? -1 :0;
            }
        }

        public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();

        private static class VisionOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2){
                return (d1.vision < d2.vision) ? 1:
                        (d1.vision > d2.vision) ? -1:0;
                //음수 또는 0 이면 객체의 자리가 그대로 유지되고 양수인 경우에는 두 객체의 자리가 변경된다.-> 양수만 넘어오니까 변경? 그러면 height도 같은 로직인데 무너지 이상함
            }
        }

        //compare을 사용할 때 return AA.compare(d2, d1)  이렇게 줘야 내림차순으로 정렬된다고 하는데 위에값은 뭐지...흠,,,

    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            PhyscData[] x = {
                    new PhyscData("이나령", 162, 2.0),
                    new PhyscData("유지훈", 168, 1.8),
                    new PhyscData("김한결", 169, 1.7),
                    new PhyscData("홍준기", 171, 1.0),
                    new PhyscData("전서현", 173, 0.9),
                    new PhyscData("이호연", 174, 0.4),
                    new PhyscData("이수민", 175, 0.2),
            };

           /* System.out.println("몇 cm인 사람을 찾나요?");
            int height = sc.nextInt();
            int idx = Arrays.binarySearch(x,
                    new PhyscData("", height, 0.0),
                    PhyscData.HIGHT_ORDER);*/

            System.out.print("찾는 시력은：");
            double vision = sc.nextDouble(); // 키 값을 입력 받음
            int idx = Arrays.binarySearch(x, // 배열 x에서
                    new PhyscData("", 0, vision), // 키가 vision인 요소를
                    PhyscData.VISION_ORDER // VISION_ORDER를 사용하여 검색
            );

            if (idx < 0) {
                System.out.println("그런 요소 없음");
            } else {
                System.out.println("x["+idx+"]");
                System.out.println("찾은 데이터 : "+x[idx]);
            }
        }




}
