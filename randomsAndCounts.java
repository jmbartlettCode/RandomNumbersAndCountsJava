/*
 * Josh Bartlett
 * Purpose: Generate 100 random ints between 0 and 9 and 
 *          display the count for each number
 * May 26, 2019
 * Bellevue University
 * randomsAndCounts.java
 */

public class randomsAndCounts {
    public static void main(String[] args){
        
        // Declare and create an int array called counts with a length of 10
        int[] counts = new int[10];
        
        // for loop to generate 100 random numbers between 0 and 9 
        // and add 1 to the corresponding element each time that 
        // number is gerenated
        for(int i = 0; i < 100; i++){
            counts[(int) (Math.random() * 10)] ++;
        }
        
        // Labels for the output
        System.out.println("Number | Count");
        
        // for loop to print the number and count   
        for(int i = 0; i < counts.length; i++){
            System.out.println("   " + i + "       " + counts[i]);
        }
    }
}
