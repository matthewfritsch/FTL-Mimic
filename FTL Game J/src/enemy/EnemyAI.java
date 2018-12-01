package enemy;

import game.Ship;

public class EnemyAI{
	private Ship s;
	public enum AITYPE{
		AGGRESSIVE,
		PASSIVE,
		HYBRID,
		BOSS
	}
	
	private AITYPE a;
	public EnemyAI(Ship s, AITYPE a) {
		this.s = s;
		this.a = a;
		performAI(a);
	}
	private void performAI(AITYPE a) {
		 if(a == AITYPE.AGGRESSIVE) {
			 
		 }
		 else if(a == AITYPE.BOSS) {
			 
		 }
		 else if(a == AITYPE.HYBRID) {
			 
		 }
		 else if(a == AITYPE.PASSIVE) {
			 
		 }
	}
	
	
	
	
	
}
