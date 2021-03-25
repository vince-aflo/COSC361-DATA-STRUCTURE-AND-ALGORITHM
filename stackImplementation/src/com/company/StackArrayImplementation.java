/**
 * author:  VINCENT AFLO
 * program: STACK IMPLEMENTATION OF THE UNDO COMMAND IN TEXT EDITORS
 *
 * */


package com.company;
import java.util.*;

public class StackArrayImplementation {
    public static Scanner input = new Scanner(System.in);     //create object of scanner class
    public static String undo;     //variable to undo process
    int top;    			  //declare top element in stack
    int size;	             //declare the size of stack
    String [] stack;      	//declare stack array



    //contructor to assign the variable's values
    StackArrayImplementation(){

        size = 5;          //assigning value to size
        top=-1;		   //assign last element value to top variable
        stack = new String [size];  //creating stack array with given size
    }



    /**
     * THE PUSH METHOD
     * used to insert elements into the stack
     * */
    public String push(String data) {

        //first checking if stack is full
        if (top== size-1) {
            System.out.println("Stack is full");   //display message
        }

        return stack[++top] = data;  //returning current stack
    }

    /**
     * THE POP ELEMENT
     * used to remove top elements from stack
    **/
    public String pop() {
        //first checking if stack is empty
        if (top== 0) {
            System.out.println("Stack is empty");   //display message
            return null;                            //exiting system  if stack is empty
        }

        System.out.println("\n" + stack[top--] + " popped out");       //displaying element popped out
        stack[++top] = null;                                     //setting popped element to null


        return stack[top];              //returning current stack
    }

    /**
     * THIS METHOD DISPLAYS ALL ELEMENTS IN THE STACK
    * */
    public void show(){

        System.out.print("[");

        //travelling through all the elements and displaying them(using the variable j)
        for(int j=0; j<= size-1; j++){

            System.out.print( stack[j] );

            if (j<size-1){              //setting comma punctuation only between elements of the stack
                System.out.print(", ");
            }}

        System.out.print("]");

    }

    /**
     * THE PEEK METHOD
     * returns top element to the method */
    public String peek ()
    {
        //checking for empty stack
        if (top < 0){
            System.out.println("Stack is empty");
            System.exit(1);
        }
        return stack[top];
    }

    /**
     * UNDO PROMPT METHOD
     *  used to prompt user to enter z to undo*/
    public static void  undoPrompt(){
        System.out.println("Press z if you want to undo ");
        undo = input.nextLine();         //accepting user input

    }


    public static void main(String[] args) {

        //creating an object of stack class called "stack"
        StackArrayImplementation stack = new StackArrayImplementation();

        //insert elements
        stack.push("First element");
        stack.push("second element");
        stack.push("third element");
        stack.push("fourth element");
        stack.push("fifth element");

        System.out.println("--------------------------------------------");
        System.out.println("WELCOME TO THE STACK IMPLEMENTATION OF UNDO");
        System.out.println("--------------------------------------------\n");

        //displaying initial set of elements
        System.out.println("INITIAL STACK :");
        stack.show();
        System.out.print("\n\n"); //jump next two lines

        // PROMPTING USER TO UNDO
        undoPrompt();              //calling the undoPrompt method

        //validating input
        if (undo.equalsIgnoreCase("z"))
        {
            //performing pop operation on stack
            stack.pop();

            //displaying stack after popping
            System.out.println("\nStack after popping");
            stack.show();



            //validating input
            if(undo.equalsIgnoreCase("z"))


            //jump next two lines
            System.out.print("\n\n");


        }
        else{
            System.out.println("Wrong Input, Try again");   //displaying error message after user enters wrong input
            undoPrompt();                                   //prompting user again
        }






    }
}
