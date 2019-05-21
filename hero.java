
public class hero {

	int heroCurrentHealth;
	
	public int heroHealth(int damage, int heroCurrentHealth) {
		
		heroCurrentHealth -= damage;
		return heroCurrentHealth;
		
	}
	
	public int heroDamage() {
		
		int hitNumber =(int) Math.round((Math.random()*((35-10)+1))+10);
		return hitNumber;
	}
	
	public int setHeroHealth(int health) {
		heroCurrentHealth = health;
		return heroCurrentHealth;
	}
	
	public int getHeroHealth() {
		return heroCurrentHealth;
	}
}
