package H6;

public class quiz2
 {
	int i = 5;
	int i2 = 3;
	private char[] bereken;
	 
	 public int bereken()
	 {
		 i ++;
		 if(i <= i2)
		 {
			 return i * i2;
		 }
		 else if((i + i2) >= 9) {
			 return i + i2 + 5;
		 }
		 return i * i2 + 3;
	 }
	public static void main(String [] args)
	{
		quiz2 mk = new quiz2();
		System.out.println(mk.bereken());
	}
 }