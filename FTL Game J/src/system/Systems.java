package system;

public abstract class Systems {
	protected int systemHealth;
	protected int currentSysHealth;
	protected boolean isFunctional;
	protected int actionsToFix;
	protected int currentActionFixing;
	protected String sysName;
	public boolean repair() {
		currentActionFixing++;
		if(currentActionFixing == actionsToFix) {
			currentActionFixing = 0;
			isFunctional = true;
			currentSysHealth = systemHealth;
			return isFunctional;
		}
		return false;
	}
	public abstract boolean waitAction();
	
	public void loseHealth() {
		loseHealth(1);
	}

	public void loseHealth(int damage) {
		currentSysHealth--;
		if (currentSysHealth == 0) {
			this.isFunctional = false;
		}
	}
	public String getName() {
		return sysName;
	}
	public boolean getFunctional() {
		return isFunctional;
	}
	public void printStatus() {
		if(this.isFunctional) 
			System.out.println(sysName + " has " +currentSysHealth + " out of " + systemHealth);
		else {
			System.out.println(sysName + " is currently nonfunctional. It needs " + currentActionFixing + " repair actions.");
		}
	}
}
