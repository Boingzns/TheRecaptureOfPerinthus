public class BasicMilitia implements Interfaces.IEnemy {
	
	private int Health = 5;
	
	String[] hurtPhrases = {
			"As you attempt to block the incoming strike headed for your arm, you stumble on a rare imperfection in the otherwise meticulously even ground, toppling your balance and allowing your opponent to land a glancing blow, but the sharpness of the movement saves you from too great an injury.",
			"Frantically throwing a hand up against their downward slice, you bark in pain as you feel the sharp edge of their blade puncture your armour. Blood seeps between the small metal cracks of the protection, and you slowly feel numbness sweeping up your balancing arm. You must end this battle quickly."
	};
	
	public int GetSkill() {
		return 5;
	}

	public int GetHealth() {
		return Health;
	}

	public void LoseHealth() {
	    Health -=3;
	}

	public boolean IsDead() {
		return Health <= 0;
	}
	
	public String GetHurtPhrase()
	{
		int phraseNumber = DiceRoller.GeneratePhraseIndex(hurtPhrases.length);
		return hurtPhrases[phraseNumber];
		
	}
}
