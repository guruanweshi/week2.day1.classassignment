package wek2.day1;

import java.util.Iterator;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class CharOccurance {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		
					String str = "welcome to chennai";

					// declare and initialize a variable count to store the number of occurrences
					int count=0;
					
					// convert the string into char array
					char[] arr = str.toCharArray();
						
					//get the length of the array
				
						
					// traverse from 0 till the array length 
					for (int i=0;i<arr.length; i++) {
						// Check the char array has the particular char in it
						if (arr[i] == 'e'){
							
							count++;
						}
							
												
					}
						
					System.out.println("Number of occurrence of 'e' is "+ count);
							 
						
						// print the count out of the loop
							

	}

}
