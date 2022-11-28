package week1.day1;

public class MobileDetails {
	
	
	String brandName = "Apple";
	char mobileLogo = 'A';
	short noOfMobilePiece = 4;
	int modelNumber = 9833690;
	long mobileImeiNumber = 133223213456768L;
	float mobilePrice = 11235.50f;
	boolean isDamaged = false;

	public static void main(String[] args) {

		
		MobileDetails md = new MobileDetails();
		
		System.out.println(md.brandName);
		System.out.println(md.isDamaged);
		System.out.println(md.mobileImeiNumber);
		System.out.println(md.mobileLogo);
		System.out.println(md.mobilePrice);
		System.out.println(md.modelNumber);
		System.out.println(md.noOfMobilePiece);
		
		
		
		

	}

}
