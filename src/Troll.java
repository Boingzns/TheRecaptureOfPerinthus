public class Troll implements Interfaces.IEnemy {
	private int Health = 15;
	
	public int GetSkill() {
		return 6;
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
	
	String[] hurtPhrases = {
			"A strengthened fist flies towards your position, ready to crush you with its infallible power. Despite your rapid roll to avoid it, it catches you on the shoulder, temporarily jarring the joint and sending you off balance. Ignoring the pain now weedling its way down your arm, you stand and prepare to continue battling"
	};
	
	public String GetHurtPhrase()
	{
		int phraseNumber = DiceRoller.GeneratePhraseIndex(hurtPhrases.length);
		return hurtPhrases[phraseNumber];
		
	}
	
}