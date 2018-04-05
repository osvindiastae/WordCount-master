package com.techtest.ctm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount{

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
			
		  Map<String, Integer> countByWords = new TreeMap <String, Integer>();
			    Scanner s;
				try {
					s = new Scanner(new File(".//book.txt"));
					 while (s.hasNext()) {				
						 s.useDelimiter("[\\.\\s+-]");
					        String next = s.next();
					        next = next.replaceAll("\\W", "");
					        next = next.toLowerCase();
					        
					  //      next = next.replaceAll(" ", "");
							
					        Integer count = countByWords.get(next);
					        if (count != null) {
					            countByWords.put(next, count + 1);
					        } else {
					            countByWords.put(next, 1);
					        }
					    }
							 
					    s.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	   	

				
			//the number of times each word appears is Prime Number.
			for(String key: countByWords.keySet())
			{
					System.out.println(key + " - "+  countByWords.get(key) + " - "+  isPrime(countByWords.get(key)));
			}
		
	}
	
	
	//checks whether an int is prime or not.
	static 	boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	
	
	

}
