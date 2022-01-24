import java.io.*;
import java.util.LinkedList;

public class linkedlist {

        //head of list
        Node head;


        // this will be a inner class and static
        // so that main class can access it

        static class Node{

            int data;
            Node next; // refers to next node

            Node(int var){
                data = var; // it will refer to the value of int data
                next = null; // the next value is null
            }

        }

        // linkedlist is the class name .. not an actual linked list

        public static linkedlist insert (linkedlist list, int var){

            // Create a new node with given data
            Node NewNode = new Node(var);
            NewNode.next = null;


            //set the value for the head of the first node
            // If the Linked List is empty,
            // then make the new node as head
            if(list.head == null){
                list.head = NewNode;
            }
            else {
                // Else traverse till the last node
                // and insert the new_node there
                Node LastNode = list.head;
                while(LastNode.next!=null){
                    LastNode = LastNode.next;
                }

                // Insert the new_node at last node
                LastNode.next = NewNode;
            }

            return list;
        }


        public static void printList(linkedlist list){

            Node CurrentNode = list.head;
            System.out.print("LinkedList :  ");
            while(CurrentNode!=null){
                //print data at current node
                System.out.println(CurrentNode.data + "test");

                // go to next node
                CurrentNode = CurrentNode.next;
            }
        }


    public static void main(String[] args)
    {
        /* Start with the empty list. */
        linkedlist list = new linkedlist();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        // Print the LinkedList
        printList(list);
    }

}

