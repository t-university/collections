/**
 * package with examples used in the T-University
 */
package com.tsystems.tu.collectionsProject;

/**
 * Main class
 * @author disern
 */
class Animal {
	public void call() {
		System.out.println("Animal -> moves");
	}
}

/**
 * Dog is-a Animal
 * Example of hierarchical inheritance
 * @author disern
 *
 */
class Dog extends Animal {
	@Override
	public void call() {
		System.out.println("Dog -> walk and run");
	}
}

/**
 * Cat is-a Animal
 * Example of hierarchical inheritance
 * @author disern
 *
 */
class Cat extends Animal {
	@Override
	public void call() {
		System.out.println("Cat -> sleep");
	}
}

/**
 * Reptile is-a Animal
 * Example of hierarchical inheritance
 * @author disern
 *
 */
class Reptile extends Animal {
	@Override
	public void call() {
		System.out.println("Reptile -> carnivor");
	}
}

/**
 * Crocodile is-a Reptile
 * Example of multi-level inheritance
 * @author disern
 *
 */
class Crocodile extends Reptile {
	@Override
	public void call() {
		System.out.println("Crocodile -> aquatic reptiles");
	}
}


/**
 * @author disern
 *
 */
public class TestInheritance {

	public static void main(String args[]) {
		
		Animal a = new Animal(); // a instanceOf Animal
		Animal b = new Dog(); // b instanceOf Dog
		Animal c = new Cat(); // c instanceOf Cat
		Animal r = new Reptile(); // r instanceOf Reptile
		Animal cro = new Crocodile(); // cro instaceOf Crocodile
		

		System.out.println(a instanceof Animal); // true
		System.out.println(b instanceof Animal); // true
		System.out.println(c instanceof Animal); // true

		System.out.println(a instanceof Dog); // false
		System.out.println(b instanceof Dog); // true
		System.out.println(c instanceof Dog); // false

		System.out.println(a instanceof Cat); // false
		System.out.println(b instanceof Cat); // false
		System.out.println(c instanceof Cat); // true
		
		System.out.println(r instanceof Animal);    // true
		System.out.println(r instanceof Reptile);   // true
		System.out.println(r instanceof Crocodile); // false
		
		
		a.call(); // move
		b.call(); // walk and run
		c.call(); // sleep
		r.call(); // carnivor
		cro.call(); // aquatic reptiles

	}

}
