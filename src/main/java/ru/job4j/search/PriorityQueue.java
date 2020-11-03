package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();


    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (task < element.getPriority()) {
                break;
            }
            else  {
                index++;
            }
        }
        this.tasks.add(index, task);
    }


    public Task take() {
        return tasks.poll();
    }


    public static void main(String[] args) {
        PriorityQueue one = new PriorityQueue();
        one.put(new Task("Read", 1));
        one.put(new Task("Draw", 2));
        one.take();
    }
    }
