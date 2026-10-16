package collectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "sumit");
		hm.put(11, "kumar");
		hm.put(42, "sharma");
		hm.put(1, "USA");
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
		
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		
		while(it.hasNext()) {
			
			Map.Entry map = (Map.Entry)it.next();
			System.out.println(map.getKey());
			System.out.println(map.getValue());
		}
		
		
		
	}

}
