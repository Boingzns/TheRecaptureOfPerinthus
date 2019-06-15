import java.util.HashMap;
import java.util.HashSet;

public class Inventory {
	
	HashMap<String, InventoryItem> other;
	HashMap<String, InventoryItem> weapons;
	HashMap<String, InventoryItem> armour;
	HashMap<String, InventoryItem> shields;
	HashMap<String, InventoryItem> consumables;
	
	public Inventory() {
		other = new HashMap<String, InventoryItem>();
		weapons = new HashMap<String, InventoryItem>();
		armour = new HashMap<String, InventoryItem>();
		shields = new HashMap<String, InventoryItem>();
		consumables = new HashMap<String, InventoryItem>();
	}
	
	public void StoreItem(InventoryItem newItem) {
		GetRelevantDictionaryByType(newItem.usageType).put(newItem.Name, newItem);
	}
	
	public InventoryItem GetItem(String name) {
		if (weapons.containsKey(name))
			return weapons.get(name);
		else if (armour.containsKey(name))
			return armour.get(name);
		else if (shields.containsKey(name))
			return shields.get(name);
		else if (consumables.containsKey(name))
			return consumables.get(name);
		else return other.get(name);
	}
	
	public void InventoryList() {
		HashSet<HashMap<String, InventoryItem>> dictionarys = MakeSetOfHashMaps();
		System.out.println("Inventory:");
		for (HashMap<String, InventoryItem> dictionary : dictionarys)
		{
			for (String key : dictionary.keySet())
			{
				InventoryItem item = dictionary.get(key);
				System.out.println(item.ToString());
			}
		}
	}
	
	public int GetEquippedSkillBoost()
	{
		int totalItemSkillBoost = 0;
		HashSet<HashMap<String, InventoryItem>> dictionarys = MakeSetOfHashMaps();
		for (HashMap<String, InventoryItem> dictionary : dictionarys)
		{
			for (String key : dictionary.keySet())
			{
				InventoryItem item = dictionary.get(key);
				if(item.equipped)
					totalItemSkillBoost += item.SkillBoost;	
			}
		}
		return totalItemSkillBoost;	
	}
	
	public int GetEquippedHealthBoost()
	{
		int totalItemHealthBoost = 0;
		HashSet<HashMap<String, InventoryItem>> dictionarys = MakeSetOfHashMaps();
		for (HashMap<String, InventoryItem> dictionary : dictionarys)
		{
			for (String key : dictionary.keySet())
			{
				InventoryItem item = dictionary.get(key);
				if(item.equipped)
					totalItemHealthBoost += item.HealthBoost;	
			}
		}
		return totalItemHealthBoost;	
	}
	
	private HashMap<String, InventoryItem> GetRelevantDictionaryByType(String usageType){
		if (usageType == "weapon")
			return weapons;
		else if (usageType == "armour")
			return armour;
		else if (usageType == "shield")
			return shields;
		else if (usageType == "consumable")
			return consumables;
		else return other;
	}
	
	private HashSet<HashMap<String, InventoryItem>> MakeSetOfHashMaps() {
		HashSet<HashMap<String, InventoryItem>> dictionarys = new HashSet<HashMap<String, InventoryItem>>();
		dictionarys.add(other);
		dictionarys.add(weapons);
		dictionarys.add(armour);
		dictionarys.add(shields);
		dictionarys.add(consumables);
		
		return dictionarys;
	}
}

