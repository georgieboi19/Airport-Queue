/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airportqueue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author w1667474
 */
public class Queue {

    private int end;
    private int front;
    private int maxStayInQueue;
    private Passenger[] queueArray;

    public Queue() {
        end = 0;
        front = 0;
        queueArray = new Passenger[8];
        for (int i=0; i<queueArray.length;i++){
            queueArray[i] = new Passenger();
        }
        
    }

    public void add() {
        String firstName;
        String surname;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        firstName= input.next();
        System.out.println("Enter Surname: ");
        surname= input.next();
        queueArray[end].setName(firstName, surname); 
        end++;
    }

    public void remove() {
        if (end > front) {
            System.out.println("Item taken: " + queueArray[front].getName());
            front++;
        } else {
            System.out.println("Empty queue");
        }
    }

    public void display() {
        System.out.println("Queue display: ");
        for (int look = front; look < end; look++) {
            System.out.println(" " + queueArray[look].getName());
        }
        System.out.println("");
    }
    
    public void getMaxSay(){
        
    }
    
    public void isEmpty(){
        
    }
    public void isFull(){
        
    }
    
    public void saveData(){
                File fileName = new File("Queue.txt");
        try {
            FileWriter fw = new FileWriter(fileName);
            try (BufferedWriter output = new BufferedWriter(fw)) {
                for (int i = 0; i < queueArray.length; i++) {
                    output.write(queueArray[i].getName());
                    output.newLine();
                }
                output.close();
                System.out.println("Save completed");
            }
        } catch (IOException e) {
            System.out.println("Broken");
        }
    }
}
