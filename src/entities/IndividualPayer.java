package entities;

public class IndividualPayer extends Payer{
	private double healthExpenditures;
	
	public IndividualPayer() {
		super();
	}

	public IndividualPayer(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double taxPayed() {
		double tax = 0;
		if (getAnualIncome() < 20000.00) {
			tax = getAnualIncome() * 0.15;
		}else if(getAnualIncome() >= 20000.00) {
			tax = getAnualIncome() * 0.25;
		}
		if(healthExpenditures > 0) {
			tax -= (healthExpenditures / 2);
		}
		return tax;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	@Override
	public String toString() {
		return getName() + ": $ "+
				String.format("%.2f", taxPayed());
	}
}
