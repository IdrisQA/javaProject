import java.util.Scanner;

public class LitreToGallon{
	double litre, usGallon, usDryGallon, ukGallon;

	
	public void setLitre(){
		Scanner gallons = new Scanner(System.in);
		System.out.println("Enter Litres of Liquid(L): ");
		litre = gallons.nextDouble();
	}

	public void seeConversion(){
		System.out.println("\n This are Litre To Gallon Conversions");
		System.out.println("--------------------------------------");
		System.out.println("Litres (L): " + litre);
		usGallon = litre/3.785;
		System.out.println("USA Gallon: " + usGallon);
		usDryGallon = litre/4.404;
		System.out.println("USA Dry Gallon: " + usDryGallon);
		ukGallon = litre/4.546;
		System.out.println("UK Gallon: " + ukGallon);
	}

	public static void main(String[] args){
		LitreToGallon convert = new LitreToGallon();
		convert.setLitre();
		convert.seeConversion();
	}
}