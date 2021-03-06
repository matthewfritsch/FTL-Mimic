package game;

import system.Medbay;
import weapons.LaserWeapon;
import weapons.ProjectileWeapon;

public class testingFile {

	public static void main(String[] args) {
		pawnTest();
		
		medbayTest();
		
		lwepTest();
		
		pwepTest();
		
		
		
		
		
		System.out.println("All done!");
	}
	
	private static void lwepTest() {
		System.out.println("-Testing LaserWeapon instantiation-\n");
		LaserWeapon l = new LaserWeapon();
		System.out.println(l.toString());
		System.out.println("Waiting round while unnecessary");
		l.waitRound();
		System.out.println(l.toString());
		System.out.println("Performing attack");
		l.performAttack();
		System.out.println(l.toString());
		System.out.println("Waiting round while necessary");
		l.waitRound();
		System.out.println(l.toString());
		System.out.println("\n-Finished LaserWeapon instantiation-\n");
		
	}
	private static void pwepTest() {
		System.out.println("-Testing a ProjectileWeapon-\n");
		ProjectileWeapon p = new ProjectileWeapon();
		System.out.println(p.toString());
		System.out.println("Waiting round while unnecessary");
		p.waitRound();
		System.out.println(p.toString());
		System.out.println("Performing attack");
		p.performAttack();
		System.out.println(p.toString());
		System.out.println("Waiting round while necessary");
		p.waitRound();
		System.out.println(p.toString());
		System.out.println("\n-Finished ProjectileWeapon instantiation-\n");
	}
	
	private static void pawnTest() {
		System.out.println("-Testing Pawn instantiation-\n");
		Pawn x = new Pawn();
		Pawn a = new Pawn("Alpha", 100);
		Pawn b = new Pawn("Bravo", 200);
		Pawn c = new Pawn("Charlie", 50);
		
		System.out.println(x.toString());
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		
		System.out.println("\n-Finished Pawn instantiation-\n");
		
	}
	
	private static void medbayTest() {
		System.out.println("-Testing Medbay instantiation-\n");
		Medbay a = new Medbay();
		Medbay b = new Medbay(20);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println("Adding Pawn 'David' with 30/100 health\n");
		Pawn t = new Pawn("David", 100); 
		t.takeDamage(70);
		b.takeInMedbay(t);
		System.out.println(b.toString());
		b.heal();
		System.out.println(b.toString());
		
		System.out.println("Testing error on waitRound()\n");
		b.waitRound();
		System.out.println();

		System.out.println("-Finished Medbay instantiation-\n");
	}

}
