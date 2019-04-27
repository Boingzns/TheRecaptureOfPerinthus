import java.util.Scanner;
public class KindInputTaker{
	Scanner scanner;
	
	public KindInputTaker() {
		scanner = new Scanner(System.in);
	}
	
	public String GetChoice() {
		
		String whatTheyWrote = scanner.nextLine();
		
		while (whatTheyWrote.length() != 1 
				&& (itsNotA B or C)) {
			System.out.println("Try again");
			whatTheyWrote = scanner.nextLine();
		};

		// lower and upper case => should both work
		// empty input (space or whatever) -> should do it again
		// random input -> another chance , go again
		
		
		return whatTheyWrote;
		
	}
	
	public void PressEnterToContinue() {
		scanner.nextLine();
	}
	
	public void Close() {
		scanner.close();
	}
}
