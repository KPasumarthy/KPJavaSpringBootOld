package com.kpjavaspringboot.interview;


import java.util.LinkedList;
import java.util.Queue;

public class KPBinaryTreeBFSDFS {
    public static void main(String[] args) {

        //        ///KP : Binary Tree
        //        ///KP : Literature : https://www.geeksforgeeks.org/introduction-to-binary-tree/
        //        Operations On Binary Tree
        //        Following is a list of common operations that can be performed on a binary tree:
        //
        //        1. Traversal in Binary Tree
        //        Traversal in Binary Tree involves visiting all the nodes of the binary tree. Tree Traversal algorithms can be classified broadly into two categories, DFS and BFS:
        //
        //        Depth-First Search (DFS) algorithms: DFS explores as far down a branch as possible before backtracking. It is implemented using recursion. The main traversal methods in DFS for binary trees are:
        //
        //        Preorder Traversal (current-left-right): Visits the node first, then left subtree, then right subtree.
        //        Inorder Traversal (left-current-right): Visits left subtree, then the node, then the right subtree.
        //                Postorder Traversal (left-right-current): Visits left subtree, then right subtree, then the node.
        //        Breadth-First Search (BFS) algorithms: BFS explores all nodes at the present depth before moving on to nodes at the next depth level. It is typically implemented using a queue. BFS in a binary tree is commonly referred to as Level Order Traversal.
        //
        //                Below is the implementation of traversals algorithm in binary tree:


        // KP : Debug Print
        System.out.println("KP : KPBinaryTree - com.kpjavaspringboot :  Binary Search Tree : Breadth First Search (BFS) : main()");

        // Creating the tree
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);


        System.out.print("In-order DFS: ");
        inOrderDFS(root);
        System.out.print("\nPre-order DFS: ");
        preOrderDFS(root);
        System.out.print("\nPost-order DFS: ");
        postOrderDFS(root);
        System.out.print("\nLevel order: ");
        BFS(root);

    }

    // In-order DFS: Left, Root, Right
    static void inOrderDFS(Node node) {
        if (node == null) return;
        inOrderDFS(node.left);
        System.out.print(node.data + " ");
        inOrderDFS(node.right);
    }

    // Pre-order DFS: Root, Left, Right
    static void preOrderDFS(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrderDFS(node.left);
        preOrderDFS(node.right);
    }

    // Post-order DFS: Left, Right, Root
    static void postOrderDFS(Node node) {
        if (node == null) return;
        postOrderDFS(node.left);
        postOrderDFS(node.right);
        System.out.print(node.data + " ");
    }

    // BFS: Level order traversal
    static void BFS(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }


}
