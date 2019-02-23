import java.util.Scanner;

public class Main {

	private static MainCharacter protagonist;
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		protagonist = new MainCharacter();
		protagonist.CreateStats(); 
		
		
		Part_1.Approach_the_City(protagonist);
							
	}
}
