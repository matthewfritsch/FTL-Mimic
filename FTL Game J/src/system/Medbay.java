package system;

import game.Pawn;

public class Medbay extends Systems {
	private int healthProduction;
	private Pawn[] charInMedbay;

	public Medbay() {
		healthProduction = 30;
		charInMedbay = new Pawn[3];
	}

	public Medbay(int healthProduction) {
		this.healthProduction = healthProduction;
		charInMedbay = new Pawn[3];
	}

	public boolean takeInMedbay(Pawn c) {
		if (c.getHealth() < c.getMaxHealth()) {
			c.heal(healthProduction);
			return true;
		}
		return false;
	}

	public String status() {
		String stat = "";
		for (int x = 0; x < charInMedbay.length; x++) {
			if (charInMedbay[x] == null) {
				stat += "<Empty Spot>\n";
			} else
				stat += ("Pawn named " + charInMedbay[x].getName() + " is " + stability(charInMedbay[x]) + " at health "
						+ charInMedbay[x].getHealth() + ".\n");

		}
		return stat;
	}

	private String stability(Pawn p) {
		if (p.getHealth() == p.getMaxHealth())
			return "full health";
		else if (p.getHealth() > (p.getMaxHealth() / 3) * 2)
			return "injured";
		else if (p.getHealth() > p.getMaxHealth() / 3) {
			return "wounded";
		} else
			return "critical";
	}

	public void heal() {
		for (Pawn p : charInMedbay) {
			if (p != null) {
				p.heal(this.healthProduction);
			}
		}
	}

	@Override
	public boolean waitAction() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.err
				.println("Error! Produced a case of 'Medbay' calling 'waitTurn' function. No actions to be performed.");
		Exception e = new Exception("Improper waitRound() action!");
		e.printStackTrace();
		return false;
	}

	public String toString() {
		return "Medbay at " + hashCode() + " with a production of " + healthProduction
				+ " and with the following status:\n" + status();
	}

}
