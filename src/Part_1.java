import java.util.Scanner;

public class Part_1 {
	
	static BattleSequencer battler;
	static KindInputTaker input;

	public static void Approach_the_Castle(MainCharacter mainy) {
		input = new KindInputTaker ();
		battler = new BattleSequencer(input);
		
		System.out.println("The burned castle lays before you, its once greatness ruined to the scars of war.");
		System.out.println("the general lies within.");
		System.out.println("Due to the recent capture the city the castle is in lockdown and guards patrol the great walls;");
		
		input.PressEnterToContinue();
		
		Choice1Bit(mainy);
		
		input.Close();
			
		}
			
		public static void Impersonatefarmer() {
			System.out.println("You put on a disguise in an attempt to discretely enter the castle without aggravating the obviously sleep deprived, aggressive guards");
			System.out.println("You approach the entrance dressed like a servant of the general");
			System.out.println("One of the guards confronts you 5 metres infront of the aperture, an inexperienced militia conscripted only for the war");
			System.out.println("He tells you that the gate is closed and to turn around before he takes you into custody");
			
			input.PressEnterToContinue();
		}
		

		private static void FightGateGuards(MainCharacter protagonist, int numGuards) {
			while (numGuards > 0) {
				BasicMilitia guard = new BasicMilitia();
				battler.Battle(protagonist, guard);
				numGuards --;
			}
		}

		private static void LookAroundFindSewer() {
			System.out.println("Searching round the side of the grand, dilapidated castle you find a discrete opening in the street.");
			System.out.println("Cautiously making sure that no-one is watching, you proceed down some darkened, rotting rungs into the dank subterrenean world of the sewers");
			System.out.println("Proceeding forth into the tunnels, you hold your nose as the smell forces violent retching from your body, your stomach toiling in the overwhelming harshness of the muck.");
			System.out.println("Fearing tempramental illness that could upset your mission you hasten your scarpering down the underground passages further");
		}
		
		private static void Choice2Bit(MainCharacter mainCharacter) {
			System.out.println("Will you: \n A) try to persuade the guard of your need to enter the castle");
			System.out.println(" B) fight your way through");
			System.out.println(" C) walk away from the gate and look for an alternative way into the castle");
			String theirChoice2 = input.GetChoice();
			if (theirChoice2.equals("A")) {
				System.out.println("you tell the guard how you need to enter the castle to pleasure your master, the comatose general");
				System.out.println("His eyebrows raise in surprise as he stutters, '..oh, my meeestake of course you can enter'");
				System.out.println("You thank him and hop back into your tank to continue on your way");
				
				input.PressEnterToContinue();
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
			String theirChoice3 = input.GetChoice();
			
			if (theirChoice3.equals("A")) {
				FightGateGuards(mainCharacter, 4);
			}
				
			
			
			else if (theirChoice3.equals("B")) {
				LookAroundFindSewer();
			}
		}
		
		private static void Choice1Bit(MainCharacter mainCharacter) {
			System.out.println("Will you: \n A) Start to circle the wall searching for an alternative way in");
			System.out.println(" B) Impersonate a servant trying to seek refuge in the city");
			System.out.println(" C) Try and take out the guards at an entrance to force your way through");
			String firstChoice = input.GetChoice();
			
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