package com.revature;

import java.util.LinkedList;

public class Stack {
    private Node head;

    public Stack() {
        head = null;
    }

    public void push(Integer entry) {
        head = new Node(entry, head);
    }

    public Integer pop() {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            Integer value = head.value;
            head = null;
            return value;
        }
        Node currentNode = head;
        Node previousNode = head;
        while (currentNode.next != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        previousNode.next = null;
        return currentNode.value;
    }

    private class Node {
        public Integer value;
        public Node next;

        public Node(Integer value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
