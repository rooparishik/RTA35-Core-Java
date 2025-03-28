package com.roopa.learning.core.collections.linkedlist;

public class CustomLinkedList {

    static class Node {
        int data;
        Node next;

       public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            // if head is null, then list is empty
           // then new node will become head of the list
            head = newNode; // head -> newNode
        }else {
            // if head is not null, then there are elements in the list,
            // So traverse till the last node and add new node
            Node temp = head; // temp node is required to traverse till the end of the list
            // temp.next is null means, it is the last node
            // temp.next is not null means, it is not the last node
            // So traverse till the last node
            //temp->head
            while (temp.next != null){ // traverse till the last node
                temp = temp.next;
                // temp -> next node
                // temp -> 10 -> 20 -> 30 -> 40 -> 50 -> null
            }
            temp.next = newNode; // temp -> next -> newNode
        }
    }

    public void printList() {
        Node temp = head;
        System.out.print("LinkedList: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

        // Delete node by value
        public void deleteNodeByValue(int value){
        // if list is empty,nothing to delete, just return
           if(head == null){
               System.out.println("List is empty");
               return;
           }
            // if head or first node is  to be deleted, then make next node as head
            // head -> 10 -> 20 -> 30 -> 40 -> 50 -> null
            // delete 10
            // head -> 20 -> 30 -> 40 -> 50 -> null
           if(head.data == value) {
               head = head.next;
                return;
           }
           // if node to be deleted is not head node,
            // then traverse till the node to be deleted
            // and make previous node point to next node of the node to be deleted
            // head -> 10 -> 20 -> 30 -> 40 -> 50 -> null
            // delete 30
            // head -> 10 -> 20 -> 40 -> 50 -> null
            Node temp = head;
           while(temp.next != null && temp.next.data != value){
               temp = temp.next;
           }

           if(temp.next == null){
               System.out.println("Node not found");
               return;
           }
           // if the node to be deleted is found
            // LL before deletion : head -> 10 -> 20 -> 30 -> 40 -> 50 -> null

                    temp.next = temp.next.next; // head -> 10 -> 20 -> 40 -> 50 -> null

        }

        public boolean contains(int value){
           Node temp = head;
              while(temp != null){
                if(temp.data == value){
                     return true;
                }
                temp = temp.next;
              }
                return false;
        }

        // Add first
    public void addFirst(int data){
        Node newNode = new Node(data); // create a new node // newNode -> 5 // 5 -> null
        if(head == null){
            // if list is empty, then new node will become head of the list
            head = newNode;
        }else {
            // if list is not empty, then new node will become head of the list
            // if list is already having elements like head -> 10 -> 20 -> 30 -> 40 -> 50 -> null
            newNode.next = head; // newNode -> head -> 10 -> 20 -> 30 -> 40 -> 50 -> null
            head = newNode; // head -> newNode -> 10 -> 20 -> 30 -> 40 -> 50 -> null
        }
    }


    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add(10);
        customLinkedList.add(20);
        customLinkedList.add(30);
        customLinkedList.add(40);
        customLinkedList.add(50);
        customLinkedList.printList();

        customLinkedList.deleteNodeByValue(10);
        customLinkedList.printList();

        customLinkedList.deleteNodeByValue(40);
        customLinkedList.printList();

        System.out.println("Contains 20: " + customLinkedList.contains(20));
        System.out.println("Contains 40: " + customLinkedList.contains(40));
        System.out.println("Contains 50: " + customLinkedList.contains(50));

        customLinkedList.addFirst(5);
        customLinkedList.printList();
    }


}
