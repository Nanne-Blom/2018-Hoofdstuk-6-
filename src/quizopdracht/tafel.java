package quizopdracht;
import java.util.Scanner;
public class tafel {
	public static void main(String[] args) 
	
	// datum 9 mei 2019
	//Nanne Blom
	{
		// var s = new Scanner(System.in);

		Scanner invoer = new Scanner(System.in);

		int tafelGetal;
		System.out.print("Voer een getal voor de tafel in:");
		tafelGetal = invoer.nextInt();

		System.out.println("");
		int maxGetal;
		System.out.print("Voer een getal voor hoogste waarde van de tafel in:");
		maxGetal = invoer.nextInt();


		System.out.println("U krijgt de tafel van : "+tafelGetal+" tot :" +maxGetal);

		System.out.println("");



		for(int i=1; i <= maxGetal; i++)
		{
			System.out.println(i+" * "+tafelGetal +" = "+i*tafelGetal);
		}
	}
}