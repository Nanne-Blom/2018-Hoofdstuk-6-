package p3Opdrachten;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections; 
import java.lang.Math; 
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;
import p3Opdrachten.QuickSort;
public class S232H8OpdrachtA {
	public static void main(String [] args) {
	 
			usingRandomClass();
		}
	static int a;
	static ArrayList<Integer> Nummers = new ArrayList<>();
	
	static void usingRandomClass() {
			Random randomGenerator = new Random();

			
			

	 int a = 0;
			while (a < 100000) {
				int randomInt = randomGenerator.nextInt(10000) + 1;
	Nummers.add(randomInt);
	a ++;

			}		
			System.out.print(Nummers);


		    
			
	}
	}

