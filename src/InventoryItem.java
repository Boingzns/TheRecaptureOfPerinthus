public class InventoryItem{
	
	public InventoryItem(String name, String description, int healthBoost, int skillBoost)
	{
		Name = name;
		Description = description;
		HealthBoost = healthBoost;
		SkillBoost = skillBoost;
		equipped = true;
	}
	
	public String Name;
	public String Description;
	public int HealthBoost;
	public int SkillBoost;
	public boolean equipped;
	
	public String ToString() 
	{
		return String.format(
				"Name: %s, Description: %s, Health Boost: %i, Skill Boost: %i",
				Name, Description, HealthBoost, SkillBoost);
	}
}