import java.util.Scanner;

public class Belias {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);	
		int heroHealth, baliasHealth;
		heroHealth = 1600;
		baliasHealth = 400; 			
		boolean lowHealth = false;		
		
		//introductions
		System.out.println("Belias - You dare challenge me!");
		System.out.println("type *attack* to attack");
		
		//combat
		do{
			String combat = scanner.nextLine();
		
		
		if(combat.equals("attack")){
			
			baliasHealth -= Math.round((Math.random()*((35-10)))+10);
			System.out.println("Belias' current health is " + baliasHealth);
			heroHealth -= Math.round((Math.random()*((100-40)))+40);
			System.out.println("Your current health is " + heroHealth);
		
			if(baliasHealth <= 100 && lowHealth == false) {
			System.out.println("Belias - UwU What's this? *notices bulge*");
			lowHealth = true;
		}
		}
		
		else{
			System.out.println("Try agian!");
		
	}
	
	//victory
	}while(baliasHealth>0);

		System.out.println("congratulations! you killed the last of a species, i hope you'r happy");
		
	}
}