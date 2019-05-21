import java.util.Scanner;

public class battle {
	
	public static belias beliasObject = new belias();
	public static hero heroObject = new hero();
	public static Scanner input = new Scanner(System.in);
	
	public static void main (String args[]) {
		beliasObject.setBeliasHealth(400);
		heroObject.setHeroHealth(1600);
		
		System.out.println("You have summoned the great and powerful Belias, the Gigas!");
		System.out.println("You must defeat him in combat. To attack, press space!");
		
		battle.combat();
		
		System.out.println("Congratulations!!! You defeated Belias, the Gigas!");
	}
	
	
	public static void combat() {
			
			do {
				
				System.out.println();
				
				//you hit him
				System.out.println("You swing your mighty axe at the quite frankly gross looking Belias.");
			
				beliasObject.setBeliasHealth(beliasObject.beliasHealth(heroObject.heroDamage(), beliasObject.getBeliasHealth()));
				System.out.println();
				System.out.print("Belias now has " + beliasObject.getBeliasHealth());
				System.out.println(" health points.");
				System.out.println();
				
				if(beliasObject.getBeliasHealth() <= 0) {
					continue;
				}
			
				//he hits you
				System.out.println("That son of a bitch Belias swipes his giant meat hook at you.  LOOK OUT!");
				heroObject.setHeroHealth(heroObject.heroHealth(beliasObject.beliasDamage(), heroObject.getHeroHealth()));
				System.out.println();
				System.out.print("You now have " + heroObject.getHeroHealth());
				System.out.println(" health points.");
				System.out.println();
				
				battle.combat();
			
			}while(beliasObject.getBeliasHealth() > 0 && heroObject.getHeroHealth() > 0 && input.nextLine().equals("attack"));
			
	}
}
