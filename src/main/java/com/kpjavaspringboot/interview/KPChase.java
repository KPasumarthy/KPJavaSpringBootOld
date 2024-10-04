package com.kpjavaspringboot.interview;


public class KPChase {
    public static void main(String[] args) {

        // KP : Debug Print
        System.out.println("KP : KPJavaInterview - com.kpjavaspringboot : main()");

        //someRecurisveFunction();

        ////Print the Left Nodes of a Binary Tree

        int key;
        Node left, right;

        // Initialize and allocate memory for tree nodes
        Node firstNode = new Node(2);
        Node secondNode = new Node(3);
        Node thirdNode = new Node(4);
        Node fourthNode = new Node(5);

        // Connect binary tree nodes
        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = fourthNode;


        ///Chase : Interview Implementation
        boolean flag = true;
        Node current = firstNode; //new Node("");
        System.out.println("KP : KPJavaInterview - com.kpjavaspringboot :  Binary Search Tree : Print Left Node ");
        System.out.println("KP : KPJavaInterview - com.kpjavaspringboot :  Binary Search Tree : Parent Node : " + current.data);


        do {

            ////System.out.println("KP : KPJavaInterview - com.kpjavaspringboot  : Binary Search Tree : Current Node : " + current.data);

            if (current != null) {

                if (current.left != null) {
                    int iLeftNodeId = current.left.data;
                    if (Integer.valueOf(iLeftNodeId) != 0)
                        System.out.println("KP : KPJavaInterview - com.kpjavaspringboot :  Binary Search Tree : Left Node : " + current.left.data);

                    current = current.left;
                }
            }
            else{
                System.out.println("KP : KPJavaInterview - com.kpjavaspringboot :  Binary Search Tree : Left Node : " + current.data);
                flag = false;
            }

        }
        while (flag);


    }

    static int recursiveCount = 0;

    static void someRecurisveFunction() {
        System.out.println("KP : KPJavaInterview - com.kpjavaspringboot Recursion : recursiveCount " + recursiveCount++);

        if (recursiveCount < 100) {
            someRecurisveFunction();
        }
    }

}
