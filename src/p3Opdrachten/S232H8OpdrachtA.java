package p3Opdrachten;
import java.util.ArrayList;
import java.lang.Math; 
import java.util.Scanner;

public class S232H8OpdrachtA {
	//	final static int maxAantal=0;
	final static int laagsteWaarde=0;
	final static int hoogsteWaarde=10000;
	static ArrayList<Integer> nummerLijst = new ArrayList<>();
	static ArrayList<Integer> gesorteerdNummerLijst = new ArrayList<>();


	public static void main(String [] args) {


		int maxAantal= leesGeheelGetal();
		nummerLijst =genereerArrayList(maxAantal, laagsteWaarde, hoogsteWaarde);
		gesorteerdNummerLijst=sorteerLijst(nummerLijst);
		//roep methode drukLijstAf aan ! input is de arraylist
		//roep de merhode sorteerlArraylist aan met als input een ongesorteerde arraylis en als return de gesorteerdelijst 
		//roep opnieuw de methode drukLijstAf aan
	}

	public static int leesGeheelGetal () {

		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Voer een getal boven de 0 in! (bij hoge getallen kan het meerdere minuten duren).");

		String input = inputScanner.nextLine();

		inputScanner.close();
		//try en catch !!
		 
		int inputInt = Integer.parseInt(input);	
		
		System.out.println("u heeft ingevoerd: "+inputInt );
		return inputInt;
	}

	
	public static ArrayList<Integer> genereerArrayList(int maxAantal, int laagstewaarde, int hoogstewaarde) {
		ArrayList<Integer> lijst = new ArrayList<>();

		//	maxAantal = 0 + inputInt;
		for (int i = 0;i <= maxAantal;) {
			i++;
			lijst.add(    (int)( Math.random()*(hoogsteWaarde-laagsteWaarde))+laagsteWaarde    );
		
		}

		return lijst;
	}
	public static void drukLijstAf(ArrayList<Integer> lijst ) {
	System.out.println("test"+ lijst );
}

	public static ArrayList<Integer>  sorteerLijst(ArrayList<Integer> lijst) {
		//deze code gaat om het sorteren. Doe dat in de methode sorteerLijst.
		for( int hoogsteWaarde = lijst.size()- 1; hoogsteWaarde >= 1; hoogsteWaarde-- ) {
			for( int index = 0; index < hoogsteWaarde; index++ ) {
				if( (int) lijst.get(index) > (int)lijst.get(index+1) ) {
					int hulp = (int) lijst.get(index);
					lijst.set(index,lijst.get(index+1) );
					lijst.set(index+1, hulp);
				}

			}
		}


		return lijst;

	}









}
//opdracht: maak de methode drukLijstaf
//maak de methode sorteerLijst





// EEN ARRALIST OMZETTEN NAAR EEN ARRAY
// LASTIG IS DAT HET ARRAY DUS EEN VAST AANTAL ELEMENTEN HEEFT EN EEN ARRAYLIST IN PRINCIOE NIET
// DAAROM WORDT DE SIZE VAN HET ARRAYLIST BEREKEND EN GEBRUIKT OM DE GROOTE VAN HET ARRAY TE BEPALEN
//public static int[] convertertoArray(ArrayList list){
//  int lengte =list.size();
// int tabel[] = new int[lengte];

// for (int i=0;i<lengte;i++) {
//LET OP TYPECAST IS NOODZAKELIJK ZIE PRESENTATIE 
//tabel[i]=(int)list.get(i);  
//  }	 
//EEN ARRAY TERUG GEVEN
//  return tabel;



