package weapons;

public class LaserWeapon extends Weapon {

	public LaserWeapon() {
		this.ammo = -1;
		this.cooldownActions = 2;
		this.currentCooldown = 0;
		this.damageProduced = 1;
		this.damageTakenFromPlayer = 0;
		this.isFunctional = true;
		this.systemHealth = 1;
		this.currentSysHealth = systemHealth;
		this.actionsToFix = 2;
		this.sysName = "Standard Laser Weapon";
	}

	public LaserWeapon(int cooldownactions, int damageProduced, int selfDamage, boolean isFunc, int systemHealth, int actionsToFix) {
		this.ammo = -1;
		this.cooldownActions = cooldownactions;
		this.damageProduced = damageProduced;
		this.currentCooldown = 0;
		this.damageTakenFromPlayer = selfDamage;
		this.isFunctional = isFunc;
		this.systemHealth = systemHealth;
		this.currentSysHealth = systemHealth;
		this.actionsToFix = actionsToFix;
		this.sysName = "Standard Laser Weapon";
	}
	
	@Override
	public int performAttack() {
		/* this is a laser weapon, so ammo = -1
		 *we will need to return damage all the time as soon as we set this thing to
		 *cooldown*/
		if (this.isFunctional && this.isCoolingDown() == false) {
			this.currentCooldown = this.cooldownActions;
			return this.damageProduced;
		}
		return 0;
	}
}
