package com.roopa.learning.core.collections.linkedlist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBasicMethods {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(" Initial List: " + list);

        list.addFirst(5);
        System.out.println("List after adding element at first position: " + list);

        Deque<Integer> deque = new LinkedList<>();
        deque.offer(20);
        deque.offer(30);
        deque.offer(40);
        System.out.println(" Initial Deque: " + deque);

        deque.offerFirst(10);
        deque.offerLast(50);
        System.out.println("Deque after adding elements at first and last positions: " + deque);

    }
}
