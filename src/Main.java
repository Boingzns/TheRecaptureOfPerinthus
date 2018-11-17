import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		BattleSequencer battler = new BattleSequencer();
		Scanner input = new Scanner (System.in);
		
		// make character
		MainCharacter yeetyboi = new MainCharacter();
		yeetyboi.CreateStats(); 
		
		
		//nice words
		System.out.println("A burning castle lays before you, its once greatness ruined to the scars of war.");
		System.out.println("Will you: A) take the sneaky route, or B)Charge through the main door");
		
		String theirChoice = input.nextLine();
		
		if (theirChoice.equals("A")) {
			System.out.println("You sneak up to the wall, hiding in the large shadows");
		}
		//Make referral to next page in accordance with choice
		else if (theirChoice.equals("B")) {
			System.out.println("You barge through the main doors, and come face to face with a garrison of guards");
		}
		//Make referral to next page in accordance with choice
		

		// nice words 
		
		
		// make decisions
		
		
		// make enemy
		SimpleEnemy YoteyBoi = new SimpleEnemy();
		
		// fight them
		battler.Battle(yeetyboi, YoteyBoi);

	}

}
