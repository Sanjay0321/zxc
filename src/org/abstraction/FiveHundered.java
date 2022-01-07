package org.abstraction;

public class FiveHundered implements HunderedCc,Abstraction {

	@Override
	public void tvs() {
		System.out.println("TVS");
		
	}

	@Override
	public void bmw() {
		System.out.println("BMW");
		
	}

	@Override
	public void yamaha() {
		System.out.println("YAMAHA");
		
	}

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
		a.bajaj();a.bmw();a.hero();
		a.honda();
		a.tvs();a.yamaha();
	}
}




