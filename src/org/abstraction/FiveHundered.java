package org.abstraction;

public class FiveHundered implements HunderedCc{

	

	



	@Override
	public void hero() {
		System.out.println("HERO");
		
	}

	@Override
	public void honda() {
		System.out.println("HONDA");
		
	}

	@Override
	public void bajaj() {
		System.out.println("BAJAJ");
		
	}
	
	
	public static void main(String[] args) {
		FiveHundered a=new FiveHundered();
		a.bajaj();a.hero();
		a.honda();

		
		
		System.out.println("hey buddy");
		System.out.println("cool");




}




