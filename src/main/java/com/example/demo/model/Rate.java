package com.example.demo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rate {

	@SerializedName("currency")
    @Expose
	private String currency;
    @SerializedName("code")
    @Expose
	private String code;
    @SerializedName("mid")
    @Expose
    private Double mid;
    
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Double getMid() {
		return mid;
	}
	public void setMid(Double mid) {
		this.mid = mid;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((mid == null) ? 0 : mid.hashCode());
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
		Rate other = (Rate) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (mid == null) {
			if (other.mid != null)
				return false;
		} else if (!mid.equals(other.mid))
			return false;
		return true;
	}
	
}
