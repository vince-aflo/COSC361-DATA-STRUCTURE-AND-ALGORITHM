package com.company;

public class DDLinkedlist {
    private Node head;              //declaring node, head
    private String name;                // declaring name String
    private int size;                   //declaring size of linked list

//constructor to assign values to variables
    public DDLinkedlist()
    {
        head = null;            //assigning null to first element
        name = "";              //assign empty string to  name
        size = 0;               // assign 0 to size
    }

    //adding element at te front of list
    public void addFront (String data)
    {
        //chacking for empty list
        if (head == null)
        {
            head = new Node(null, data, null);
        }
        else
        {//if list is not empty
            Node new_node = new Node(null, data, head);
            head.previous = new_node;
            head = new_node;
        }
        size++;         //update size by 1

    }
    //adding element at the end of list
    public void addEnd(String data)
    {
        //chacking for empty list
        if (head ==null)
        {
            head = new Node(null, data, null);
        }
        else {
            //if list is not empty
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node new_node = new Node(current, data, null);
            current.next = new_node;
        }
        size++; //updating size of list by 1
    }

    //adding at a specified position
    public void addAt(String data, int position)
    {
        //checking for empty list
        if (head == null){
            return;
        }
        Node current = head;

                int j=1;
                while (j<position){
                    current = current.next;
                    j++;
                }
                if(current.previous ==null){
                    addFront(data);
                }
                else{
                    Node new_node = new Node(current.previous, data, current);
                    new_node.previous=current.previous  ;
                    new_node.next = current;
                    current.previous.next =new_node;

                }
                size++;         //update size of list by 1
            }

    //displaying alll eleements in list
    public void print()
    {
        Node current  =  head;
        System.out.print("{");
        while (current !=null){
            System.out.print(current.Data()+ ", ");
            current = current.next;
        }
        System.out.println("}");
    }

    //deleting from front
    public void deleteFirst(){
        if (head == null){
            return;
        }
        head =head.next;
        head.previous = null;
        size --;
    }

    //deleting from end
    public void deleteEnd(){
        if (head ==null){
            return;
        }
        if (head.next ==null){
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    //deleting at position
    public void deleteAt(int position){
        if (head ==null){
            return;
        }
        if(position <1 || position >size){

            return;
        }
        Node current = head;
        int i = 1;
        while (i<position){
            current = current.next;
            i++;

        }
        if (current.next ==null){
            current.previous.next = null;
        }
        else if (current.previous == null){
            current = current.next;
            current.previous =null;
            head = current;
        }
        else{
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
    }
    public  int size(){
        return size;
    }       //returning size


    public boolean isEmpty()
    {
        return head == null;   //head returns true if first element is  null
    }




}
