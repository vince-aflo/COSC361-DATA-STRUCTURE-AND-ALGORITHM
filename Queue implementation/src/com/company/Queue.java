package com.company;


//CREATING QUEUE CLASS AND Parameter OF GENERICS
public class Queue<T>
{
    private Node<T> front;      //declaring first node
    private Node<T> rear;       //declaring last node

    private int length;         //declaring length variable which gives the size of the queue

    //CREATING NODE CLASS
  private static  class Node<T>
    {
        private final T data;   //declaring variable data which gets value
        private Node<T> next;   //declaring variable next for referencing


        //Constructor to initialize variables
        public Node (T data)
        {

            this.data = data;       //assign gotten data to variable data
            this.next = null;       //assign next node to null
        }

    }

    //INSERTING METHOD
    public void enQueue(T data) {

      //checking for empty queue
        if (front == null)
        {
            rear=  new Node <T>(data);       //create new node and assign to last node
            front =  rear;                  //assign last node to first.
        }else
            //if queue is not empty
        {
            rear.next = new Node <T>(data);     //adding node at the end of the queue
            rear= rear.next;                    //rear increments by 1
        }
        length++;        //size of queue increases
    }

    //DELETING FROM QUEUE METHOD
    public T deQueue(){

      //if queue is not empty
        if (front != null) {
            T result  = front.data;     //assign first value to new variable result
            front  = front.next;        //front points to following node
            length --;                  //size of queue decrements by 1
            return result;
        }
        //if queue is empty
        return null;        // exit system
    }
    //size returning method
    public int size(){
        return length;
    }

    //QUEUE DISPLAYING METHOD
    public void displayQueue(){
        Node <T> currentNode = front;       // assign first to currentNode
        while (currentNode!= null){         //if queue is not empty
            System.out.print(currentNode.data + " ");   //display node data
            currentNode = currentNode.next;         //assign next node to current node


            //display asci symbol after non-last items only
            if(currentNode !=rear.next){
                System.out.print(" <=== ");
            }
        }
    }
}

