package com.sac.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		/*Collection<String> list = Arrays.asList(new String[]{"Hello", "World!"});
		Collection<String> additionalList = new ArrayList<String>();

		for (String s : list) {
		    // Found a need to add a new element to iterate over,
		    // so add it to another list that will be iterated later:
		    additionalList.add(s);
		}

		for (String s : additionalList) {
		    // Iterate over the elements that needs to be iterated over:
		    System.out.println(s);
		}
	}*/
	
		 ArrayList<String> aList = new ArrayList<String>();
	      aList.add("Apple");
	      aList.add("Mango");
	      aList.add("Guava");
	      aList.add("Orange");
	      aList.add("Peach");
	      System.out.println("The ArrayList elements are: ");
	      for (String s: aList) {
	         System.out.println(s);
	      }
	      Iterator i = aList.iterator();
	      String str = "";
	      while (i.hasNext()) {
	         str = (String) i.next();
	         if (str.equals("Orange")) {
	            i.remove();
	            System.out.println("\nThe element Orange is removed");
	            break;
	         }
	      }
	      System.out.println("\nThe ArrayList elements are: ");
	      for (String s: aList) {
	         System.out.println(s);
	      }
		
		
	}

}
