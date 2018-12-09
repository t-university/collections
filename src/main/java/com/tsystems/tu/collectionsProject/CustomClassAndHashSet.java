/**
 * package with examples used in the T-University
 */
package com.tsystems.tu.collectionsProject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Clase para guardar la información de un planeta, en este caso, el nombre
 * 
 * @author disern
 *
 */
class Planet implements Comparable<Object> {

	private String name;

	Planet(String name) {
		this.name = name;
	}

	Planet() {
		super();
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Planet))
			return false;
		Planet p = (Planet) o;
		return p.name.equals(name);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (!(o instanceof Planet))
			return 0;
		Planet p = (Planet) o;
		return p.name.compareToIgnoreCase(name);

	}

	String getName() {
		return name;
	}

	void setName(String newName) {
		this.name = newName;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public String toString() {
		return name;
	}
}

/**
 * @author disern
 *
 */
public class CustomClassAndHashSet {

	public static void main(String[] args) {
		Set<Planet> sp = new HashSet<>();
		sp.add(new Planet("Mercury"));
		sp.add(new Planet("Venus"));
		sp.add(new Planet("Earth"));
		sp.add(new Planet("Mars"));
		sp.add(new Planet("Jupiter"));
		sp.add(new Planet("Saturn"));
		sp.add(new Planet("Uranus"));
		sp.add(new Planet("Neptune"));
		sp.add(new Planet("Fomalhaut b"));
		Planet p1 = new Planet("51 Pegasi b");
		sp.add(p1);
		Planet p2 = new Planet("51 Pegasi b");
		sp.add(p2);
		System.out.println(p1.equals(p2));
		System.out.println(sp);

		// testing switch
		int direction = 0;
		switch (direction) {
		case 0:
			System.out.println("You are travelling north.");
			break;
		case 1:
			System.out.println("You are travelling east.");
			break;
		case 2:
			System.out.println("You are travelling south.");
			break;
		case 3:
			System.out.println("You are travelling west.");
			break;
		default:
			System.out.println("You are lost.");
		}

		// testing la comparacion de elementos
		Planet planets[] = new Planet[9];
		planets[0] = new Planet("Mercury");
		planets[1] = new Planet("Venus");
		planets[2] = new Planet("Earth");
		planets[3] = new Planet("Mars");
		planets[4] = new Planet("Jupiter");
		planets[5] = new Planet("Saturn");
		planets[6] = new Planet("Uranus");
		planets[7] = new Planet("Neptune");
		planets[8] = new Planet("Fomalhaut b");
		Arrays.sort(planets);
		for (Planet p : planets) {
			System.out.println(p.getName());
		}

	}

}
