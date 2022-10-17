package grocerystore;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner keyboardinput = new Scanner(System.in);

		Kund k1 = new Kund();

		VaraRabatt vara1 = new VaraRabatt("Protein Powder", 230, 90, 0.25);
		Vara vara2 = new Vara("Sport Drink", 25, 75);
		Vara vara3 = new Vara("Creatine", 249, 50);

		while (true) {

			System.out.println(
					"1. Buy " + vara1.getName() + ", " + vara1.getDiscount() + " SEK, " + vara1.getStock() + " left");
			System.out.println(
					"2. Buy " + vara2.getName() + ", " + vara2.getCost() + " SEK, " + vara2.getStock() + " left");
			System.out.println(
					"3. Buy " + vara3.getName() + ", " + vara3.getCost() + " SEK, " + vara3.getStock() + " left");
			System.out.println("4. Quit");

			System.out.println("Choose your option:");

			int choice = keyboardinput.nextInt();

			if (choice == 1) {
				System.out.println("You chose 1");
				k1.setAddToCart(vara1.getDiscount());
				vara1.setProductStock();

			} else if (choice == 2) {
				System.out.println("You chose 2");
				k1.setAddToCart(vara2.getCost());
				vara2.setProductStock();

			} else if (choice == 3) {
				System.out.println("You chose 3");
				k1.setAddToCart(vara3.getCost());
				vara3.setProductStock();
			}

			else if (choice == 4) {
				System.out.println("You chose 4");
				System.out.println("You chose a total of " + k1.getArticlesBought() + " items. The total cost was "
						+ k1.getTotalCost() + " SEK");
				break;
			}

		}
		keyboardinput.close();
	}

}
