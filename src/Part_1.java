

public class Part_1 {

	static BattleSequencer battler;
	static KindInputTaker input;
	static MainCharacter mainCharacter;

	public static void Approach_the_Castle(MainCharacter mainy) {
		input = new KindInputTaker ();
		battler = new BattleSequencer(input);
		mainCharacter = mainy;

		System.out.println("The burned castle lays before you, its once greatness ruined to the scars of war.");
		System.out.println("the general lies within.");
		System.out.println("Due to the recent capture the city the castle is in lockdown and guards patrol the great walls;");
		
		input.PressEnterToContinueOrIForInventory(mainCharacter.GetInventory());

		Choice1Bit();

		input.Close();
		}

	public static void Impersonateservant() {
		System.out.println("You put on a disguise in an attempt to discretely enter the castle without aggravating the obviously sleep deprived, aggressive guards");
		System.out.println("You approach the entrance dressed like a servant of the general");
		System.out.println("One of the guards confronts you 5 metres infront of the aperture, an inexperienced militia conscripted only for the war");
		System.out.println("He tells you that the gate is closed and to turn around before he takes you into custody");
		
		input.PressEnterToContinueOrIForInventory(mainCharacter.GetInventory());
	}

	private static void FightGateGuards(int numGuards) {
		while (numGuards > 0) {
			BasicMilitia guard = new BasicMilitia();
			battler.Battle(mainCharacter, guard);
			numGuards --;
		}
	}

	private static void LookAroundFindSewer() {
		System.out.println("Searching round the side of the grand, dilapidated castle you find a discrete opening in the street.");
		System.out.println("Cautiously making sure that no-one is watching, you proceed down some darkened, rotting rungs into the dank subterrenean world of the sewers");
		System.out.println("Proceeding forth into the tunnels, you hold your nose as the smell forces violent retching from your body, your stomach toiling in the overwhelming harshness of the muck.");
		System.out.println("Fearing tempramental illness that could upset your mission you hasten your scarpering down the underground passages further");
		System.out.println("After what felt like hours of rushing through the dark, horrific passages, you resurface and gasp in fresher air of the main courtyard of the keep");
		System.out.println("Finally you surface, gasping in great gulps of fresh air with a desperate primal need that makes you forget all motions of inconspicuity");
		System.out.println("Glancing around, you thank the gods that nobody noticed your distressed outburst, and begin to plan your next move");
		Part_2.The_Keep(mainCharacter);
	}

	private static void Choice1Bit() {
		System.out.println("Will you: \n A) Start to circle the wall searching for an alternative way in");
		System.out.println(" B) Impersonate a servant trying to seek refuge in the city");
		System.out.println(" C) Try and take out the guards at an entrance to force your way through");
		String firstChoice = input.GetChoice();
		
		if (firstChoice.equals("A")) {
			LookAroundFindSewer();
		}

		else if (firstChoice.equals("B")) {
			Impersonateservant();
			Choice2Bit();
		}
		
		else if (firstChoice.equals("C")) {
			FightGateGuards(5);
		}
	}		
	
	private static void Choice2Bit() {
		System.out.println("Will you: \n A) Try to persuade the guard of your need to enter the castle");
		System.out.println(" B) fight your way through");
		System.out.println(" C) walk away from the gate and look for an alternative way into the castle");
		String theirChoice2 = input.GetChoice();
		if (theirChoice2.equals("A")) {
			System.out.println("You tell the guard how you need to enter the castle to serve your master his lunch");
			System.out.println("He agrees to allow you through");
			System.out.println("You thank him and continue through the main gate into the castle");
			System.out.println("Once past the militia guarding the gate, you enter the cold, battered ,main courtyard");
			
			input.PressEnterToContinueOrIForInventory(mainCharacter.GetInventory());
			Choice4Bit();
		}	

		else if (theirChoice2.equals("B")) {
			FightGateGuards(4);
		}

		else if (theirChoice2.equals("C")) {
			LookAroundFindSewer();	
		}
	}

	private static void Choice3Bit() {
		System.out.println("Will you: A) Fight your way through");
		System.out.println("B) Walk away from the gate and look for an alternative way into the city");
		String theirChoice3 = input.GetChoice();
		
		if (theirChoice3.equals("A")) {
			FightGateGuards(4);
		}
			
		
		else if (theirChoice3.equals("B")) {
			LookAroundFindSewer();
		}
	}
	
	private static void Choice4Bit() {
		System.out.println("Will you: \n A) Head to the main barracks");
		System.out.println(" B) Hide in a nearby pile of rocks");
		String fourthChoice = input.GetChoice();
		
		if (fourthChoice.equals("A")) {
			System.out.println("You head toward the main barracks, ghosting amongst other guards heading the same way");
			System.out.println("upon following them inside you realise your mistake");
			System.out.println("the place is filled with guards who spot you instantly");
			System.out.println("Your adventure ends here.");

		}
		else if (fourthChoice.equals("B")) {
			GetReadyForPartTwo();
		}
	}

	private static void GetReadyForPartTwo() {
		System.out.println("You crouch in a narrow gap between large rocks");
		System.out.println("Just in time, you realise, as a group of guards rushes quickly past your perch");
		System.out.println("Turning your attention to where they are headed, you hear a commotion coming from the gates");
		Part_2.The_Keep(mainCharacter);
		
	}
}