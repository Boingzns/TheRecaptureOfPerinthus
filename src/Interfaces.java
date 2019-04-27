
public class Interfaces {
	public interface IMainCharacter extends IPlayer{
		void CreateStats();
		Inventory GetInventory();
	}
	
	public interface IEnemy extends IPlayer{
		String GetHurtPhrase();
		String GetName();
	}
	
	public interface IPlayer{
		int GetSkill();
		int GetHealth();
		void LoseHealth();
		boolean IsDead();
	}
	
	public interface IBattleSequencer{
		void Battle(IMainCharacter main, IEnemy[] enemies) throws InterruptedException;
		void Battle(IMainCharacter main, IEnemy enemy) throws InterruptedException;
	}
}
