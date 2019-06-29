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
	
	public void PressEnterToContinue() {
		System.out.println("Press enter to continue");
		scanner.nextLine();
	}

	public void PressEnterToContinueOrIForInventory(Inventory inventory) {
		if (inventory == null) {
			PressEnterToContinue();
			return;
		}

		System.out.println("Press enter to continue or press I (print inventory) or R (equip items)");
		
		String playerInput = scanner.nextLine();
		
		if (playerInput.equals("")){
			// They just pressed enter, just continue
			return;
		}
		
		while (playerInput.length() != 1 
				|| !AcceptableInputOnEnter(playerInput))
		{
			System.out.println("Try again");
			playerInput = scanner.nextLine();
		}

		playerInput = playerInput.toUpperCase();
		if (playerInput.equals ("I")) {
			inventory.InventoryList();
		}
		
		if (playerInput.equals("R")) {
			inventory.InventoryList();
			
			
			if (!inventory.weapons.isEmpty()) {
				boolean weaponSuccess = false;
				while (!weaponSuccess) {
					System.out.println("Choose your weapon");
					String key1 = scanner.nextLine();
					if (inventory.weapons.containsKey(key1)) {
						InventoryItem item1 = inventory.GetItem(key1);
						item1.equipped = true;
						weaponSuccess = true;
					}
					else {
						System.out.println("try again");
					}
				}
			}
			
			
			if (!inventory.armour.isEmpty()) {
				boolean armourSuccess = false;
				while (!armourSuccess) {
					System.out.println("Choose your armour");
					String key2 = scanner.nextLine();
					if (inventory.armour.containsKey(key2)) {
						InventoryItem item2 = inventory.GetItem(key2);
						item2.equipped = true;
						armourSuccess = true;
					}
					else {
						System.out.println("try again");
					}
				}
			}
			
			if (!inventory.shields.isEmpty()) {
				boolean shieldSuccess = false;
				while (!shieldSuccess) {
					System.out.println("Choose your shield");
					String key3 = scanner.nextLine();
					if (inventory.shields.containsKey(key3)) {
						InventoryItem item3 = inventory.GetItem(key3);
						item3.equipped = true;
						shieldSuccess = true;
					}
					else {
						System.out.println("try again");
					}
				}
			}
			
			
			if (!inventory.consumables.isEmpty()) {
				boolean consumableSuccess = false;
				while (!consumableSuccess) {
					System.out.println("Choose your quick-slot consumable");
					String key4 = scanner.nextLine();
					if (inventory.consumables.containsKey(key4)) {
						InventoryItem item4 = inventory.GetItem(key4);
						item4.equipped = true;
						consumableSuccess = true;
					}
					else {
						System.out.println("try again");
					}
				}
			}
		}
		
		PressEnterToContinue();
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
