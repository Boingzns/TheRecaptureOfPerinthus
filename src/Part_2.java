
public class Part_2 {

	static BattleSequencer battler;
	static KindInputTaker input;
	static MainCharacter mainCharacter;

	public static void The_Keep(MainCharacter mainy) {
		input = new KindInputTaker ();
		battler = new BattleSequencer(input);
		mainCharacter = mainy;
		
		theirChoice10();
	}

	private static void FightGateGuards1() {
		BasicMilitia[] guards = new BasicMilitia[] { 
				new BasicMilitia(), 
				new BasicMilitia(), 
				new BasicMilitia(), 
				new BasicMilitia()};
		battler.Battle(mainCharacter, guards);
	}
	
	private static void LookAroundFindCastleDungeon() {
		System.out.println("Walking down the stairs you ");
		System.out.println("THERE IS A DRAGON");
		System.out.println("You dead aka. your adventure ends here");
	
	}
	private static void theirChoice10() {
		System.out.println("Scanning the crumbling courtyard for possible entries, you come up with some ideas");
		input.PressEnterToContinue();
		System.out.println("Will you: \n A) head into the myriad of corridors that make up the lower parts of the keep");
		System.out.println(" B) Head to the banqueting hall and ajoining kitchens");
		System.out.println(" C) Investigate the commotion at the gates");
		String theirChoice10 = input.GetChoice();
		
		if (theirChoice10.equals("A")) {
			System.out.println("Having infiltrated the castle itself you begin to make your way into its heart in search of your mark");
			System.out.println("you reach a junction in the corridor and before you can chose a direction you hear approaching footsteps");
			input.PressEnterToContinue();
			theirChoice11();
		}

		else if (theirChoice10.equals("B")) {
			System.out.println("As you enter the kitchen the smell rotting flesh assaults your nostrils");
			System.out.println("Nervously crossing the room you see a figure hunched over an oven");
			System.out.println("His muscles bulge out of his chefs outfit and he turns slowly to face you");
			System.out.println("You have met... Ze Baker");
			System.out.println("Your advenure ends here");
		}

		else if (theirChoice10.equals("C")) {
			FightGateGuards1();	
		}
	}
		
	private static void theirChoice11() {
		System.out.println("Will you: \n A) take the left path down the stairs");
		System.out.println(" B) Take the right continuing onto another corridor");
		System.out.println(" C) Hide and see who is approaching");
		String theirChoice11 = input.GetChoice();
	
		if (theirChoice11.equals("A")) {
			LookAroundFindCastleDungeon();
		}
		
		else if (theirChoice11.equals("B")) {
		}
		
		else if (theirChoice11.equals("C")) {
			System.out.println("sdfsdf") ;
		}

	}
}



