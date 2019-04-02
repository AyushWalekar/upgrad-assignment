/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanager;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * StudentQueue class maintains the Queue of student objects.
 * @author ayush
 */
public class StudentQueue {
    private static final Queue<Student> STUDENT_QUEUE = new PriorityQueue<>();
    
    /**
     * Add new Student to the Queue.
     * @param s 
     */
    public static void enter(Student s){
        STUDENT_QUEUE.add(s);
    }
    
    /**
     * Removes student from the Queue based on priority.
     */
    public static void serve(){
        STUDENT_QUEUE.poll();
    }

    /**
     * Prints the list of remaining students in the Queue.
     * If the Queue is Empty it prints "EMPTY".
     */
    public static void printList() {
        if(STUDENT_QUEUE.isEmpty()){
            System.out.println("EMPTY");
            return;
        }
        STUDENT_QUEUE.stream().forEach((st) -> {
            System.out.println(st.name + " ");
//            System.out.println(st.name + " " + st.cgpa + " " + st.tokenNumber);
        });
    }
}