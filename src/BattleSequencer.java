import java.util.concurrent.*;

public class BattleSequencer implements Interfaces.IBattleSequencer {

	public void Battle(Interfaces.IMainCharacter mainy, Interfaces.IEnemy enemy)
	{
		System.out.println("battle engaged");
		while (!mainy.IsDead() && !enemy.IsDead()) {
			// each roll dice Once
			int playersAttack = DiceRoller.RollDice() + mainy.GetSkill();
			int enemyAttack = DiceRoller.RollDice() + enemy.GetSkill();
			System.out.println("your health:" + mainy.GetHealth());
			System.out.println("enemy health:" + enemy.GetHealth());
			// compare rolls
			if(playersAttack > enemyAttack) {
				System.out.println("hit! the enemy loses 3 health");
				enemy.LoseHealth();
			}
			
			else if(playersAttack < enemyAttack){
				System.out.println("Blocked failed; you lose 3 health");
				mainy.LoseHealth();
			}
			
			else {
				System.out.println("parry successful; no damage attained or given");
			}
		}
		
		if(mainy.IsDead()) {
			System.out.println("Game Over");
		}
		
		if(enemy.IsDead()) {
			System.out.println("enemy vanquished");
		}
	}
}
