package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        String[] elements = new String[]{"Smith", "Montessori", "Peralta", "House"};
        Queue<String> newQueue = new LinkedList<>();

        for (String element : elements) {
            newQueue.offer(element);
        }
        return newQueue;
    }

    public static void printAndEmptyQueue(Queue<String> queue) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {
        Queue<String> newQueue = createQueue();
        printAndEmptyQueue(newQueue);
    }

}
