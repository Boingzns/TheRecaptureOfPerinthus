public class InventoryItem{
	
	public InventoryItem(String name, String description, int healthBoost, int skillBoost, String type)
	{
		Name = name;
		Description = description;
		HealthBoost = healthBoost;
		SkillBoost = skillBoost;
		equipped = false;
		usageType = type;
	}
	
	public String Name;
	public String Description;
	public int HealthBoost;
	public int SkillBoost;
	public boolean equipped;
	public String usageType;
	
	public String ToString() 
	{
		return String.format(
				"Name: %s, Description: %s, Health Boost: %d, Skill Boost: %d, Type: %s",
				Name, Description, HealthBoost, SkillBoost, usageType);
	}
}