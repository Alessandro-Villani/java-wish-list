package org.java.myset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {


		Random rnd = new Random();
		Set<Integer> randomNumbers = new HashSet<>();
		
		while(randomNumbers.size() < 5) {
			int random = rnd.nextInt(2, 13);
			randomNumbers.add(random);
		}
		
		for(Integer num : randomNumbers) {
			System.out.println(num);
		}

	}

}
