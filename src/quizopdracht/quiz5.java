package quizopdracht;

public class quiz5 
{
double euro = 0.907;
double engelsePond = 0.762;
double zwitserseFranc = 0.986;
double chineseYuan = 6.674;
double russischeRoebel = 64.459;

public void omrekenenNaarDollar(char valuta, int bedrag)
{
	switch(valuta)
	{
	case('e'):
		System.out.print(bedrag * euro);
	break;
	case ('p'):
		System.out.print(bedrag * engelsePond);
	break;
	case('f'):
		System.out.print(bedrag * zwitserseFranc);
		break;
	case('y'):
		System.out.print(bedrag * chineseYuan);
	break;
	case ('r'):
		System.out.print(bedrag * russischeRoebel);
	break;
	default:
		System.out.print("Ongeldig");
	}
}
public static void main(String[] args)
{
	Valuta val = new Valuta();
	val.omrekenenNaarDollar('f',100);
}
}
