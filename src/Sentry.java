public class Sentry implements Interfaces.IEnemy {
	private int Health = 8;
	
	public int GetSkill() {
		return 10;
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
