
public class Interfaces {
	public interface IMainCharacter extends IPlayer{
		void CreateStats();
	}
	
	public interface IEnemy extends IPlayer{
		
	}
	
	public interface IPlayer{
		int GetSkill();
		int GetHealth();
		void LoseHealth();
		boolean IsDead();
	}
	
	public interface IBattleSequencer{
		void Battle(IMainCharacter main, IEnemy enemy);
	}
}
