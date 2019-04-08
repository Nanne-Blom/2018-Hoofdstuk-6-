package quizopdracht;

public class quiz4 
{
int x = 2;

public void print ()
{
	for(int i = 0; i <= 3; i++)
	{
		if(i < 2)
		{
			x ++;
		}
		else
		{
			x += 2;
		}
	}
	System.out.print(x);
}
		public static void main(String[] args) {
		quiz4 mk = new quiz4();
		mk.print();
	}
}