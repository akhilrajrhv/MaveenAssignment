package collectionexample;

import java.util.LinkedList;

public class LinkedlistExample {

	public static void main(String[] args) {
		LinkedList<Integer> obj=new LinkedList<Integer>();//create object for linked list
		obj.add(5);//add elements to linked list
		obj.add(10);
		obj.add(15);
		obj.add(20);
		System.out.println(obj);//display linked list
		System.out.println("List size is:"+obj.size());//display size of the list
		System.out.println(obj.getFirst());//display first element on list
		System.out.println(obj.isEmpty());//check if array is empty or not
		obj.remove(1);
		System.out.println(obj);//display list after remove 2nd element
		

	}

}
