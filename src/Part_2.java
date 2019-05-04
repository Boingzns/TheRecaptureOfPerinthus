
public class Part_2 {

	static BattleSequencer battler;

	public static void Approach_the_Castle(MainCharacter mainy) {
		KindInputTaker input = new KindInputTaker();
		battler = new BattleSequencer(input);

		System.out.println("Having infiltrated the castle you begin to make your way into its heart in search of your mark");
		System.out.println("you reach a junction in the corridor and before you can chose a direction you hear approaching footsteps");
		
		input.PressEnterToContinue();
		System.out.println("Will you: A) take the left path down the stairs");
		System.out.println(" B) take the right continuing onto another corridor");
		System.out.println(" C) hide and see who is approaching");
		String theirChoice = input.GetChoice();
		
		if (theirChoice.equals("A")) {
			LookAroundFindCastleSewer();
		}
		
	}

	private static void LookAroundFindCastleSewer() {
		// TODO Auto-generated method stub
		
	}
}



