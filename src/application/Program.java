package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Parcelas;
import model.services.OnlinePayment;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Contract contract = null;
		
		System.out.println("Contract Data");
		System.out.print("Number of contract: ");
		int number = sc.nextInt();
		System.out.print("Date of contract (dd/MM/yyyy: ");
		sc.nextLine();
		Date date = sdf.parse(sc.nextLine());
		System.out.println("Enter contract Values: ");
		double totalContract = sc.nextDouble();
		
		List<Parcelas> list = new ArrayList<>();
				
		System.out.println();
		System.out.print("Enter the number of Stallments: ");
		int parcelas = sc.nextInt();
		
		OnlinePayment p = new OnlinePayment();
		list = p.cotas(parcelas, date,totalContract);
		
		 contract = new Contract(number, date, totalContract, list);
		 System.out.println();
		 System.out.println("INSTALMENT:");
		 System.out.println();
		
		for(Parcelas c: list) {
			System.out.println(c.tostring());
		}
		
		
		
		
		
		
		
		
	}

}
