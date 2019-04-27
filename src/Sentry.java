public class Sentry implements Interfaces.IEnemy {
	private int Health = 7;
	
	public int GetSkill() {
		return 6;
	}

	public int GetHealth() {
		return Health;
	}

	public void LoseHealth() {
	    Health -=3;
	}

	public boolean IsDead() {
		return Health <= 0;
	}

	public String GetHurtPhrase() {
		return "AHHHHAHAHAHAHAHHAHA";
	}

	public String GetName() {
		return "Sentry";
	}
}
