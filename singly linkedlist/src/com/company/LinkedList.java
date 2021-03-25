package com.company;

public class LinkedList {

    Node head;

    public void insert(String givenData)
    {
        Node node = new Node();
        node.data = givenData;
        node.next = null;


        if (head ==null)
        {
            head  = node;
        }
        else{
            Node tempNode = head;

            //checks if reference is not null,
            while (tempNode.next!= null)
            {
                tempNode= tempNode.next;
            }
            tempNode.next = node;
        }
    }



        public void insertAt(int given_position, String given_data)
        {
            Node new_node = new Node();
            new_node.data = given_data;
            Node previous = head;     //temp which points to head

            int p = given_position;      //assiging given position to p
            int count =1;                //temp variable to keep track of number of nodes traversed

           //traversing through list to reach position
            while (count <p -1)
            {
                previous = previous.next;   //traverse previous by one node
                  count++ ;
            }
            Node current = previous.next;  //holds reference of the previous node
            new_node.next = current;         //new node references current node
            previous.next = new_node;    //previous node referencing new node

        }

        public void delete(int position)
        {
            Node previous = head;
            int count = 1;
            while (count <position -1)
            {
                previous = previous.next;
                count++;
            }
            Node current  = previous.next;
            previous.next = current.next;
            current.next = null;
        }
    //displaying nodes
    public void show()
    {
        Node tempNode = head;

        //printing list while transversing through
        System.out.print("\n////////////////////\n Playlist:\n");
        while (tempNode.next != null)
        {

            System.out.println("*" + tempNode.data);
            tempNode = tempNode.next;
        }
        System.out.print(tempNode.data);
        System.out.print("\n///////////////////////");

    }


    }







