import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		BattleSequencer battler = new BattleSequencer();
		Scanner input = new Scanner (System.in);
		
		// make character
		MainCharacter protagonist = new MainCharacter();
		protagonist.CreateStats(); 
		
		
		//nice words
		System.out.println("The burned city lays before you, its once greatness ruined to the scars of war.");
		System.out.println("the general lies within the castle, but first you need to penetrate the walled city.");
		System.out.println("Due to the recent capture the city is in lockdown and guards patrol the perimeter wall and the gates;");
		System.out.println("Will you: A) Start to circle the wall searching for an alternative way in");
		System.out.println(" B) Impersonate a farmer trying to seek refuge in the city");
		System.out.println(" C) Try and take out the guards at an entrance to force your way through");
		String theirChoice = input.nextLine();
		
		if (theirChoice.equals("A")) {
			System.out.println("");
		}
		//Make referral to next page in accordance with choice
		else if (theirChoice.equals("B")) {
			System.out.println("You put on your rags and straw hat that you keep for times when anonimity is required for your tasks,");
			System.out.println("You aproach the entrance playing the part of the old farmer with the crooked back; the gate seems strangely sparse of civilians");
			System.out.println("One of the guards confronts you 5 metres infront of the aperture, an inexperienced militia conscripted only for the war");
		}
		//Make referral to next page in accordance with choice
		else if (theirChoice.equals("C")) {
			System.out.println("");
		}

		// nice words 
		
		
		// make decisions
		
		
		// make enemy
		SimpleEnemy YoteyBoi = new SimpleEnemy();
		
		// fight them
		battler.Battle(protagonist, YoteyBoi);

	}

}
