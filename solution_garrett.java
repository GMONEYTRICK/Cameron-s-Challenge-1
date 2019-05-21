import java.util.Scanner;

class hero {

	int heroCurrentHealth;
	
	int heroHealth(int damage, int heroCurrentHealth) {
		
		heroCurrentHealth -= damage;
		return heroCurrentHealth;
		
	}
	
	int heroDamage() {
		
		int hitNumber =(int) Math.round((Math.random()*((35-10)+1))+10);
		return hitNumber;
	}
	
	int setHeroHealth(int health) {
		heroCurrentHealth = health;
		return heroCurrentHealth;
	}
	
	int getHeroHealth() {
		return heroCurrentHealth;
	}
}

class belias {

	int beliasCurrentHealth;
	boolean lowHealth = false; 
	
	int beliasHealth(int damage, int beliasCurrentHealth) {
	
		//deducts the attack damage from belias' current health
		beliasCurrentHealth -= damage;
		
		//condition for below 25%
		if(beliasCurrentHealth<100 && lowHealth == false ) {
			System.out.println();
			System.out.println("Bwuahaha, you'll never defeat me!!!");
			System.out.println();
			lowHealth = true;
		}
		return 	beliasCurrentHealth;
	}
	
	int beliasDamage() {
		
		int hitNumber =(int) Math.round((Math.random()*((100-40)+1))+40);
		return hitNumber;
		
	}
	
	int setBeliasHealth(int health) {
		beliasCurrentHealth = health;
		return beliasCurrentHealth;
	}
	int getBeliasHealth() {
		return beliasCurrentHealth;
	}
}


class solution_garrett {
	
	static belias beliasObject = new belias();
	static hero heroObject = new hero();
	static Scanner input = new Scanner(System.in);
	static String command;
	
	
	
	public static void main (String args[]) {
		beliasObject.setBeliasHealth(400);
		heroObject.setHeroHealth(1600);
		
		System.out.println("You have summoned the great and powerful Belias, the Gigas!");
		System.out.println("You must defeat him in combat. To attack, press space!");
		
		solution_garrett.combat();
		
		System.out.println("Congratulations!!! You defeated Belias, the Gigas!");
	}
	
	
	static void combat() {
			
			command = input.nextLine();
		
			do {
				
				System.out.println();
				
				//you hit him
				System.out.println("You swing your mighty axe at the quite frankly gross looking Belias.");
			
				beliasObject.setBeliasHealth(beliasObject.beliasHealth(heroObject.heroDamage(), beliasObject.getBeliasHealth()));
				System.out.println();
				System.out.println("Belias now has " + beliasObject.getBeliasHealth() + " health points.");
				System.out.println();
				
				if(beliasObject.getBeliasHealth() <= 0) {
					continue;
				}
			
				//he hits you
				System.out.println("That son of a bitch Belias swipes his giant meat hook at you.  LOOK OUT!");
				heroObject.setHeroHealth(heroObject.heroHealth(beliasObject.beliasDamage(), heroObject.getHeroHealth()));
				System.out.println();
				System.out.print("You now have " + heroObject.getHeroHealth() + " health points.");
				System.out.println();
				
				solution_garrett.combat();
			
			}while(beliasObject.getBeliasHealth() > 0 && heroObject.getHeroHealth() > 0 && command.equals("attack"));
			
	}
}
