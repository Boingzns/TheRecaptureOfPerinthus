import java.util.HashMap;
import java.util.Map;

public class Inventory {
	
	Map<String, InventoryItem> allItems;
	
	public Inventory() {
		allItems = new HashMap<String, InventoryItem>();
	}
	
	public void StoreItem(InventoryItem newItem) {
		allItems.put(newItem.Name, newItem);
	}
	
	public InventoryItem GetItem(String name) {
		return allItems.get(name);
	}
}
