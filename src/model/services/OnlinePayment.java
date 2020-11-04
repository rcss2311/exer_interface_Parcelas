package model.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import model.entities.Contract;
import model.entities.Parcelas;

public class OnlinePayment implements Cotesservice{
	@Override
	public List<Parcelas> cotas(int parcelas, Date date,double totalContract) {
		List<Parcelas> list = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		Parcelas p = new Parcelas();
		double aux, aux2= totalContract/parcelas;
		for(int i = 1; i<=parcelas; i++) {
			cal.setTime(date);
			cal.add(Calendar.MONTH, 1);
			date = cal.getTime();
			aux =((aux2*0.01)+aux2);
			aux2+=aux2*0.02;
			Parcelas p1 = new Parcelas(date, aux2);
			list.add(p1);
			
		}
		return list;
	}
	
	
}
