package weapons;

import system.Systems;

public abstract class Weapon extends Systems {
	protected int ammo;
	protected int cooldownRounds;
	protected int damageProduced;
	protected int damageTakenFromPlayer;
	protected int currentCooldown;

	public abstract int performAttack();

	public boolean waitRound() {
		if (isCoolingDown()) {
			currentCooldown--;
			if (currentCooldown == 0) {
				return true;
			}
		}
		return false;
	}

	protected boolean isCoolingDown() {
		if (currentCooldown < cooldownRounds)
			return false;
		return true;
	}
	
	public String toString() {
		return ("Weapon at " + hashCode() + " has ammo quantity: " + ammo + " and player has " + currentCooldown + "/" + cooldownRounds + " rounds remaining til cooled down.");
	}
}