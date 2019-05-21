
public class belias {

	int beliasCurrentHealth;
	boolean lowHealth = false; 
	
	public int beliasHealth(int damage, int beliasCurrentHealth) {
	
		//deducts the attack damage from belias' current health
		beliasCurrentHealth -= damage;
		
		//condition for below 25%
		if(beliasCurrentHealth<100 && lowHealth == false ) {
			System.out.println();
			System.out.println("'UwU What's this? *notices bulge'  --Belias");
			System.out.println();
			lowHealth = true;
		}
		return 	beliasCurrentHealth;
	}
	
	public int beliasDamage() {
		
		int hitNumber =(int) Math.round((Math.random()*((100-40)+1))+40);
		return hitNumber;
		
	}
	
	public int setBeliasHealth(int health) {
		beliasCurrentHealth = health;
		return beliasCurrentHealth;
	}
	public int getBeliasHealth() {
		return beliasCurrentHealth;
	}
}
