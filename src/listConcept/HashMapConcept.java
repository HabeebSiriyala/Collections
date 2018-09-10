package listConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {

		// HashMap is a Class implements Map interface
		// extends AbstractMap
		// It Contains only unique Elements
		// Stores the Values--Key--value pair
		// It may have one null key and multiple null values
		// It Maintains No Order

		// HashMap is Non-Synchronized---Not a Thread Safe
		/*
		 Synchronize means---One by One--if one thread is accessing the object at that
		 another Threads can't access it will wait untill first thread release
		 */

		// Concurrent Modification Exception---Fail-Fast Condition
		/*
		  When One thread Adding or removing the value and at the same time
		  concurrently another threads trying to access that value but that particular
		  value is gone from the object immediately it will gives Concurrent
		  Modification Exception
		 */

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		hm.put(4, "RFT");

		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));

		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);

		System.out.println("*********************************");
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

		Employee e1 = new Employee("Tomer", 25, "Admin");
		Employee e2 = new Employee("Peter", 26, "Dev");
		Employee e3 = new Employee("Steve", 27, "QA");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		// Traverse the HashMap
		for (Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee     " + key + "     INFO  ");

			System.out.println(e.name + "       " + e.age + "       " + e.dept);
		}

	}

}
