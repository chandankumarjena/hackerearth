package com.chandan.basicprogramming.implemantation;

import java.util.HashMap;
import java.util.Map;

public class Rotate {
	public void finalize() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"hello");
		map.put(02,"hi");
		map.put(3,"bye");
		
		System.out.println(map.getOrDefault(2, "not found") + " ");
		System.out.println(map.getOrDefault(5, "not found"));
	}

}
