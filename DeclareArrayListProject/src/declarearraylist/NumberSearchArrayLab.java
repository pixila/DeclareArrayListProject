package declarearraylist;

import java.io.BufferedReader; // Import BufferedReader class for reading text from a file
import java.io.FileReader; // Import FileReader class to read the file
import java.util.ArrayList; // Import ArrayList class to store the numbers
import java.util.Collections; // Import Collections class for sorting utilities

public class NumberSearchArrayLab { // Public class with the name NumberSearchArrayLab
    public static void main(String[] args) {   // Main method where the program execution begins
        // The path to the file on your local machine (adjusted as per your request)
        String fileName = "D:\\lab4.txt"; 

        // Declare an ArrayList to store Integer values found in the file
        ArrayList<Integer> numbers = new ArrayList<>(); 

        try {
            // Create a BufferedReader object to read the file line by line
            BufferedReader br = new BufferedReader(new FileReader(fileName)); 
            
            // Declare a String variable 'line' to hold each line of text as it's read
            String line;

            // Read each line of the file until there's no more content (readLine returns null)
            while ((line = br.readLine()) != null) { 
                
                // Split the current line into an array of words based on whitespace (spaces, tabs, etc.)
                String[] words = line.split("\\s+"); 

                // Loop through each word in the 'words' array
                for (String word : words) { 
                    try {
                        // Try to convert the current word into an integer
                        int number = Integer.parseInt(word); 

                        // If conversion is successful, add the number to the 'numbers' ArrayList
                        numbers.add(number); 
                    } catch (NumberFormatException e) { 
                        // If the word is not a valid number, catch the exception and ignore the word
                    }
                }
            }

            // Close the BufferedReader after all lines have been read to free up system resources
            br.close(); 

        } catch (Exception e) {
            // If any exception occurs during file reading or parsing, print the error message
            System.out.println("An error occurred: " + e.getMessage()); 
        }

        // Print the list of numbers before sorting to verify that numbers have been correctly extracted
        System.out.println("Numbers before sorting: " + numbers); 

        // Sort the numbers in the ArrayList in descending order (from biggest to smallest)
        Collections.sort(numbers, Collections.reverseOrder()); 

        // Print the sorted numbers to confirm that sorting was successful
        System.out.println("Numbers after sorting (largest to smallest): " + numbers); 
    }
}
