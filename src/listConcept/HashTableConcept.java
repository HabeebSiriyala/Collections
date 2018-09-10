package listConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {

		// It is similar to HashMap, but it is Synchronized
		// Stores the value on the basis of Key-Value

		// Key--->Object---HashCode--->Value
		/*
		 * Key is specified of an object, each every object having one HashCode, on that
		 * Particular HashCode Value will be stored
		 */

		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();

		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Java");

		// Create a clone copy/shallow copy:
		Hashtable<String, String> h2 = new Hashtable<String, String>();

		h2 = (Hashtable) h1.clone();
		System.out.println("the value from h1  " + h1);
		System.out.println("the value from h2  " + h2);

		h1.clear();
		System.out.println("the value from h1  " + h1);
		System.out.println("the value from h2  " + h2);

		// Contains Value

		Hashtable<String, String> st = new Hashtable<String, String>();
		st.put("A", "Habeeb");
		st.put("B", "Manager");
		st.put("C", "Selenium");

		if (st.containsValue("Habeeb"))
			System.out.println("Values is Found");

		// Print all the values from Hashtable using---Enumeration---elements()
		Enumeration<String> e = st.elements();
		System.out.println("Print Values from st Using Enumeration");

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		// get all the values from Hashtable using----entrySet()---set of Hashtable
		// values:

		System.out.println("Print Values from st Using entrySet");

		Set s = st.entrySet();
		System.out.println(s);

		Hashtable<String, String> st1 = new Hashtable<String, String>();
		st1.put("A", "Habeeb");
		st1.put("B", "Manager");
		st1.put("C", "Selenium");
		st1.put("C", "Selenium");// it contains only Unique Values:
		// No null Key and Null Values
		// st1.put("D", Null); ----NullPointerException

		System.out.println("Values from St1");
		System.out.println(st1);

		// Check Both Hastables are equal or not
		if (st.equals(st1))
			System.out.println("Both st and st1 are Equal");

		// get the Value from a Key
		System.out.println(st1.get("A"));

		// get the HasCode of Hashtable Object:
		System.out.println("the HashCode value of st1 : " + st1.hashCode());

		// generics---it will clear all warnings like yellow lines
		Hashtable<String, String> st3 = new Hashtable<String, String>();
	}

}
