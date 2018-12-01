package weapons;

import system.Systems;

public abstract class Weapon extends Systems {
	protected int ammo;
	protected int cooldownActions;
	protected int damageProduced;
	protected int damageTakenFromPlayer;
	protected int currentCooldown;
	protected int pctChanceHit;

	public boolean performAction() {
		System.err.println("Weapon system requested to perform action, no listed action. Should be 'performAttack' to use weapon.");
		new Exception().printStackTrace();
		return false;
	}
	public abstract int performAttack();

	public boolean waitAction() {
		if (isCoolingDown()) {
			currentCooldown--;
			if (currentCooldown == 0) {
				return true;
			}
		}
		return false;
	}
	
	public String fireString() {
		return (this.sysName + " fires providing " + this.performAttack() + " damage. Ammo is at " + this.ammo);
	}

	protected boolean isCoolingDown() {
		if (currentCooldown > 0)
			return false;
		return true;
	}
	
	public String toString() {
		return ("Weapon at " + hashCode() + " has ammo quantity: " + ammo + " and player has " + currentCooldown + "/" + cooldownActions + " Actions remaining til cooled down.");
	}
}