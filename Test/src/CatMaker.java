
public class CatMaker {
	public static void main(String []args){
		System.out.println("Hello There, see these cats.");
		new Cat("Google");
		new Cat("Casper");
		new Cat("Hershal");
	}
}


class Cat {
	
	public Cat(String name){
		System.out.println("Cat; " + name);
	}
}