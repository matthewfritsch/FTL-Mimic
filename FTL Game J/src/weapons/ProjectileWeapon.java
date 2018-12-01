package weapons;

public class ProjectileWeapon extends Weapon {

	public ProjectileWeapon() {
		this.ammo = 10;
		this.cooldownActions = 4;
		this.currentCooldown = 0;
		this.damageProduced = 2;
		this.damageTakenFromPlayer = 0;
		this.isFunctional = true;
		this.systemHealth = 2;
		this.currentSysHealth = systemHealth;
		this.actionsToFix = 3;
		this.sysName = "Standard Projectile Weapon";
	}
	
	public ProjectileWeapon(int ammo, int cooldownActions, int damageProduced, int selfDamage, boolean isFunc, int systemHealth, int actionsToFix) {
		this.ammo = ammo;
		this.cooldownActions = cooldownActions;
		this.damageProduced = damageProduced;
		this.currentCooldown = 0;
		this.damageTakenFromPlayer = selfDamage;
		this.isFunctional = isFunc;
		this.systemHealth = systemHealth;
		this.currentSysHealth = systemHealth;
		this.actionsToFix = actionsToFix;
		this.sysName = "Standard Projectile Weapon";
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
			this.currentCooldown = this.cooldownActions;
			return this.damageProduced;
		}
		return 0;
	}
	
}
