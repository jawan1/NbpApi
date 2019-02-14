package com.example.demo.model;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Document(collection = "information")
public class Information {

	@Id
	private String idInformation;
    @SerializedName("table")
    @Expose
	private String table;
    @SerializedName("no")
    @Expose
    private String no;
    @SerializedName("effectiveDate")
    @Expose
	private String effectiveDate;
    @SerializedName("rates")
    @Expose
	private Set<Rate> rates;
    
	public String getIdInformation() {
		return idInformation;
	}
	public void setIdInformation(String idInformation) {
		this.idInformation = idInformation;
	}
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Set<Rate> getRates() {
		return rates;
	}
	public void setRates(Set<Rate> rates) {
		this.rates = rates;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((effectiveDate == null) ? 0 : effectiveDate.hashCode());
		result = prime * result + ((idInformation == null) ? 0 : idInformation.hashCode());
		result = prime * result + ((no == null) ? 0 : no.hashCode());
		result = prime * result + ((rates == null) ? 0 : rates.hashCode());
		result = prime * result + ((table == null) ? 0 : table.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Information other = (Information) obj;
		if (effectiveDate == null) {
			if (other.effectiveDate != null)
				return false;
		} else if (!effectiveDate.equals(other.effectiveDate))
			return false;
		if (idInformation == null) {
			if (other.idInformation != null)
				return false;
		} else if (!idInformation.equals(other.idInformation))
			return false;
		if (no == null) {
			if (other.no != null)
				return false;
		} else if (!no.equals(other.no))
			return false;
		if (rates == null) {
			if (other.rates != null)
				return false;
		} else if (!rates.equals(other.rates))
			return false;
		if (table == null) {
			if (other.table != null)
				return false;
		} else if (!table.equals(other.table))
			return false;
		return true;
	}
	
}
