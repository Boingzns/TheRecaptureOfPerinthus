import java.util.Scanner;

public class Part_1 {
	
	static BattleSequencer battler;
	static Scanner input;

	public static void Approach_the_City(MainCharacter mainy) {
		battler = new BattleSequencer();
		input = new Scanner (System.in);
		
		System.out.println("The burned city lays before you, its once greatness ruined to the scars of war.");
		System.out.println("the general lies within the castle, but first you need to penetrate the walled city.");
		System.out.println("Due to the recent capture the city is in lockdown and guards patrol the perimeter wall and the gates;");
		
		input.nextLine();
		
		Choice1Bit(mainy);
		
		input.close();
			
		}
			
		public static void Impersonatefarmer() {
			System.out.println("You put on your rags and straw hat that you keep for times when anonimity is required for your tasks,");
			System.out.println("You aproach the entrance playing the part of the old farmer with a crooked back; the gate seems strangely sparse of civilians");
			System.out.println("One of the guards confronts you 5 metres infront of the aperture, an inexperienced militia conscripted only for the war");
			System.out.println("He tells you that the gate is closed and to turn around before he takes you into custody");
			
			input.nextLine();
		}
		

		private static void FightGateGuards(MainCharacter protagonist) {
			BasicMilitia[] guards = {
					new BasicMilitia(),
					new BasicMilitia(),
					new BasicMilitia(),
					new BasicMilitia(),
					new BasicMilitia()
			};
			battler.Battle(protagonist, guards);
		}

		private static void LookAroundFindSewer() {
			System.out.println("ooh sewer really classy");
		}
		
		private static void Choice2Bit(MainCharacter mainCharacter) {
			System.out.println("Will you: A) try to persuade the militia of your need to enter the city");
			System.out.println("B) fight your way through");
			System.out.println("C) walk away from the gate and look for an alternative way into the city");
			String theirChoice2 = input.nextLine();
			if (theirChoice2.equals("A")) {
				System.out.println("you tell the guard of how your village was burned down by brigands and your family killed");
				System.out.println("and you plead for him to let you seek refuge in the city so you can pray at the grand temple");
				System.out.println("The guard looks at you with the same hard stern and tells you to beat it before he draws his sword");
				
				input.nextLine();
				Choice3Bit(mainCharacter);
			}	
				
			else if (theirChoice2.equals("B")) {
				FightGateGuards(mainCharacter);
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
				FightGateGuards(mainCharacter);
			}
				
			
			
			else if (theirChoice3.equals("B")) {
				LookAroundFindSewer();
			}
		}
		
		private static void Choice1Bit(MainCharacter mainCharacter) {
			System.out.println("Will you: A) Start to circle the wall searching for an alternative way in");
			System.out.println(" B) Impersonate a farmer trying to seek refuge in the city");
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
				FightGateGuards(mainCharacter);
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