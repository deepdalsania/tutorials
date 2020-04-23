package extraknowledge;

import java.util.*; 
public class SortSet_Demo {
	
//Java code for adding elements in Set 
	public static void main(String[] args) 
	{ 
		// Set deonstration using HashSet 
		Set<String> hashSet = new HashSet<String>(); 
		hashSet.add("BalajiInfoTech"); 
		hashSet.add("Welcomes"); 
		hashSet.add("You"); 
		hashSet.add("In"); 
		hashSet.add("BalajiInfoTech"); 
		
		// Set deonstration using TreeSet 
		System.out.println("Sorted Set : "); 
		Set<String> treeSet = new TreeSet<String>(hashSet); 
		for (String string : treeSet) {
			System.out.println(string); 
		}
		
	} 
} 
