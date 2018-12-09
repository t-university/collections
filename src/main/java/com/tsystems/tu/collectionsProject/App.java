package com.tsystems.tu.collectionsProject;

/**
 * Tests
 * @author disern
 *
 */
public class App {

	/**
	 * Método que multiplica dos enteros dados
	 * @param i
	 * @param j
	 * @return
	 */
	public int multiply(int i, int j) {
	    // catch an exception
	    if (i < 0) {
	      throw new IllegalArgumentException("only positive values allowed");
	    }		
		return i * j;
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
