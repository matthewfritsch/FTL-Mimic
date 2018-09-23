package game;

public class Pawn {
	private int maxHealth;
	private int health;
	private String name;
	private boolean performingActivity;
	private int roundsTilActivityCompleted;
	
	public Pawn() {
		maxHealth = 2;
		health = 1;
		name = "NULLNAME";
		performingActivity = false;
		roundsTilActivityCompleted = -1;
	}
	
	public Pawn(String name, int maxHealth) {
		this.name = name;
		this.maxHealth = maxHealth;
		this.health = maxHealth;
		performingActivity = false;
		roundsTilActivityCompleted = -1;
	}
	
	public String toString() {
		return "Pawn at " + hashCode() + " named " + name + " with " + health  + "/" + maxHealth + " health.";
	}
	
	public int takeDamage(int x) {
		health-=x;
		return health;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}
	public int getMaxHealth() {
		return maxHealth;
	}
	
	public void performAction() {
		
	}
	
	public boolean heal(int healAddition) {
		if(healAddition + health > maxHealth) {
			health = maxHealth;
			return true;
		}
		health+=healAddition;
		return true;
	}
}
