public class ZeBaker implements Interfaces.IEnemy {
	private int Health = 13;
	
	public int GetSkill() {
		return 3;
	}

	public int GetHealth() {
		return Health;
	}

	public void LoseHealth() {
	    Health -=4;
	}

	public boolean IsDead() {
		return Health <= 0;
	}
	
	String[] hurtPhrases = {
			"Croissaints fall upon you in formidable rains of danger from the firey burning oven situating in the corner of the hellish room, butter smearing across your sweaty, boiling skin as you face the morbidly obese frenchman before you. Each hit takes energy from your already ailing stock, and you tumble back towards the door",
			"A distant whistling pierces your ears, and you turn towards the increasingly deafening sound. Instantaneously, with the force of a terrorising bolder, a baguette javelin slams into your helmet, pinning you to temporarily to the floor with its overwhelming momentum"
	};
	
	public String GetHurtPhrase()
	{
		int phraseNumber = DiceRoller.GeneratePhraseIndex(hurtPhrases.length);
		return hurtPhrases[phraseNumber];
		
	}
	
}