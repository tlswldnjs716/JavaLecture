package kr.ac.kopo.day09.abs03;

abstract public class Printer {

	private String model;
	
	public Printer() {
		
	}
	public Printer(String model) {
		this.model = model;
	}
	
	abstract public void print();
}
