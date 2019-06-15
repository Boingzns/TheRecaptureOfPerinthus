import java.util.Scanner;

public class Main {

	private static MainCharacter protagonist;
	
	public static void main(String[] args) {		
		
		protagonist = new MainCharacter();
		protagonist.CreateStats(); 
		
		protagonist.GetInventory().StoreItem(Items.AssassinsSword);
		Items.AssassinsSword.equipped = true;
		
		Part_1.Approach_the_Castle(protagonist);						
	}
}
