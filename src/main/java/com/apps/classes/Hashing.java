package com.apps.classes;

import java.util.HashMap;

public class Hashing {

	@Override
	public int hashCode() {
		System.out.println("Whenever object is created, hashcode method is called");
		return ((int)'A');
	}
	public static void main(String[] args) {
		System.out.println("Comes hashing");
		Hashing hashing = new Hashing();
		HashMap<Hashing, Integer> hh = new HashMap<Hashing, Integer>();
		hh.put(hashing, 15);
		
	}
}
