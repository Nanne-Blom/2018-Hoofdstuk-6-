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
		

		for (int i = 0;i <= maxAantal;) {
			i++;
			lijst.add(    (int)( Math.random()*(hoogsteWaarde-laagsteWaarde))+laagsteWaarde    );
	System.out.print("aan");
		}
		
		for( int hoogsteWaarde = lijst.size()- 1; hoogsteWaarde >= 1; hoogsteWaarde-- ) {
			for( int index = 0; index < hoogsteWaarde; index++ ) {
				if( (int) lijst.get(index) > (int)lijst.get(index+1) ) {
  				int hulp = (int) lijst.get(index);
  				lijst.set(index,lijst.get(index+1) );
  				lijst.set(index+1, hulp);
  				
  				System.out.println(""+ (int) lijst.get(i)); 
				}
			}
		}
		return lijst;
		
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

		}
	
	*/
	

}