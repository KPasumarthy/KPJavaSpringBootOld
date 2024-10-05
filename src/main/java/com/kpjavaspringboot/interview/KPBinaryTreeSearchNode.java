package com.kpjavaspringboot.interview;


import java.util.LinkedList;
import java.util.Queue;

public class KPBinaryTreeSearchNode {
    public static void main(String[] args) {

        //        ///KP : Binary Tree
        //        ///KP : Literature : https://www.geeksforgeeks.org/introduction-to-binary-tree/
        //        Operations On Binary Tree
        //        Following is a list of common operations that can be performed on a binary tree:
        //
        //        1. Traversal in Binary Tree
        //        Traversal in Binary Tree involves visiting all the nodes of the binary tree. Tree Traversal algorithms can be classified broadly into two categories, DFS and BFS:
        //
        //        Depth-First Search (DFS) algorithms: DFS explores as far down a branch as possible before backtracking. It is implemented using recursion.
        //        The main traversal methods in DFS for binary trees are:
        //
        //        Preorder Traversal (current-left-right): Visits the node first, then left subtree, then right subtree.
        //        Inorder Traversal (left-current-right): Visits left subtree, then the node, then the right subtree.
        //                Postorder Traversal (left-right-current): Visits left subtree, then right subtree, then the node.
        //        Breadth-First Search (BFS) algorithms: BFS explores all nodes at the present depth before moving on to nodes at the next depth level.
        //        It is typically implemented using a queue. BFS in a binary tree is commonly referred to as Level Order Traversal.
        //
        //                Below is the implementation of traversals algorithm in binary tree:
        //
        //         2. Inserting elements means add a new node into the binary tree.
        //         As we know that there is no such ordering of elements in the binary tree, So we do not have to worry about the ordering of node in the binary tree.
        //         We would first create a root node in case of empty tree. Then subsequent insertions involve iteratively searching for an empty place at each level of the tree.
        //         When an empty left or right child is found then new node is inserted there. By convention, insertion always starts with the left child node.
        //
        //        3. Searching in Binary Tree
        //        Searching for a value in a binary tree means looking through the tree to find a node that has that value. Since binary trees do not have a specific order like binary search trees, we typically use any traversal method to search. The most common methods are depth-first search (DFS) and breadth-first search (BFS). In DFS, we start from the root and explore the depth nodes first. In BFS, we explore all the nodes at the present depth level before moving on to the nodes at the next level. We continue this process until we either find the node with the desired value or reach the end of the tree. If the tree is empty or the value isn’t found after exploring all possibilities, we conclude that the value does not exist in the tree.
        //
        //        Here is the implementation of searching in a binary tree using Depth-First Search (DFS)


        // KP : Debug Print
        System.out.println("KP : KPBinaryTree - com.kpjavaspringboot :  Binary Search Tree : Breadth First Search (BFS) : main()");

        //        // Creating the tree
        //        Node root = new Node(2);
        //        root.left = new Node(3);
        //        root.right = new Node(4);
        //        root.left.left = new Node(5);
        //
        //
        //        System.out.print("In-order DFS: ");
        //        inOrderDFS(root);
        //        System.out.print("\nPre-order DFS: ");
        //        preOrderDFS(root);
        //        System.out.print("\nPost-order DFS: ");
        //        postOrderDFS(root);
        //        System.out.print("\nLevel order: ");
        //        BFS(root);
        //


        // KP : Debug Print
        System.out.println("KP : KPBinaryTree - com.kpjavaspringboot :  Binary Search Tree : Insert Node : main()");


        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);

        System.out.print("Inorder traversal before insertion: ");
        inorder(root);
        System.out.println();

        int key = 6;
        root = insert(root, key);

        System.out.print("Inorder traversal after insertion: ");
        inorder(root);
        System.out.println();

        int value = 5;
        if (searchDFS(root, value))
            System.out.println(
                    value + " is found in the binary tree");
        else
            System.out.println(
                    value + " is not found in the binary tree");


    }

    // Function to insert a new node in the binary tree
    static Node insert(Node root, int key) {
        if (root == null) return new Node(key);

        // Create a queue for level order traversal
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            // If left child is empty, insert the new node here
            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else {
                q.add(temp.left);
            }

            // If right child is empty, insert the new node here
            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else {
                q.add(temp.right);
            }
        }
        return root;
    }

    // In-order traversal
    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Function to search for a value in the binary tree
    // using DFS
    static boolean searchDFS(Node root, int value){
        // Base case: If the tree is empty or we've reached
        // a leaf node
        if (root == null) return false;

        // If the node's data is equal to the value we are
        // searching for
        if (root.data == value) return true;

        // Recursively search in the left and right subtrees
        boolean left_res = searchDFS(root.left, value);
        boolean right_res = searchDFS(root.right, value);

        return left_res || right_res;
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
