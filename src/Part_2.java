
public class Part_2 {

	static BattleSequencer battler;

	public static void The_Keep(MainCharacter mainy) {
		KindInputTaker input = new KindInputTaker();
		battler = new BattleSequencer(input);


		System.out.println("Having infiltrated the castle, you now head for the keep");
		System.out.println("Scanning the area for possible entries, you come up with some ideas");
		input.PressEnterToContinue();
		System.out.println("Will you A) head to the banqueting hall and ajoining kitchens");
		System.out.println(" B) head into the myriad of corridors that make up the lower parts of the keep");
		System.out.println(" C) investigate the commotion at the gates");
		String theirChoice10 = input.GetChoice();
		
			if (theirChoice10.equals("B")) {
			System.out.println("Having infiltrated the castle itself you begin to make your way into its heart in search of your mark");
			System.out.println("you reach a junction in the corridor and before you can chose a direction you hear approaching footsteps");
			input.PressEnterToContinue();
			System.out.println("Will you: A) take the left path down the stairs");
			System.out.println(" B) take the right continuing onto another corridor");
			System.out.println(" C) hide and see who is approaching");
			String theirChoice11 = input.GetChoice();
			
				if (theirChoice11.equals("A")) {
					LookAroundFindCastleSewer();
		}}
		
	}

	private static void LookAroundFindCastleSewer() {
		// TODO Auto-generated method stub
		
	}
}



