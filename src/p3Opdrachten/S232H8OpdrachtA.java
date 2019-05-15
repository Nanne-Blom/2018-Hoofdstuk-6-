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
	ArrayList<Integer> Nummers = new ArrayList<Integer>();
		static void usingRandomClass() {
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(10) + 1;
			System.out.println("Random number generated is : " + randomInt);
			 ArrayList.add(randomInt);
		   

		    System.out.println(Nummers);
			
		}
		
}

