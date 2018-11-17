
public class MainTesting {

	public static void main(String[] args) {
		Inventory myThings = new Inventory();
		
		myThings.StoreItem(new InventoryItem("Sword Of Destiny", "its like a sword, but for destinies"));
		
		InventoryItem swordOfDestiny = myThings.GetItem("Sword Of Destiny");
		
		
		System.out.println(swordOfDestiny.Name);
		System.out.println(swordOfDestiny.Description);
	}

}
