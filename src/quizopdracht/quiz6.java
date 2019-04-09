package quizopdracht;

public class quiz6 
{
public void mijnMethode(int x, int y)
{
	int z = 4;
	int i = 3;
	i++;
	if(x < y)
	{
		z += 4;
	}
	if(x * x > y)
	{
		z += 2;
	}
	else
	{
		z += 2;
	}
	z ++;
	System.out.print(z);
}
		public static void main(String[] args)
				{
			quiz6 mk = new quiz6();
			mk.mijnMethode(3,9);
				}
}
