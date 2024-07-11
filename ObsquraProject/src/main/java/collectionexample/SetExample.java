package collectionexample;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> obj=new LinkedHashSet<String>();
		obj.add("Akhil");
		obj.add("Nanditha");
		obj.add("Thanvika");
		obj.add("Hillview");
		System.out.println(obj);
		
		boolean s=obj.contains("Akhil123");
		System.out.println(s);
		

	}

}
