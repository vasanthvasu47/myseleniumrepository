package org.hcl.selenium.selenium;

public class StringClass {
	public static void main(String[] args) {
	
		String name = "vasSASDth";
		String upperCase = name.toUpperCase();
		String lowerCase = name.toLowerCase();
		boolean equals = name.equals("vasSASDth");
		String substring = name.substring(2);
		System.out.println(substring);
		String substring2 = name.substring(2, 7);
		System.out.println(substring2);
		boolean contains = name.contains(name);
		System.out.println(contains);
		System.out.println(equals);
		System.out.println(lowerCase);
		System.out.println(upperCase);

}
}