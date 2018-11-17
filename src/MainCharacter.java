public class MainCharacter implements Interfaces.IMainCharacter{
	
	private int Health = 0;
	private int Skill = 0;
	private int baseSkill = 4;
	private int baseHealth = 4;
	private int maxSkill = 0;
	private int maxHealth = 0;
	
	public MainCharacter() {
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
		return Skill;
	}

	@Override
	public int GetHealth() {
		return Health;
	}

	@Override
	public void LoseHealth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean IsDead() {
		// TODO Auto-generated method stub
		return false;
	}}