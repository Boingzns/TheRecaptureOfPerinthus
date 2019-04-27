public class Dragon implements Interfaces.IEnemy {
	private int Health = 10;
	
	public int GetSkill() {
		return 9;
	}

	public int GetHealth() {
		return Health;
	}

	public void LoseHealth() {
	    Health -=2;
	}

	public boolean IsDead() {
		return Health <= 0;
	}
	
	String[] hurtPhrases = {
			"Inhaling deeply, the great beast sends plumes of tumbling, scorching fire past your helmet as you dive frantically out the way. So great is the heat searing through the air next you that the moist, dank ground sizzles with evaporation where it passes. Noting the ferocity of the attack, you ready yourself again, this time more prepared for such an offense",
			
	};
	
	public String GetHurtPhrase()
	{
		int phraseNumber = DiceRoller.GeneratePhraseIndex(hurtPhrases.length);
		return hurtPhrases[phraseNumber];
		
	}
	public String GetName() {
		return "Dragon";
	}
	
}

