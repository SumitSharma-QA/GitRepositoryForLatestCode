package collectionDemo;

public class Child implements practice{


	public void sound() {
		System.out.println("Dog barks");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.sound();
		obj.eat();
		practice.bark();
		System.out.println(practice.PAGE);
		}}
