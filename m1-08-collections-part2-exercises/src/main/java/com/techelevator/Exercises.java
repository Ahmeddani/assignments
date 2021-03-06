package com.techelevator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;;
public class Exercises {

	/*
	 * Dictionary/Map Exercises
	 */
	
	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").  
	 * 
	 * The animal name should be case insensitive so "elephant", "Elephant", and 
	 * "ELEPHANT" should all return "herd". 
	 * 
	 * If the name of the animal is not found, null, or empty, return "unknown". 
	 * 
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * 
	 */
	public String animalGroupName(String animalName) {
		
<<<<<<< HEAD
		Map<String,String> animalGroup = new HashMap<String, String>();
		animalGroup.put("rhino", "Crash");
		animalGroup.put("giraffe", "Tower");
		animalGroup.put("elephant", "Herd");
		animalGroup.put("lion", "Pride");
		animalGroup.put("crow", "Murder");
		animalGroup.put("pigeon", "Kit");
		animalGroup.put("flamingo", "Pat");
		animalGroup.put("deer", "Herd");
		animalGroup.put("dog", "Pack");
		animalGroup.put("crocodile", "Float");
		
		if(animalGroup.containsKey(animalName.toLowerCase())) {
			
			return animalGroup.get(animalName.toLowerCase());
		}
		
		return "unknown";
=======
		Map<String, String> animalGroupNames = new HashMap<String, String>();
		animalGroupNames.put("RHINO", "Crash");
		animalGroupNames.put("GIRAFFE", "Tower");
		animalGroupNames.put("ELEPHANT", "Herd");
		animalGroupNames.put("LION", "Pride");
		animalGroupNames.put("CROW", "Murder");
		animalGroupNames.put("PIGEON", "Kit");
		animalGroupNames.put("FLAMINGO", "Pat");
		animalGroupNames.put("DEER", "Herd");
		animalGroupNames.put("DOG", "Pack");
		animalGroupNames.put("CROCODILE", "Float");
		
		if (animalName == null 
				|| animalName.equals("") 
				|| !animalGroupNames.containsKey(animalName.toUpperCase())) {
			return "unknown";
		}
		
		
		return animalGroupNames.get(animalName.toUpperCase());
		
>>>>>>> f224f1587b4e5a69363b4be9bd346f2b8264412b
	}
	

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 * 
	 * If the item number is empty or null, return 0.00.
	 * 
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 * 
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *  
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00 
	 * 
	 */
	public Double isItOnSale(String itemNumber) {
		
		Map<String,Double> onSaleGroup = new HashMap<String, Double>();
		
		onSaleGroup.put("KITCHEN4001", 0.20);
		onSaleGroup.put("GARAGE1070", 0.15);
		onSaleGroup.put("LIVINGROOM", 0.10);
		onSaleGroup.put("KITCHEN6073", 0.40);
		onSaleGroup.put("BEDROOM3434", 0.60);
		onSaleGroup.put("BATH0073", 0.15);
		
		if(onSaleGroup.containsKey(itemNumber.toUpperCase())) {
			
			return onSaleGroup.get(itemNumber.toUpperCase());
		}
		
		
		return 0.00;
	}
	
	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 * 
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 * 
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 * 
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		
		if(peterPaul.get("Peter") > 0 && peterPaul.get("Paul") < 1000 ) {
			
			Integer peterHalfValue = (peterPaul.get("Peter") / 2);
			Integer peterFinalValue = peterPaul.get("Peter") - peterHalfValue;
			Integer paulInitialValue = peterPaul.get("Paul");
			Integer paulFinalValue = paulInitialValue + peterHalfValue;
			peterPaul.put("Peter",  peterFinalValue);
			peterPaul.put("Paul",  paulFinalValue);
			return peterPaul;
		}
		else {
		return peterPaul;
	}
	}
    /*
	 * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 * 
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750, "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 * 
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		
		Integer peterFirstValue = peterPaul.get("Peter");
		Integer peterQuarterValue = peterFirstValue / 4;
		Integer peterPartnershipValue = peterFirstValue - peterQuarterValue;
		Integer paulFirstValue = peterPaul.get("Paul");
		Integer paulQuarterValue = paulFirstValue / 4;
		Integer paulPartnershipValue = paulFirstValue - paulQuarterValue;
		Integer PeterPaulPartnership = peterQuarterValue + paulQuarterValue;
		if(peterPaul.get("Peter") >= 5000 && peterPaul.get("Paul") >= 10000) {
			
			peterPaul.put("Peter", peterPartnershipValue);
			peterPaul.put("Paul", paulPartnershipValue);
			peterPaul.put("PeterPaulPartnership", PeterPaulPartnership);
		}
		return peterPaul;
	}
	
	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array, 
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		
		Map<String, String> beginningAndEndingMap = new HashMap<String, String>();
		for(String word: words) {
			
			beginningAndEndingMap.put(word.substring(0,1), word.substring(word.length()-1));
		}
		return beginningAndEndingMap;
	}
	
	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the 
	 * number of times that string appears in the array.
	 * 
	 * ** A CLASSIC **
	 * 
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 * 
	 */
	public Map<String, Integer> wordCount(String[] words) {
		
		Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
		
		for(String word : words) {
			
			if(!wordCountMap.containsKey(word)) {
				
				wordCountMap.put(word, 1);
			}
			
			else {
				
				int count = wordCountMap.get(word);
				wordCountMap.put(word, count + 1);
			}
		}
		return wordCountMap;
	}
	
	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the 
	 * number of times that int appears in the array.
	 * 
	 * ** The lesser known cousin of the the classic wordCount **
	 * 
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 * 
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> integerCountMap = new HashMap<Integer, Integer>();
		
		for(int intKey : ints) {
			//Check to see if the integer is not in the map 
			if(!integerCountMap.containsKey(intKey)) {
				
				integerCountMap.put(intKey, 1);
			}
			//If intkey is already in the map increment it's count by 1.
			else {
				
				int count = integerCountMap.get(intKey);
				integerCountMap.put(intKey, count + 1);
			}
			
		}
		return integerCountMap;
	}
	
	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and value
	 * is true only if that string appears 2 or more times in the array.
	 * 
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 * 
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		
		Map<String, Boolean> wordMultipleMap = new HashMap<String, Boolean>();
		
		for(String str : words) {
			
			if(!wordMultipleMap.containsKey(str)) {
				
				wordMultipleMap.put(str, false);
			}
			else {
			wordMultipleMap.put(str, true);
			}
		}
		return wordMultipleMap;
	}
	
	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2, 
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 * 
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *  
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 * 
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
		Map<String, Integer> consolidateInventoryMap = new HashMap<String, Integer>();
		
		
		for(String str : mainWarehouse.keySet()) {
			
			if(remoteWarehouse.containsKey(str)) {
				consolidateInventoryMap.put(str, mainWarehouse.get(str) + remoteWarehouse.get(str));
				
			}
			else {
				
				consolidateInventoryMap.put(str, mainWarehouse.get(str));
			}
			
			}
		
		for(String str2 : remoteWarehouse.keySet()) {
			
			if(!consolidateInventoryMap.containsKey(str2)) {
				consolidateInventoryMap.put(str2, remoteWarehouse.get(str2));
				
			}
		}
		
		
		return consolidateInventoryMap;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 * 
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears 
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1. 
	 * 
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.  
	 * 
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *  
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 * 
	 */
	public Map<String, Integer> last2Revisted(String[] words) {
		
		Map<String, Integer> last2RevistedMap = new HashMap<String, Integer>();
		
		for(String str : words) {
			int count = 0;
			String lastSubstring = str.substring(str.length() - 2);
			for(int i = 0; i < str.length() - 2; i++) {
				
				if(str.substring(i, i+2).equals(lastSubstring) ) {
					
					count++;
				}
			}
			last2RevistedMap.put(str, count);
		}
		return last2RevistedMap;
	}

	/*
	 Given a list of Strings, return a list that contains the distinct values. In other words, no value is to be
	 included more than once in the returned list. (Hint: Think Set)
	 distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) -> ["red", "yellow", "green", "blue", "purple"]
	 distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) -> ["jingle", "bells", "all", "the", "way"]
	 */
	public List<String> distinctValues(List<String> stringList) {
		
		List<String> distinctValuesList = new ArrayList<String>();
		Set<String> set = new HashSet<String>();
		for(int i = 0; i < stringList.size(); i++) {
			
			set.add(stringList.get(i));
		}
		
		for(String str : set) {
			
			distinctValuesList.add(str);
		}
		return distinctValuesList;
	}

}
