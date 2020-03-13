package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyPayer;
import entities.IndividualPayer;
import entities.Payer;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Payer> payers = new ArrayList<>();
		
		
		System.out.print("Enter the number of tax payers : ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Tax payer #" +(i+1)+" data:");
			System.out.print("Individual or Company (i/c)?");
			char type = sc.next().charAt(0);
			System.out.print("Name : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income : ");
			double anualIncome = sc.nextDouble();
			if(type == 'i') {
				System.out.print("Health expenditures : ");
				double healthExpenditures = sc.nextDouble();
				payers.add(new IndividualPayer(name,anualIncome,healthExpenditures));
			}else if(type == 'c') {
				System.out.print("Number of employees : ");
				int qtdEmployess = sc.nextInt();
				payers.add(new CompanyPayer(name,anualIncome,qtdEmployess));
			}
		}
		System.out.println("Taxes payed:");
		double totalTaxes = 0;
		for(Payer payer : payers) {
			System.out.println(payer);
			totalTaxes += payer.taxPayed();
		}
		System.out.print("Total Taxes :  $ "+ String.format("%.2f", totalTaxes));
		
		
		
		
		
		sc.close();
	}
}
