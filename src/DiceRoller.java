import java.util.Random;

public class DiceRoller {

	private static Random rand = new Random();

	public static int RollDice() {
		return rand.nextInt(6) + 1;
	}
}