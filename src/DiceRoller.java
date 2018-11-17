import java.util.Random;

public class DiceRoller {

	private static Random rand = new Random();

	public static int RollDice() {
		// returns a number between 1 and 6
		return rand.nextInt(6) + 1;
	}
	
	public static int GeneratePhraseIndex(int phrasesLength) {
		// returns a number that works with phrases array
		return rand.nextInt(phrasesLength);
	}
}