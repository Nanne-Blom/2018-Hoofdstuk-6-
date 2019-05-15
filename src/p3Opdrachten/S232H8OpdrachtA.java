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
static int AAA;

	public static void main(String [] args) {
	
		ArrayList<Integer> arrayRandom = new ArrayList<Integer>(AAA);

		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		for (int i=0; i<AAA; i++)
		{
		    Integer r = rand.nextInt() % 256;
		    arrayRandom.add(r);
		}

			System.out.println(arrayRandom);
}
}
