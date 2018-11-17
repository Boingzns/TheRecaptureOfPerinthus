public class SimpleEnemy implements Interfaces.IEnemy {
	private int Health = 5;
	
	public int GetSkill() {
		return 50;
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
}
