package system;

import java.util.ArrayList;
import java.util.List;

public class Shield extends Systems {
	List<shieldLayer> layers = new ArrayList<shieldLayer>();
	private int maxLayers = 4;
	public Shield() {
		layers.add(new shieldLayer());
	}
	
	public void addLayer() {
		if(layers.size() < maxLayers) {
			layers.add(new shieldLayer());
		}
		else
			System.err.println("Attempt to add more layers than 'Shield' type allows.\n" + new Exception().getStackTrace());
	}

	@Override
	public boolean waitAction() {
		if(this.isFunctional)
			for(shieldLayer l : layers) {
				l.waitTurn();
			}
		return true;
	}
	
	public boolean takeDamage() {
		return takeDamage(1);
	}
	
	/*takeDamage(int damage) serves to be a function where the ship is taking more than just one damage.
	 * if a layer depletes from the attack, then it returns true
	 * otherwise, returns false if all shields are offline
	 */
	
	public boolean takeDamage(int damage) {
		for(shieldLayer l:layers) {
			if(l.takeDamage() == true) {
				return true;
			}
		}
		return false;
	}
	
		
	private class shieldLayer{
		private int cooldownActions;
		private int currentCooldown;
		public boolean isActive;
		public shieldLayer() {
			cooldownActions = 2;
			currentCooldown = 0;
			isActive = true;
		}
		
		public boolean waitTurn() {
			if(isActive == false) {
				currentCooldown--;
			}
			if(currentCooldown == 0)
				isActive = true;
			return isActive;
		}
		
		public boolean takeDamage() {
			if(isActive) {
				isActive = false;
				currentCooldown = cooldownActions;
				return true;
			}
			return false;
		}
	}



}
