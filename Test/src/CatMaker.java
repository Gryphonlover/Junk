


public class CatMaker {
	
	public static void main(String []args){
		System.out.println("Hello There, see these cats.");
		new Cat("Google");
		new Cat("Casper");
		// Let's save this Hershal cat that we're creating in a variable.
		Cat x = new Cat("Hershal");	// "x" is like a container for holding Cat objects.
		
		System.out.println("This cat's name is " + x.getName() );
		
		String hershal = new String("Hershal");
		if( x.getName() == hershal ) {
			System.out.println("You probably won't see this printed out because...");
		}
		
		if( x.getName().equals("Hershal")) {
			System.out.println("...a String is an object");
			// Just because two objects have the same value doesn't mean they're the same object.
		}
		
		
		
		// Here's an interesting thing we can do.  We can create a container for Animals and then
		// put Hershal into it because a cat extends Animal.
		Animal y = x;
		System.out.println("Our animal y is a " + y.getAnimalType());
		
		
		
		// We can "cast" an Animal to a Cat, but to be safe, we first make sure that y is a type of Cat.
		// Then we use (Cat) to cast y into a Cat object before we can put it into a Cat container.
		if( y instanceof Cat ) {
			Cat z = (Cat) y;
			System.out.println("After all that moving around, Hershal is still " + z.getName());
		}
		
		
		
		// This is a "for" loop.  It executes the first section before doing anything.
		// Then it always checks if the second section is true before executing each loop, otherwise it quits.
		// It executes the third section every time it finishes a loop.
		for( int i=0 ; i<5 ; i=i+1 ) {
			System.out.println("i is " + i);
			// It's typical to start with zero in a loop like this.
		}
		
		
		// Let's make an array of Cats.  [] means it's an array of zero or more items.
		Cat[]  fourCats = {
				new Cat("Cat Number Zero"),
				new Cat("Cat Number One"),
				new Cat("Cat Number Two"),
				new Cat("Cat Number Three")
		};
		
		// Let's see if we have all four Cats
		for( int j=0; j<4; j++ ) {		// j++ is the same thing as saying j=j+1
			System.out.println("Cat number " + j + " is named " + fourCats[j].getName() );
		}
		
		
		// Here's something REALLY fancy...
		System.out.println("Going back to our Animal y, it holds an object of type " + y.getClass().getName() );
	}
	
}



/**
 *   Let's create a class for all animals.  The only thing it has is a variable for animal type.
 */
class Animal {
	String mAnimalType;
	
	// We don't need a Constructor here: i.e. we don't need a public Animal() {  ...  }  method
	// When we know we won't be using an object directly like this, we can write it like this...
	// public abstract class Animal {
	// That means it's just an abstract thing.  You must create a subclass to do anything with it.
	
	// This sets the type of animal
	// NOTE: "void" here means it doesn't return anything.
	public void setAnimalType( String type ) {
		mAnimalType = type;
	}
	
	
	// This returns the type of animal when you call it
	// NOTE: "String" here means it returns a String object.
	public String getAnimalType() {
		return mAnimalType;
	}
}


class Cat extends Animal {	// The Cat class is a subclass of the Animal class.
	private String mName;	// This is a "variable" which contains a String.  We will use it to save the cat's name
	
	/**
	 * Constructor for the Cat class.
	 * 
	 * @param name		This is part of the documentation, it explains the meaning of the String "name" parameter.
	 * 
	 */
	public Cat(String name){
		System.out.println("Cat; " + name);
		mName = name;		// save the cat's name to the variable we have in the class.
		
		setAnimalType("Cat");	// The Cat class "inherits" the Animal class variables and methods.
					// So we can use them here.
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



