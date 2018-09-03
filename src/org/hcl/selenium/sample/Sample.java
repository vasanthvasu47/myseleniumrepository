package org.hcl.selenium.sample;

public class Sample extends Country  {
	
	public void tamil() {
		System.out.println("tamil");

	}
	public static void main(String[] args) {
	
		Sample sam= new Sample();
		sam.tamil();
		sam.india();
		sam.australia();
	}

}
