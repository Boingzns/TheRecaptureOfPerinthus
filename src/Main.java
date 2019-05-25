import java.util.Scanner;

public class Main {

	private static MainCharacter protagonist;
	
	public static void main(String[] args) {		
		
		protagonist = new MainCharacter();
		protagonist.CreateStats(); 
		
		Part_1.Approach_the_Castle(protagonist);
		
		if (protagonist.IsDead())
			System.out.println("You have died");
		else
		{
			//print startPart 2
			Part_2.Part_2();
		}
							
	}
}
