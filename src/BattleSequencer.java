import java.util.Scanner;

public class BattleSequencer implements Interfaces.IBattleSequencer {
	
	String[] attackPhrases = {
			"Adrenaline roaring through your body, you dash to the side like an embodiment of Ventus’ own wind, darting forward once again to land two flying slashes across the abdomen of your attacker",
			"They attempt to attack, but you easily block the weapon pillaging its path towards your abdomen, plunging the tip of your sword into their armpit in retaliation",
			"You parry, and land a slicing blow across their front, sending darkened blood spurting out across the grey cobbled stones"};

	String[] hurtPhrases = {
			"As you attempt to block the incoming strike headed for your arm, you stumble on a rare imperfection in the otherwise meticulously even ground, toppling your balance and allowing your opponent to land a glancing blow, but the sharpness of the movement saves you from too great an injury.",
			"Frantically throwing a hand up against their downward slice, you bark in pain as you feel the sharp edge of their blade puncture your armour. Blood seeps between the small metal cracks of the protection, and you slowly feel numbness sweeping up your balancing arm. You must end this battle quickly."
	};
	
	public void Battle(Interfaces.IMainCharacter mainy, Interfaces.IEnemy enemy)
	{
		Scanner inputPlace = new Scanner (System.in);
		System.out.println("battle engaged");
		while (!mainy.IsDead() && !enemy.IsDead()) {
			// each roll dice Once
			int playersAttack = DiceRoller.RollDice() + mainy.GetSkill();
			int enemyAttack = DiceRoller.RollDice() + enemy.GetSkill();
			System.out.println("your health:" + mainy.GetHealth());
			System.out.println("enemy health:" + enemy.GetHealth());
			// compare rolls
			
			inputPlace.nextLine();
			if(playersAttack > enemyAttack) {
				System.out.println(GetAttackPhrase());
				System.out.println("The enemy loses 3 health");
				enemy.LoseHealth();
			}
			
			else if(playersAttack < enemyAttack){
				System.out.println(GetHurtPhrase());
				System.out.println("You lose 3 health");
				mainy.LoseHealth();
			}
			
			else {
				System.out.println("Parry successful; no damage attained or given");
			}
		}
		
		if(mainy.IsDead()) {
			System.out.println("Game Over");
		}
		
		if(enemy.IsDead()) {
			System.out.println("Enemy Vanquished");
		}
		inputPlace.close();
	}
	
	private String GetAttackPhrase()
	{
		int phraseNumber = DiceRoller.GeneratePhraseIndex(attackPhrases.length);
		return attackPhrases[phraseNumber];
	}
	private String GetHurtPhrase()
	{
		int phraseNumber = DiceRoller.GeneratePhraseIndex(hurtPhrases.length);
		return hurtPhrases[phraseNumber];
	}
}
