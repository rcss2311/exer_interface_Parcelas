package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
	
	private Date primeiraparcela;
	private Double valorParcela;
	
	public Parcelas() {
		
	}

	public Parcelas(Date primeiraparcela, Double valorParcela) {
		
		this.primeiraparcela = primeiraparcela;
		this.valorParcela = valorParcela;
	}

	public Date getPrimeiraparcela() {
		return primeiraparcela;
	}

	public void setPrimeiraparcela(Date primeiraparcela) {
		this.primeiraparcela = primeiraparcela;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}
	
	public double valParcela(int parcelas,double totalcontract) {
		return totalcontract/parcelas;
	}
	
	public String tostring() {
		return ""+sdf.format(primeiraparcela)+
				" - "			 +
				 valorParcela;
	}
	
}
