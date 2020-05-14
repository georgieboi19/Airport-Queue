/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airportqueue;

/**
 *
 * @author w1667474
 */
public class Passenger {
    
    private String firstName;
    private String surname;
    private int secondsInQueue;
   
    public Passenger(){
        secondsInQueue = 0;
        firstName = "";
        surname = "";
    }
    
    public String getName(){
        return firstName + " " + surname;
    }
    
    public void setName(String fName, String sName){
        firstName = fName;
        surname = sName;
    }
    public int getSecondsInQueue(){
        return secondsInQueue;
    }
    
    public void setSecondsInQueue(int sec){
        secondsInQueue = sec;
    }
    public void display(){
        
    }       
}
