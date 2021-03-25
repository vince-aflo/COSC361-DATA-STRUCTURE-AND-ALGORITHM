package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

	String song;
	int position, listNum;
	Scanner input = new Scanner(System.in);

	LinkedList list = new LinkedList();






	//INSERTING INTO LINKEDLIST
	list.insert("Stairway to Heaven by Led Zappelin");
	list.insert("One by Metallica");
	list.insert("Comfortably Numb by Pink Floyd");
	list.insert("Lose Yourself by Eminen");
	list.insert("November rain by Guns N Roses");

		System.out.println("YOUR INTTIAL LIST");
        //displaying list
        list.show();
		System.out.println("\n");		//next line


    //INSERTING AT A POSITION
	list.insertAt(5,"Free Bird by Lynyrd Skynyd");
	System.out.println("AFTER INSERTION AT POSITION 5");
		System.out.println("ITEM INSERTED: Free Bird by Lynyrd Skynyd");
	list.show();

		System.out.print("\n");		//next line


    //deleting node at position 2
    list.delete(2);
		System.out.println("AFTER DELETING One by Metallica, Comfortably Numb by Pink Floyd" );
		list.show();



    }
}
