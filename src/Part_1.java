import java.util.Scanner;

public class Part_1 {
	
	static BattleSequencer battler;
	static Scanner input;

	public static void Approach_the_Castle(MainCharacter mainy) {
		input = new Scanner (System.in);
		battler = new BattleSequencer(input);
		
		System.out.println("The burned castle lays before you, its once greatness ruined to the scars of war.");
		System.out.println("the general lies within.");
		System.out.println("Due to the recent capture the city the castle is in lockdown and guards patrol the great walls;");
		
		input.nextLine();
		
		Choice1Bit(mainy);
		
		input.close();
			
		}
			
		public static void Impersonatefarmer() {
			System.out.println("You put on a disguise to enter the castle, without angering the guards");
			System.out.println("You aproach the entrance dressed like a servant of the general");
			System.out.println("One of the guards confronts you 5 metres infront of the aperture, an inexperienced militia conscripted only for the war");
			System.out.println("He tells you that the gate is closed and to turn around before he takes you into custody");
			
			input.nextLine();
		}
		

		private static void FightGateGuards(MainCharacter protagonist, int numGuards) {
			while (numGuards > 0) {
				BasicMilitia guard = new BasicMilitia();
				battler.Battle(protagonist, guard);
				numGuards --;
			}
			
		}

		private static void LookAroundFindSewer() {
			System.out.println("ooh sewer really classy");
		}
		
		private static void Choice2Bit(MainCharacter mainCharacter) {
			System.out.println("Will you: A) try to persuade the guard of your need to enter the castle");
			System.out.println("B) fight your way through");
			System.out.println("C) walk away from the gate and look for an alternative way into the castle");
			String theirChoice2 = input.nextLine();
			if (theirChoice2.equals("A")) {
				System.out.println("you tell the guard how you need to enter the castle to pleasure your master, the comatose general");
				System.out.println("His eyebrows raise in surprise as he stutters, '..oh, my meeestake of course you can enter'");
				System.out.println("You thank him and hop back into your tank to contiune on your way");
				
				input.nextLine();
				Choice3Bit(mainCharacter);
			}	
				
			else if (theirChoice2.equals("B")) {
				FightGateGuards(mainCharacter, 4);
			}
				
			else if (theirChoice2.equals("C")) {
				LookAroundFindSewer();	
			}
		}
		
		private static void Choice3Bit(MainCharacter mainCharacter) {
			System.out.println("Will you: A) fight your way through");
			System.out.println("B) walk away from the gate and look for an alternative way into the city");
			String theirChoice3 = input.nextLine();
			
			if (theirChoice3.equals("A")) {
				FightGateGuards(mainCharacter, 4);
			}
				
			
			
			else if (theirChoice3.equals("B")) {
				LookAroundFindSewer();
			}
		}
		
		private static void Choice1Bit(MainCharacter mainCharacter) {
			System.out.println("Will you: A) Start to circle the wall searching for an alternative way in");
			System.out.println(" B) Impersonate a servant trying to seek refuge in the city");
			System.out.println(" C) Try and take out the guards at an entrance to force your way through");
			String firstChoice = input.nextLine();
			
			if (firstChoice.equals("A")) {
				LookAroundFindSewer();
			}

			else if (firstChoice.equals("B")) {
				Impersonatefarmer();
				Choice2Bit(mainCharacter);
			}
			
			else if (firstChoice.equals("C")) {
				FightGateGuards(mainCharacter, 5);
			}
		}
}


/*
    
    if nextChoice == A:
        TryToPersuade() # either fail or continue
        
        finalChoice = getInput()
        if finalChoice == A:
        	
            LookForWeapons()
        if finalChoice == B:
            LookForSupplies()
            
    else if nextChoice == B:
        FightYourWayThrough() # you just die?
    else if nextChoice == C:
    	
        WalkAwaySearchForAnotherRoute()
        HideFromSoldiersAndGoThroughSewer() #goes to part two in here

    FightYourWayThrough() # you just die or goes to 


all the other functions are hidden away down here

private void TryToPersuade() {
    print(some persuady boi)
}*/