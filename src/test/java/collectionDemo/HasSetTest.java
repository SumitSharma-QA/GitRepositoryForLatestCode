package collectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hset = new HashSet<String>();
		hset.add("USA");
		hset.add("India");
		hset.add("UK");
		hset.add("India");
		System.out.println(hset);
		System.out.println(hset.remove("UK"));
		System.out.println(hset.isEmpty());
		System.out.println(hset.size());
		
		Iterator<String> it = hset.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
	}

}
