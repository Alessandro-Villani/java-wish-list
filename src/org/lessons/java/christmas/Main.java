package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<String> wishList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		boolean nextWish = true;
		
		while(nextWish == true) {
			System.out.println("1. Aggiungi desiderio");
			System.out.println("2. Esci");
			int userChoice = sc.nextInt();
			sc.nextLine();
			
			switch(userChoice) {
			case 1:
				System.out.println("Esprimi un desiderio");
				String wish = sc.nextLine();
				wishList.add(wish);
				System.out.println("Hai espresso " + wishList.size() + " desideri" + (wishList.size()<2 ? "o" : ""));
				break;
			case 2: 
				System.out.println("\n------------------\n\nLISTA DESIDERI\n\n------------------\n");
				for (String s : wishList) {
					System.out.println(s);
				}
				nextWish = false;
				break;
			default:
				System.out.println("Scelta non valida");
			}
		}

	}

}
