public class InventoryItem{
	
	public InventoryItem(String name, String description, int healthBoost, int skillBoost)
	{
		Name = name;
		Description = description;
		HealthBoost = healthBoost;
		SkillBoost = skillBoost;
	}
	
	public String Name;
	public String Description;
	public int HealthBoost;
	public int SkillBoost;
}