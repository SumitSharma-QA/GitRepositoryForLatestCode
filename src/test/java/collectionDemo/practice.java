package collectionDemo;

interface practice {
 // Declared Instance Variable
	 String PAGE="page"; 
	
	void sound();

	// Non-abstract method
	public default void eat() 
		{
			 System.out.println("Eating");
		}

	public static void bark() 
	{
		 System.out.println("woo wooo");
	}

}
