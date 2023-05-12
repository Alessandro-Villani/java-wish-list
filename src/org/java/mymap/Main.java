package org.java.mymap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";

		System.out.println(Arrays.asList(str.split(" ")));
		
		String[] splitStr = str.toLowerCase().split(" "); 
		
		Map<String, Integer> frequency = new HashMap<>();
		
		for(String s : splitStr ) {
			String strRes = "";
			for(Character c : s.toCharArray()) {
				if (Character.isAlphabetic(c)) {
					strRes += c;
				}
			}
			if (!strRes.equals("")) frequency.put(strRes, (frequency.containsKey(strRes) ? frequency.get(strRes) + 1 : 1));
		}
		
		System.out.println(frequency);

	}

}
