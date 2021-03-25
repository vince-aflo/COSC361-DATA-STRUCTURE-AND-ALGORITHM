package com.company;

//Creating node class
public class Node {
    String data;        //declaring data variable
    Node previous;      //declaring node called previous
    Node next;          //declaring next node


    //Node constructor to assign to assign values to variables
    public Node(String data)
    {
        previous =null;                 //assign previous variable to null
        this.data = data;               //assign given data to data
        next = null;                    //assign null to next
    }

    //creating node class with arguments
    public Node(Node previous, String data, Node next)
    {
        this.previous = previous;                   //assign previous reference to previous
        this.data = data;                           //assign data reference to data
        this.next = next;                       //assign next reference to next
    }

    //creating data classs
    public String Data()
    {
        return data;                //return data to class
    }

}
