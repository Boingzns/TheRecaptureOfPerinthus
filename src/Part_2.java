import java.util.Scanner;

public class Part_2 {

	static BattleSequencer battler;

	public static void Approach_the_Castle(MainCharacter mainy) {
		KindInputTaker input = new KindInputTaker();
		battler = new BattleSequencer(input);

		System.out.println("Having infiltrated the city, you now head for the castle");
		System.out.println("Scanning the area for possible entries, you come up with some ideas");
		
		input.PressEnterToContinue();
		System.out.println("Will you: A) Head to the sewer network to try and get under the walls");
		System.out.println(" B) Impersonate a servant returning from the market");
		System.out.println(" C) Try and take out the guards at an entrance to force your way through");
		String theirChoice = input.GetChoice();
		
		if (theirChoice.equals("A")) {
			LookAroundFindCastleSewer();
		}
		
	}

	private static void LookAroundFindCastleSewer() {
		// TODO Auto-generated method stub
		
	}
}



