import java.util.HashMap;
import java.util.Map;

public class Inventory {
	
	Map<String, Stuf> allItems;
	
	public Inventory() {
		allItems = new HashMap<String, Stuf>();
	}
	
	public void StoreItem(Stuf newItem) {
		allItems.put(newItem.Name, newItem);
	}
	
	public Stuf GetItem(String name) {
		return allItems.get(name);
	}
}
