package p3Opdrachten;

import java.util.Scanner;
import java.lang.Math;
public class Opdracht231B {
	public static void main(String[] args) {

			String[] w = {"anders", "actief", "bossen", "eerder"};
			String woord = w[(int)(Math.random() * w.length)];
			

			char hint1 = woord.charAt(0);
			char hint2 = woord.charAt(1);
			char hint3 = woord.charAt(2);
			char hint4 = woord.charAt(3);
			char hint5 = woord.charAt(4);
			
			
			System.out.println("raad het zes letter woord! U heeft vijf pogingen.");		
			System.out.println("Hint: " + hint1 + "-----");
			
			Scanner inputscanner = new Scanner(System.in);
			String input = inputscanner.nextLine();
			
			if(input == woord) {
			System.out.print("goed"); }
			
			else {
				System.out.println("Fout, raad opnieuw! 4 pogingen over.");
				System.out.println("Hint: " + hint1 + hint2 +"----" );
				
				String input1 = inputscanner.nextLine();
				if(input1 == woord) {
					System.out.print("goed");}
				
				else {
					System.out.println("Fout, raad opnieuw! 3 pogingen over.");
					System.out.println("Hint: " + hint1 + hint2 + hint3 + "---" );
					
					String input2 = inputscanner.nextLine();
					if(input2 == woord) {
						System.out.print("goed"); }
					
						else {
							System.out.println("Fout, raad opnieuw! 2 pogingen over.");
							System.out.println("Hint: " + hint1 + hint2 + hint3 + hint4 + "--" );
							
							String input3 = inputscanner.nextLine();
							if(input3 == woord) {
								System.out.print("goed");
							}
							
								else {
									System.out.println("Laatste kans, raad opnieuw! 1 poging over.");
									System.out.println("Hint: " + hint1 + hint2 + hint3 + hint4 + hint5 + "-" );
									
									String input4 = inputscanner.nextLine();
									if(input4 == woord) {
										System.out.print("goed");}
									
										else {
											System.out.print("Fout, u heeft verloren. Het woord was: " + woord);
										}}}}}}}