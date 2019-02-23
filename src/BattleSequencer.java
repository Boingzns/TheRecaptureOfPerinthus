import java.util.Scanner;

public class BattleSequencer implements Interfaces.IBattleSequencer {
	
	String[] attackPhrases = {
			"Adrenaline roaring through your body, you dash to the side like an embodiment of Ventus’ own wind, darting forward once again to land two flying slashes across the abdomen of your attacker",
			"They attempt to attack, but you easily block the weapon pillaging its path towards your abdomen, plunging the tip of your sword into their armpit in retaliation",
			"You parry, and land a slicing blow across their front, sending darkened blood spurting out across the grey cobbled stones",
			"Turning quickly on the balls of your feet, you lunge towards them in a daring thrust, piercing their chest before rapidly retreating to a safer position",
			"A quick block opens up an opportunity to press the offensive, allowing you to smash the top of your opponent's head with your pommel, dazing them as you slash across their front with the tip of your sword"};
	
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
				System.out.println(enemy.GetHurtPhrase());
				System.out.println("You lose 3 health");
				mainy.LoseHealth();
			}
			
			else {
				System.out.println("No damage attained or given");
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
	
}
