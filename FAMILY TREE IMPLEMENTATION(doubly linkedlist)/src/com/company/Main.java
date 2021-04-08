package com.company;

public class Main {

    public static void main(String[] args) {

        //creating object of DDLinkedlist class
        DDLinkedlist dll = new DDLinkedlist();

        //inserting values into the list
        dll.addEnd("Mr. Gilbert");
        dll.addEnd("Mrs. Jane");
        dll.addEnd("Mr. Dan");
        dll.addEnd("Mr. Timothy");

        // displaying initial list
        System.out.println("INITIAL LIST OF NAMES: ");
        dll.print();

        //next line


        //adding at the front
        dll.addFront("Mrs. Gifty");
        dll.addFront("Mr. Andrew");

        //display after inserting at the front
        System.out.println("\nLIST AFTER INSERTION AT THE FRONT: ");
        dll.print();

        //next line
        System.out.println("\n\n");

        //Adding at a specified positon
        dll.addAt("Miss Happy" , 2);
        System.out.println("List after adding at a  position " );
        dll.print();



    }
}
