public class MainCharacter implements Interfaces.IMainCharacter{
	
	private int Health = 0;
	private int Skill = 0;
	private int baseSkill = 4;
	private int baseHealth = 4;
	private int maxSkill = 0;
	private int maxHealth = 0;
	
	private Inventory myThings;
	
	public MainCharacter() {
		myThings = new Inventory();
	}
	
	public void CreateStats() {
		System.out.println("roll the dice to determine your health");
		int firstHealthRoll = DiceRoller.RollDice();
		int secondHealthRoll = DiceRoller.RollDice();
		Health = baseHealth + firstHealthRoll + secondHealthRoll;
		System.out.println("Health = " + Health);
		maxHealth = Health;
		
		System.out.println("roll the dice to determine your skill");
		int firstSkillRoll = DiceRoller.RollDice();
		int secondSkillRoll = DiceRoller.RollDice();
		Skill = baseSkill + firstSkillRoll + secondSkillRoll;
		System.out.println("Skill = " + Skill);
		maxSkill = Skill;		
	}

	public int GetSkill() {
		int modified_skill = Skill + myThings.GetEquippedSkillBoost();
		return modified_skill;
	}

	public int GetHealth() {
		int modified_health = Health + myThings.GetEquippedHealthBoost();
		return modified_health;
	}

	public void LoseHealth() {
		Health -=3;
	}

	public boolean IsDead() {
		return Health <= 0;
	}

	@Override
	public Inventory GetInventory() {
		return myThings;
	}
	
	
}