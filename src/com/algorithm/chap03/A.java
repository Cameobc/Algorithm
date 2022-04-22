package com.algorithm.chap03;

public class A implements Comparable<A> {

    @Override
    public int compareTo(A c) {
        return 0;
    }

    public boolean equals(Object object) {
        return true;
    }
}
