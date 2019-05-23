package p3Opdrachten;
import java.util.ArrayList;
import java.lang.Math; 
import java.util.Random;


public class S232H8OpdrachtA {
	final static int maxAantal=100000;
	final static int laagsteWaarde=1;
	final static int hoogsteWaarde=10000;
	static ArrayList<Integer> nummerLijst = new ArrayList<>();


	public static void main(String [] args) {

		nummerLijst =usingRandomClass(maxAantal, laagsteWaarde, hoogsteWaarde);
	}






	public static ArrayList<Integer> usingRandomClass(int maxAantal, int laagstewaarde, int hoogstewaarde) {
		ArrayList<Integer> lijst = new ArrayList<>();
		
		Random randomGenerator = new Random();


		for (int i =0;i<=maxAantal;i++) {
			
			lijst.add(    (int)( Math.random()*(hoogsteWaarde-laagsteWaarde))+laagsteWaarde    );
	
			System.out.println(""+ (int) lijst.get(i)); 		
		}

		
		return lijst;
	}
	
	
	 // EEN ARRALIST OMZETTEN NAAR EEN ARRAY
	  // LASTIG IS DAT HET ARRAY DUS EEN VAST AANTAL ELEMENTEN HEEFT EN EEN ARRAYLIST IN PRINCIOE NIET
	  // DAAROM WORDT DE SIZE VAN HET ARRAYLIST BEREKEND EN GEBRUIKT OM DE GROOTE VAN HET ARRAY TE BEPALEN
	  public static int[] convertertoArray(ArrayList list){
		  int lengte =list.size();
		  int tabel[] = new int[lengte];
		  
		  for (int i=0;i<lengte;i++) {
			//LET OP TYPECAST IS NOODZAKELIJK ZIE PRESENTATIE 
			tabel[i]=(int)list.get(i);  
		  }	 
		  //EEN ARRAY TERUG GEVEN
		  return tabel;
	  }
	
	
/*
		for( int bovengrens = tabelBubbleSorted.size()- 1; bovengrens >= 1; bovengrens-- ) {
			for( int index = 0; index < bovengrens; index++ ) {
				if( (int) tabelBubbleSorted.get(index) > (int)tabelBubbleSorted.get(index+1) ) {
  				int hulp = (int) tabelBubbleSorted.get(index);
  				tabelBubbleSorted.set(index,tabelBubbleSorted.get(index+1) );
  				tabelBubbleSorted.set(index+1, hulp);
				}
			}
		}
	
	*/
	

}