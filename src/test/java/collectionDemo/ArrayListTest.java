package collectionDemo;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		 ArrayList<String> a = new ArrayList<String>();
		    a.add("apple");
		    a.add("banana");
		    a.add("cherry");
		    a.add("mango");
		    a.add("apple");
		    System.out.println(a);
		    a.remove(0);
		   System.out.println(a); 
		   Boolean result= a.contains("orange"); 
		   if(result.equals(true)){
		       System.out.println("Orange is found");
		   }else{
		        System.out.println("Orange is not found");
		   }
		   
		   System.out.println("Size of arrayList : " + a.size());
		   
		   for(int i=0 ; i<a.size(); i++){
		       System.out.println(a.get(i));
		   }
	}
}
