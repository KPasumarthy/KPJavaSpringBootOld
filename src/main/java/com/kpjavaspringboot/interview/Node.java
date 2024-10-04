package com.kpjavaspringboot.interview;

public class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;

        System.out.println("KP : KPJavaInterview - com.kpjavaspringboot :  Binary Search Tree : Node : " + d);

    }
}