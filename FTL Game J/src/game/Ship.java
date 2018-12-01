package game;

import java.util.Scanner;

import system.Medbay;
import system.Shield;
import weapons.LaserWeapon;
import weapons.ProjectileWeapon;
import weapons.Weapon;

public class Ship {
	private int health;
	private Pawn[] pawns;
	private Medbay bay;
	private Shield shields;
	private Weapon [] weapons;
	public Ship() {
		health = 12;
		pawns = new Pawn[3];
		shields = new Shield();
		weapons = new Weapon[2];
		weapons[0] = new ProjectileWeapon();
		weapons[1] = new LaserWeapon();
		bay = new Medbay();
	}
	
	public String shootWeapon(Scanner s) {
		System.out.println("Please enter the type of weapon you'd like to choose:");
		for(int x = 0; x < weapons.length; x++) {
			System.out.println(x+1 + ". " + weapons[x].getName() + " is functional:" + weapons[x].getFunctional());
		}
		
		return weapons[s.nextInt()-1].fireString();
	}
	
}
