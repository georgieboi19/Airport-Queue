/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airportqueue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author w1667474
 */
public class AirportQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Passenger[] passengers = new Passenger[30];
        for (int i=0; i<passengers.length;i++){
         passengers[i] = new Passenger();
        }
        Queue q = new Queue();
        String selection;
        System.out.println("Welcome to the airport queue system");
        
        do{
        System.out.println("Please select a menu item");
        System.out.println("A to add a passenger to the passengerQueue");
        System.out.println("V to view the passengerQueue");
        System.out.println("D Delete passenger from the passengerQueue");
        System.out.println("S Store passengerQueue data into a plain text file");
        System.out.println("L Load passengerQueue data back from the file into the passengerQueue");
        System.out.println("R Run the simulation and produce report");
        System.out.println("E to exit the programe");
        
        Scanner in = new Scanner(System.in);
        selection = in.next();
        
        
        switch (selection) {
            case "A":
               q.add();
                break;
            case "V":
                q.display();
                break;
            case "D":
                q.remove();
                break;
            case "R":
                runSimulation(passengers);
                /*
                Read in the passenger file into the passengers array.
Repeat until the passenger queue is empty
Randomly generate a number of arrivers using 1 six sided die (as per your
workshop). This will represent how many passengers join the queue.
Add that number of passengers from the passengerArray into the passengerQueue.
Randomly generate a processing delay using 3 six sided dice (as per your workshop).
This will represent how many seconds it takes to check the boarding ticket and let
the next passenger board the plane.
Add the processing delay to each passenger already in the queue.
Remove the next passenger from the queue.
End repeat.
Produce a report and output to the screen, and also output to a file called ‘report.dat’.
*/
                break;
            case "S":
                q.saveData();
                break;
            default:
                System.out.println("Please enter the correct menu item");
        }
        
    } while (selection !="E");
    }
    
    public static void runSimulation(Passenger[] p){
        try {
            BufferedReader in = new BufferedReader(new FileReader("passengers.dat"));
            String line;
            int i = 0;
            while (((line = in.readLine()) != null) && i < p.length) {
                p[i].setName(line, line);
                i++;
            }
            in.close();
            for (i = 0; i < p.length; i++) {
                System.out.println(p[i].getName());
            }
        } catch (IOException e) {
            System.out.println("Broken");

        }
        
        

    }
}
    

