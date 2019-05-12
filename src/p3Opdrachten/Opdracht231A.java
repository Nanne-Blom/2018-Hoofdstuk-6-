package p3Opdrachten;

import java.util.Scanner;
import java.lang.*; 
import java.io.*; 
import java.util.*; 
public class Opdracht231A {

	public static void main(String[] args) {
		

		System.out.println("Type een zin: ");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine().toUpperCase();
		new StringBuilder("username").reverse().toString();
		
        String input = username; 
        
        StringBuilder username1 = new StringBuilder(); 
  
        username1.append(input); 
  
        username1 = username1.reverse(); 
  
        System.out.println("Resultaat " + username1);
		
	}

}