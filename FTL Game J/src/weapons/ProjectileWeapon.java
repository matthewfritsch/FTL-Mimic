package weapons;

public class ProjectileWeapon extends Weapon {

	public ProjectileWeapon() {
		this.ammo = 10;
		this.cooldownRounds = 4;
		this.currentCooldown = 0;
		this.damageProduced = 2;
		this.damageTakenFromPlayer = 0;
		this.isFunctional = true;
		this.systemHealth = 2;
		this.currentSysHealth = systemHealth;
		this.roundsToFix = 3;
	}
	
	public ProjectileWeapon(int ammo, int cooldownRounds, int damageProduced, int selfDamage, boolean isFunc, int systemHealth, int roundsToFix) {
		this.ammo = ammo;
		this.cooldownRounds = cooldownRounds;
		this.damageProduced = damageProduced;
		this.currentCooldown = 0;
		this.damageTakenFromPlayer = selfDamage;
		this.isFunctional = isFunc;
		this.systemHealth = systemHealth;
		this.currentSysHealth = systemHealth;
		this.roundsToFix = roundsToFix;
	}

	@Override
	public int performAttack() {
		/*this is a projectile weapon, so it could totally have no ammo.
		could also be nonop
		could also be in cooldown
		so a series of precautions are taken to make sure it's currently capable of being fired.
		*/
		if(this.ammo > 0 && this.isFunctional && this.isCoolingDown() == false) {
			this.ammo--;
			this.currentCooldown = this.cooldownRounds;
			return this.damageProduced;
		}
		return 0;
	}
	
}
