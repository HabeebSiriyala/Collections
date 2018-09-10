package listConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		int[] a = new int[3];// static array---size is fixed

		// Dynamic Array----->ArrayList
		// 1.Can Contain Duplicate Values/Elements
		// 2.maintain insertion order
		// 3.Synchronized
		// 4.Allows random Acces to fetch the element because it stores the values on
		// the basis of indexes

		ArrayList ar = new ArrayList();

		ar.add(10);// 0
		ar.add(20);// 1
		ar.add(30);// 2

		System.out.println(ar.size());

		ar.add(10);// 3
		ar.add(20);// 4
		ar.add(40);// 5

		System.out.println(ar.size());// size of the ArrayList

		System.out.println(ar.get(4));// to get the value from an index

		System.out.println("*************");

		// to print all the values from ArrayList:
		// 1.For Loop
		// 2. using Iterator

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// non-generic Vs generic
		// after JDK 1.5version Generic will be there

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(200);
		// ar1.add("Selenium");

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Habeeb");
		ar2.add("Siriyala");

		ArrayList<E> ar3 = new ArrayList<E>();

		System.out.println("**********");

		// Employee Class Objects:
		Employee e1 = new Employee("abhi", 25, "QA");
		Employee e2 = new Employee("Habeeb", 25, "Dev");
		Employee e3 = new Employee("Ras", 25, "Admin");

		// create ArrayList:
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);

		// Iterator to traverse the values:
		Iterator<Employee> it = ar4.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}

		System.out.println("*************");

		// addAll() Method
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Test");
		ar5.add("Selenium");
		ar5.add("QTP");

		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Java");
		ar6.add("HTML");
		ar6.add("SQL");

		ar5.addAll(ar6);

		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}

		System.out.println("*************");

		// removeAll:
		ar5.removeAll(ar6);
		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}

		System.out.println("*************");

		// retainAll:
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Test");
		ar7.add("Selenium");
		ar7.add("QTP");

		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Selenium");
		ar8.add("Java");

		ar7.retainAll(ar8);
		for (int i = 0; i < ar7.size(); i++) {
			System.out.println(ar7.get(i));
		}

	}
}
