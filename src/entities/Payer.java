package entities;

public abstract class Payer {
	private String name;
	private double anualIncome;
	
	
	public abstract double taxPayed();


	public String getName() {
		return name;
	}


	public Payer(String name, double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}


	public Payer() {
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getAnualIncome() {
		return anualIncome;
	}


	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}
}
