package exceptionhandling;

import java.util.ArrayList;
import java.util.Collections;

public class Arrarylist {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Ravi");
		al.add("siva");
		al.add("Raja");
		al.add("Som");
		al.add("Ragul");
		
		System.out.println(al);
		
		// remove index 3
		ArrayList al1 = new ArrayList();
		al1.add("Ravi");
		al1.add("siva");
		al1.add("Raja");
		al1.add("Som");
		al1.add("Ragul");
		al1.remove(3);
		
		System.out.println(al1);
		
		//Replace the string
		ArrayList al2 = new ArrayList();
		al2.add(0,"Ravi");
		al2.add(1,"siva");
		al2.add(2,"Raja");
		al2.add(3,"Som");
		al2.add(4,"Ragul");
		
		Collections.replaceAll(al2,"Ravi","Raja");
		
		System.out.println(al2);
		
		
		
		//Size of the string
		
		ArrayList al3 = new ArrayList();
		al3.add("Ravi");
		al3.add("siva");
		al3.add("Raja");
		al3.add("Som");
		al3.add("Ragul");
		
		System.out.println(al3.size());
	} 

}
