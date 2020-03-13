package entities;

public class CompanyPayer  extends Payer{
	private double qtdEmployees;

	@Override
	public double taxPayed() {
		double tax = 0.0;
		if(qtdEmployees > 10) {
			tax = getAnualIncome() * 0.14;
		}else {
			tax = getAnualIncome() * 0.16;
		}
		
		
		return tax;
	}

	public CompanyPayer() {
		super();
	}

	public CompanyPayer(String name, double anualIncome, double qtdEmployees) {
		super(name, anualIncome);
		this.qtdEmployees = qtdEmployees;
	}

	public double getQtdEmployees() {
		return qtdEmployees;
	}

	public void setQtdEmployees(double qtdEmployees) {
		this.qtdEmployees = qtdEmployees;
	}
	@Override
	public String toString() {
		return getName() + ": $ "+
				String.format("%.2f", taxPayed());
	}
}
