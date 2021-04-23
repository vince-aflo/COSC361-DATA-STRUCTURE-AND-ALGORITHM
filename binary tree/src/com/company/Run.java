package com.company;

public class Run {

    public static void main(String[] args)  {
        //create a BST object
        BinarySearchTree tree = new BinarySearchTree();

        System.out.println("-------------------");
        System.out.println("BINARY SEARCH TREE");
        System.out.println("-------------------\n");


        //insert data into tree
        tree.insert(84);
        tree.insert(30);
        tree.insert(9);
        tree.insert(30);
        tree.insert(80);
        tree.insert(99);

        //print the tree
        System.out.println("INITIAL TREE:");
        tree.inorder();

        System.out.println("\nIMPLEMENTING DELETE");
        System.out.println("----------------------");

        //delete leaf node
        System.out.println("The tree after deleting 30(leaf node):");
        tree.deleteKey(30);
        tree.inorder();

        //delete the node with one child
        System.out.println("\nThe tree after deleting 80 (node with 1 child):");
        tree.deleteKey(80);
        tree.inorder();

        //delete node with two children
        System.out.println("\nThe tree after deleting 84 (Node with two children):");
        tree.deleteKey(84);
        tree.inorder();


        //search a key in the tree
        boolean ret_val = tree.search (99);
        System.out.println("\n\nKey 99 found in tree:" + ret_val );
        ret_val = tree.search (30);
        System.out.println("\nKey 30 found in tree:" + ret_val );
    }}