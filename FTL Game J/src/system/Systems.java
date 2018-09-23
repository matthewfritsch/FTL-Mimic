package system;

public abstract class Systems {
	protected int systemHealth;
	protected int currentSysHealth;
	protected boolean isFunctional;
	protected int roundsToFix;
	protected int currentRoundFixing;
	public boolean repair() {
		currentRoundFixing++;
		if(currentRoundFixing == roundsToFix) {
			currentRoundFixing = 0;
			isFunctional = true;
			currentSysHealth = systemHealth;
			return isFunctional;
		}
		return false;
	}
	public abstract boolean waitRound();
	
	public void loseHealth() {
		loseHealth(1);
	}

	public void loseHealth(int damage) {
		currentSysHealth--;
		if (currentSysHealth == 0) {
			this.isFunctional = false;
		}
	}
}
