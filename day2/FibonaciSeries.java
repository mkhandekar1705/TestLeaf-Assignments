package week1.day2;

public class FibonaciSeries {
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		
		for(int i=2; i<=10; i++) 
		{
			int c=a+b;			
			a=b;
			b=c;

			System.out.println(c);
		}
	}

}
