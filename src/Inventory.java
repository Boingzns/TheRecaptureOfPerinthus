import java.util.HashMap;
import java.util.Map;

public class Inventory {
	
	HashMap<String, InventoryItem> allItems;
	
	public Inventory() {
		allItems = new HashMap<String, InventoryItem>();
	}
	
	public void StoreItem(InventoryItem newItem) {
		allItems.put(newItem.Name, newItem);
	}
	
	public InventoryItem GetItem(String name) {
		return allItems.get(name);
	}
	
	public void InventoryList() {
		for (String key : allItems.keySet())
		{
			InventoryItem item = allItems.get(key);
			System.out.println(item.Name);
			System.out.println(item.Description);
			System.out.println(item.HealthBoost);
			System.out.println(item.SkillBoost);
		}
	}
	
	public int GetEquippedSkillBoost()
	{
		int totalItemSkillBoost = 0;
		for (String key : allItems.keySet())
		{
			InventoryItem item = allItems.get(key);
			totalItemSkillBoost += item.SkillBoost;
		}
		return totalItemSkillBoost;	
	}
	
	public int GetEquippedHealthBoost()
	{
		int totalItemHealthBoost = 0;
		for (String key : allItems.keySet())
		{
			InventoryItem item = allItems.get(key);
			totalItemHealthBoost += item.HealthBoost;
		}
		return totalItemHealthBoost;	
	}
}
