package package1;

import java.util.Scanner;

public class Game {
	
	public void partie() {
		// TODO Auto-generated method stub
		
		System.out.println("Le jeu des devinettes ! ");
		Scanner userInput = new Scanner(System.in);
		int essais = 0;
 
			while (essais < 11) {
				int secretNumber = (int) (Math.random() * 1000 + 1);
				int userInt = userInput.nextInt();
				System.out.println("La partie commence, veuillez essayez de trouver de chiffre mystère, vous avez 10 tentatives !");
				if (secretNumber > userInt) {
					essais++;
					System.out.println("Le nombre que vous avez saisi est plus grand !");
				}
				
				if (secretNumber < userInt) {
					essais++;
					System.out.println("Le nombre que vous avez saisi est plus petit ! ");
				}
				
				else {
					if (essais > 11) {
						System.out.println("Vous avez perdu !");
					}
				}
				
		}
				
	}
	
}
