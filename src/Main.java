
public class Main {
	
	public static void main(String[] args) {
		BattleSequencer battler = new BattleSequencer();
		
		//nice words
		
		// make character
		MainCharacter yeetyboi = new MainCharacter();
		yeetyboi.CreateStats(); 
		
		// nice words 
		
		// make decisions
		
		// make enemy
		SimpleEnemy YoteyBoi = new SimpleEnemy();
		
		// fight them
			battler.Battle(yeetyboi, YoteyBoi);

	}

}
