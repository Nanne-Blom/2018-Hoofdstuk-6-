package quizopdracht;
// hallo dit is een test
public class quiz1
{
double ozGoudPrijs = 1300.0;
double ozZilverPrijs = 20.0;
boolean isGoud = true;

public int berekenMetaalPrijs(boolean isGoud, int ounce)
{
	if(isGoud)
	{
		return (int) (ozGoudPrijs * ounce);
	} //test
	return ounce;
} //test123
public static void  main(String[] args) {
}
{
	quiz1 em = new quiz1();
	System.out.print(em.berekenMetaalPrijs(false,4));
	System.out.print(", ");
	System.out.print(em.berekenMetaalPrijs(true,2));
}
}