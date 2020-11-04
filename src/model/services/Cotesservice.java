package model.services;

import java.util.Date;
import java.util.List;

import model.entities.Parcelas;

public interface Cotesservice {
	  List<Parcelas> cotas(int parcelas, Date date, double totalContract);
}
