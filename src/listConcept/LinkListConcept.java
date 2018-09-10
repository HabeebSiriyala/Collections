package listConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		// add
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("TestNG");
		ll.add("RPA");
		ll.add("RFT");

		// print
		System.out.println("Content of LinkedList:" + ll);
		// addFirst
		ll.addFirst("Habeeb");
		// addlast
		ll.addLast("Automation");
		System.out.println("Content of LinkedList:" + ll);

		// get:
		System.out.println(ll.get(0));
		// set:
		ll.set(0, "Naveen");
		System.out.println(ll.get(0));

		System.out.println("Content of LinkedList:" + ll);

		// Remove the First and Last Element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of LinkedList" + ll);

		// remove the indexof number
		ll.remove(1);
		System.out.println("Content of LinkedList" + ll);

		// How to Print All the values of LinkedList:
		// Using--->For Loop

		System.out.println("****Using For Loop****");
		for (int n = 0; n < ll.size(); n++) {
			System.out.println(ll.get(n));
		}

		// Using---> Advanced For Loop

		System.out.println("****Using Advanced For Loop****");
		for (String str : ll) {
			// str---is the strings of all the LinkedList Object
			System.out.println(str);
		}

		// Iterator
		System.out.println("****Using Iterator****");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// While Loop
		System.out.println("****Using While Loop****");
		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}
	}
}
