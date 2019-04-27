import java.util.Scanner;

public class MainTesting {

	public static void main(String[] args) {
		BattleSequencer fighter = new BattleSequencer(new KindInputTaker());
		MainCharacter mainPerson = new MainCharacter();
		mainPerson.CreateStats();
		ZeBaker enemy = new ZeBaker();
		
		fighter.Battle(mainPerson, enemy);
	}
}
