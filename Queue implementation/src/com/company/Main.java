package com.company;

/***
 * aurthor: VINCENT AFLO
 * program: Queue implementation in Vehicles passing through toll booth
 *          this program uses the first come first serve implementation, that is,
 *          the first car nearest to the toll booth gets serve first followed by the rest respectively.
 */


public class Main {

    public static void main(String[] args) {

        //creating an object of the class Queue
        Queue queue = new Queue();

        //INSERTING VALUES INTO QUEUE
        queue.enQueue("Corolla X");
        queue.enQueue("Camry ");
        queue.enQueue("Elantra");
        queue.enQueue("Sonata");
        queue.enQueue("Yaris");
        queue.enQueue("Toyota");

        //display welcome message
        System.out.println("-------------------------------------------");
        System.out.println("WELCOME TO VALLEY VIEW STREET 1 TOLL BOOTH. \nKindly pay your toll and remember to drive safely");
        System.out.println("-------------------------------------------\n");


        //DISPLAYING SIZE AND VALUES OF THE INITIAL QUEUE
        System.out.println("Initial number of car in the queue: " + queue.size());
        System.out.println("\nLIST OF CARS IN THE QUEUE: ");
        queue.displayQueue();
        System.out.println("\n");     //next line

        //DELETING ITEM FROM QUEUE AND DISPLAY
        System.out.println( queue.deQueue() + " pays toll and leaves toll booth\n");

        //DISPLAYING CURRENT SIZE OF QUEUE
        System.out.println("Current number of cars in queue " + queue.size());

        //DISPLAYING QUEUE AFTER ITEM IS DELETED IS FROM THE QUEUE
        System.out.println("\nLIST OF CARS LEFT IN QUEUE: ");
        queue.displayQueue();

        System.out.println("\n");   //next line
    }
}
