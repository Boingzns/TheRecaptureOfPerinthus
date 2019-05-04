import java.util.Scanner;
public class KindInputTaker{
	Scanner scanner;
	
	public KindInputTaker() {
		scanner = new Scanner(System.in);
	}
	
	public String GetChoice() {
		
		String whatTheyWrote = scanner.nextLine();
		
		while (whatTheyWrote.length() != 1 
				|| !AcceptableInput(whatTheyWrote))
		{
			System.out.println("Try again");
			whatTheyWrote = scanner.nextLine();
		}

		// lower and upper case => should both work
		// empty input (space or whatever) -> should do it again
		// random input -> another chance , go again
		
		
		return whatTheyWrote;
		
	}
	
	private boolean AcceptableInput(String whatTheyWrote) {
		// return true if its good "A" or "B" or "C"
		if (whatTheyWrote.equals("A") || whatTheyWrote.equals("B") || whatTheyWrote.equals("C"))
			return true;
		// return false if its not good
		else return false;
	}

	public void PressEnterToContinue() {
		System.out.println("Press enter to continue");
		scanner.nextLine();
	}
	
	public void Close() {
		scanner.close();
	}
}
