import java.util.Scanner;
public class KindInputTaker{
	Scanner scanner;
	
	public KindInputTaker() {
		scanner = new Scanner(System.in);
	}
	
	public String GetChoice() {
		
		String whatTheyWrote = scanner.nextLine();
		
		while (whatTheyWrote.length() != 1 
				|| !AcceptableInput(whatTheyWrote))
		{
			System.out.println("Try again");
			whatTheyWrote = scanner.nextLine();
		}

		// lower and upper case => should both work
		// empty input (space or whatever) -> should do it again
		// random input -> another chance , go again
		
		
		return whatTheyWrote.toUpperCase();
		
	}
	
	private boolean AcceptableInput(String whatTheyWrote) {
		// return true if its good "A" or "B" or "C"
		whatTheyWrote = whatTheyWrote.toUpperCase();
		if (whatTheyWrote.equals("A") || whatTheyWrote.equals("B") || whatTheyWrote.equals("C"))
			return true;
		// return false if its not good
		else return false;
	}

	public void PressEnterToContinueOrIForInventory(Inventory inventory) {
		if (inventory == null) {
			System.out.println("Press enter to continue");
			scanner.nextLine();
			return;
		}

		System.out.println("Press enter to continue or press I or R for inventory commands");
		
		String playerInput = scanner.nextLine();
		
		while (playerInput.length() != 1 
				|| !AcceptableInputOnEnter(playerInput))
		{
			System.out.println("Try again");
			playerInput = scanner.nextLine();
		}

		System.out.println("At Least To Here");
		if (playerInput.equals ("I")) {

			System.out.println("I sleecteds");
			inventory.InventoryList();
		}
		
		if (playerInput.equals("R")) {
			inventory.InventoryList();
			System.out.println("Choose your weapon");
			String key1 = scanner.nextLine();
			while (!inventory.weapons.containsKey(key1))
				System.out.println("Try again");
				key1 = scanner.nextLine();
			InventoryItem item1 = inventory.GetItem(key1);
			item1.equipped = true;
			System.out.println("Choose your armour");
			String key2 = scanner.nextLine();
			while (!inventory.armour.containsKey(key2))
				System.out.println("Try again");
				key2 = scanner.nextLine();
			InventoryItem item2 = inventory.GetItem(key2);
			item2.equipped = true;
			System.out.println("Choose your shield");
			String key3 = scanner.nextLine();
			while (!inventory.shields.containsKey(key3))
				System.out.println("Try again");
				key3 = scanner.nextLine();
			InventoryItem item3 = inventory.GetItem(key3);
			item3.equipped = true;
			System.out.println("Choose a quick use consumable");
			String key4 = scanner.nextLine();
			while (!inventory.consumables.containsKey(key4))
				System.out.println("Try again");
				key4 = scanner.nextLine();
			InventoryItem item4 = inventory.GetItem(key4);
			item4.equipped = true;
		}
	}
	
	private boolean AcceptableInputOnEnter(String playerInput) {
		// return true if its good "I" or "R" or "K"
		playerInput = playerInput.toUpperCase();
		if (playerInput.equals("I") || playerInput.equals("R") || playerInput.equals("K"))
			return true;
		// return false if its not good
		else return false;
	}	
	
	public void Close() {
		scanner.close();
	}
}
