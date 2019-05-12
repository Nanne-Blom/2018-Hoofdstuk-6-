package p3Opdrachten;
import java.util.ArrayList;
import java.util.Scanner;;
public class S232H8opdrachtB {

	public static void main(String [] args)
	{

			    ArrayList<String> cars = new ArrayList<String>();
			    cars.add("Volvo");
			    cars.add("BMW");
			    cars.add("Ford");
			    cars.add("Mazda");
			    System.out.println(cars);
			    
			    Scanner ScannerNummer = new Scanner(System.in);
			    System.out.println("Voer een nummer in om die regel in de array aan te passen!");
			    String inputNummer = ScannerNummer.nextLine();
			    System.out.println("Voer nu het woord in dat u daar wil zetten");
			    Scanner ScannerTekst = new Scanner(System.in);
			    String inputTekst = ScannerTekst.nextLine();
			    
			    int inputNummerInt = Integer.parseInt(inputNummer);
			    
			    cars.set(inputNummerInt, inputTekst);
			    
			    System.out.println("het is aangepast!");
			    System.out.println(cars);
			  } 
			}

