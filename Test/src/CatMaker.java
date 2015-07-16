
// Everything you type after a "//" is a comment that you can put in your code.

public class CatMaker {
	public static void main(String []args){
		System.out.println("Hello There, see these cats.");
		new Cat("Google");
		new Cat("Casper");
		// Let's save this Hershal cat that we're creating in a variable.
		Cat x = new Cat("Hershal");	// "x" is like a container for holding Cat objects.
		
		System.out.println("This cat's name is " x.getName() );
		
		if( x.getName() == "Hershal" ) {
			System.out.println("You won't see this printed out because...");
		}
		
		if( x.getName().equals("Hershal")) {
			System.out.println("...a String is an object");
			// Just because two objects have the same value doesn't mean they're the same object.
		}
	}
}


/*  Everything within these two markings is also a comment
    and it can go across multiple lines */
    
/**
 *  This is a documentation type of comment.  There are tools which pull out these comments and put them into
 *  the documentation.  It's the two stars that make it different.
 */

class Cat {
	private String mName;	// This is a "variable" which contains a String.  We will use it to save the cat's name
	
	/**
	 * Constructor for the Cat class.
	 * 
	 * @param name		This is part of the documentation, it explains the meaning of the String "name" parameter.
	 * 
	 */
	public Cat(String name){
		System.out.println("Cat; " + name);
		mName = name;		// save the cat's name to a 
	}
	
	/**
	 * This is a "method", which is a function that can take inputs and return an output. 
	 * Return the name of this Cat object.
	 * @return		This returns a String which equals the name of the Cat.
	 */
	public String getName() {
		return mName;
	}
}
