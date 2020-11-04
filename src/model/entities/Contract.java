package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.services.Cotesservice;
import model.services.OnlinePayment;

public class Contract {
	
	private Integer numder;
	private Date contractDate;
	protected Double totalValue;
	
	List <Parcelas> parcelas = new ArrayList<>();

	public Contract() {
		
	}

	public Contract(Integer numder, Date contractDate, Double totalValue, List<Parcelas> parcelas) {
		this.numder = numder;
		this.contractDate = contractDate;
		this.totalValue = totalValue;
		this.parcelas = parcelas;
		
	}

	public Integer getNumder() {
		return numder;
	}

	public void setNumder(Integer numder) {
		this.numder = numder;
	}

	public Date getContractDate() {
		return contractDate;
	}

	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}

	protected Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	
	public void setParcelas(List<Parcelas> list) {
		this.parcelas = (List<Parcelas>) list;
	}
	
	public List<Parcelas> getParcelas(){
		return parcelas;
	}
	
}
